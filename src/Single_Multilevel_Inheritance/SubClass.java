package Single_Multilevel_Inheritance;

import AccessModifiers.A;

public class SubClass extends A {
    public SubClass(int num, String name) {
        super(num, name);

    }

    public static void main(String[] args) {
       // A obj = new A(45,"Subha");
        //int n = obj.num;
        SubClass obj = new SubClass(45,"Kiran");
        System.out.println(obj instanceof Object);
        System.out.println(obj.getClass());
    }
}

class SubSubClass extends SubClass{

    public SubSubClass(int num, String name) {
        super(num, name);
    }
    public static void main(String[] args) {
        SubSubClass obj = new SubSubClass(45,"Subha");
        int n = obj.num;
    }
}

class SubClass2 extends A{
    public SubClass2(int num,String name ){
        super(num, name);
    }

    public static void main(String[] args) {
     SubClass2 obj = new SubClass2(45,"Subha");

    }
}
