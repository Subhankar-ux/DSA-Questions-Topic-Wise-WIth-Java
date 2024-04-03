package OOPs;

public class Main2 {
    public static void main(String[] args) {
       SingletonClass obj = SingletonClass.getInstance();
       SingletonClass obj1 = SingletonClass.getInstance();
       SingletonClass obj2 = SingletonClass.getInstance();
    }//all three reference variable are pointing to just one object
}
