package OOPs;

public class Main {
    public static void main(String[] args) {
//        Human kunal = new Human(25,"Kunal",10000,false);
//        Human rahul = new Human(20,"Rahul",15000,true);
//        Human arpit = new Human(29,"Arpit",12000,true);
//        System.out.println(kunal.name);
        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);
        //fun();
        Main funn = new Main();
        funn.fun2();
    }

    //this is not dependent on objects
    static void fun(){
       // greeting();//you cant use it because it requires an instance
        //but the function you are using it in does not depend on instance

        //you cannot access  non - static stuff without referencing their
        // instances in a static context

        //hence , here I am referencing it
        Main ob = new Main();
        ob.greeting();
    }
    //we know that something which is not static ,belongs to an object
    //this method belongs to an object

    void fun2(){
        greeting();
    }
    void greeting(){
        System.out.println("Hello World");
    }
}
