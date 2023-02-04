class calc
{
    public int add(int n1,int n2)
    {
        int result=n1+n2;
        return result;
    }
    public int add(int n1,int n2,int n3)
    {
        int result=n1+n2+n3;
        return result;
    }
    public double add(double n1,double n2)
    {
        double result=n1+n2;
        return result;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        calc obj=new calc();
        int res1=obj.add(2,3);
        int res2=obj.add(2,3,4);
        double res3=obj.add(2.4,4.66);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}
