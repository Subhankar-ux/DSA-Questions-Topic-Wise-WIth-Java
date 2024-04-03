package OOPs;

import java.util.Arrays;

public class Basics {
    public static void main(String[] args) {
       // Student[]students = new Student[5];
        //System.out.println(Arrays.toString(students));//when the student are not initialized then it will be null
        //students[0] .marks = 45;
        //Student student1 = new Student();
        Student kunal;
        kunal=new Student(15,"Kunal",88.57f);
        Student rahul = new Student();
        System.out.println(rahul.rno);
        System.out.println(rahul.name);
        System.out.println(rahul.marks);
//        kunal.name = "Kunal";
//        kunal.rno = 13;
//        kunal.marks = 88.57f;

       System.out.println(kunal.name);
       System.out.println(kunal.rno);
       System.out.println(kunal.marks);
       // kunal.greet();
        Student random = new Student(kunal);
        System.out.println(random.name);
        System.out.println(random.rno);
        System.out.println(random.marks);

        Student st = new Student();
        System.out.println(st.name);

        Student one = new Student();
        Student two = one;
        one.name = "Something Something";
        System.out.println(two.name);

    }
}
 class Student{
    int rno;
    String name;
    float marks;
   void greet(){
       System.out.println("Hello ,my name is "+this.name);
   }
   Student (){
       //this is how you call a constructor from another constructor
       //internally: new Student(46,"Subhankar",90.0f);
       this(46,"Subhankar",90.0f);
   }
    //creating constructor for Student class
    Student(int a,String b,float c){
        this.rno = a;
       this. name = b;
       this. marks = c;
    }

    //Constructor overloading
    Student(Student other){
       this.name = other.name;
       this.rno = other.rno;
       this.marks = other.marks;
    }
}
