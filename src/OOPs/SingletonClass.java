package OOPs;

public class SingletonClass {
    private SingletonClass(){

    }

    private static SingletonClass instance;
    public static SingletonClass getInstance(){
        //check whether 1 obj only created or not
        if (instance == null){
            instance = new SingletonClass();
        }
        return instance;
    }
}
