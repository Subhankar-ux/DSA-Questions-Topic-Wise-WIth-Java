package OOPs;

public class WrapperClassExample {
    public static void main(String[] args) {
        int a = 10;
        Integer num = 45;
        Integer num1 = 10;
        int b =40;
        swap(a,b);
        swap(num,num1);
        System.out.println(a+" "+b);
        System.out.println(num+" "+num1);
        //final int bonus = 2;
        //bonus = 3;
        final A kunal = new  A("Kunal");
        kunal.name = "other name";

        A obj;
        for (int i=0;i<1000000000;i++){
            obj=new A("Random Name");
        }

        //when a non - primitive is final ,you cannot reassign it.
        //kunal = new A("New object");

    }
   static void swap(Integer a,Integer b){
        Integer temp = a;
        a = b;
        b=temp;
    }
}
class A{
    final int num=10;
    String name;
    public A(String name){
        //System.out.println("Object is created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
       // super.finalize();
        System.out.println("Object is destroyed");
    }
}
