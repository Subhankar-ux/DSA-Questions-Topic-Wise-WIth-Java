package Single_Multilevel_Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(4.6,7.9,9.9);
//        Box box2 = new Box(box1);
//        System.out.println(box2.h+" "+box2.l+" "+box2.w);
//
//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(5.5,8,9,6);
//        System.out.println(box3.h+" "+ box3.weight);

//        Box box5 = new BoxWeight(2,3,4,5);
//        System.out.println(box5);

        //BoxPrice box = new BoxPrice();

        Box.greetings();
       double s = box1.getL();

    }
}
