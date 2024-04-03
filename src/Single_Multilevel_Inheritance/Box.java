package Single_Multilevel_Inheritance;
public class Box {
   private double l;
    double w;
    double h;
   static void greetings(){
       System.out.println("Hey,I am in Box class.Greetings!");
   }

   //getter method
   public double getL(){
       return l;
   }
    Box(){
        this.l= -1;
        this.w= -1;
        this.h= -1;
    }

    //cube
    Box(double side){
        this.l = side;
        this.w = side;
        this.h = side;
    }
    Box(double l, double w, double h){
        this.l = l;
        this.w = w;
        this.h = h;
    }

    //Copy constructor
    Box(Box old){
        this.l=old.l;
        this.w = old.w;
        this.h = old.h;
    }

    public void information(){
        System.out.println("Running the inheritance");
    }
}
