package OOPs;

public class InnerClasses {

   static class Test{
        String name;//as it is static,it will be same for everyone ,
        // whenever we update it, it will occur for all object as same
        Test(String name){
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Test a = new Test("Kunal");
        Test b = new Test("Shubho");
        Test c= new Test("Bablu");
        System.out.println(a.name);
        System.out.println(b.name);
        System.out.println(c.name);
    }
}




