
class calc
{
    public int add(int nums[])
    {
        int result=0;
        for (int a:nums) {
            result=result+a;
        }
        return result;
    }
}
public class SumArray {
    public static void main(String[] args) {
    int a[]={2,4,6,1};
    calc obj=new calc();
    int res=obj.add(a);
    System.out.println(res);
    }
}
