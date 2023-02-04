public class InstanceVaraiableAndLocalVariable {
    String name="Aashu";  //Instance variable
    int age=21;
    int a;
    String str;
    public static void main(String[] args) {
        String lastName="Gupta";   //Local Variable

        InstanceVaraiableAndLocalVariable obj1=new InstanceVaraiableAndLocalVariable();
        InstanceVaraiableAndLocalVariable obj2=new InstanceVaraiableAndLocalVariable();
        obj1.name="Ankit";
        obj1.age=23;

        System.out.println(obj1.name+" "+lastName);
        System.out.println(obj1.age );
        System.out.println(obj2.name+" "+lastName);
        System.out.println(obj2.age );
        System.out.println(obj1.a );
        System.out.println(obj1.str );
    }
}

