package eceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            //int c = a/b;
            String name = "kunal";
            if (name.equals("kunal")){
                throw new MyException("name is kunal");
            }
        }
        catch (MyException e) {
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("this will always execute");
        }
    }
    static int divide(int a,int b) throws ArithmeticException{
        if (b==0){
            throw new ArithmeticException("please do not divide by zero");
        }
        return a/b;
    }
}
