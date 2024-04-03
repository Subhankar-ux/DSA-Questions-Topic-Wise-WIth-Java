package Recursion;

public class PrintNos {
    public static void main(String[] args) {
        int n =5;
       // print(n);
       // revPrint(n);
        combPrint(n);
    }

    static void combPrint(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        combPrint(n-1);
        System.out.println(n);
    }
    static void print(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
    }

    static void revPrint(int n){
        if (n==0){
            return;
        }

        revPrint(n-1);
        System.out.println(n);
    }
}
