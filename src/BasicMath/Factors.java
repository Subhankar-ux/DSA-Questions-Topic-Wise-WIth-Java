package BasicMath;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        int n = 20;
        factor2(n);
    }

    //brute force solution with O(n)
    static void factor(int n){
        for (int i =1;i<=n;i++){
            if (n%i == 0){
                System.out.print(" "+ i);
            }
        }
    }

    //optimize solution with O(square_root(N)) by ignoring repeating cases
    static void factor1(int n){
        for (int i =1;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                if (n/i == i){
                    System.out.print(" "+ i);
                }
                System.out.print( i + " " + n/i+" ");

            }
        }
    }

    //with an ascending order with O(sqrt(n)) in both of time and space complexity
    static void factor2(int n){
        ArrayList<Integer>list = new ArrayList<>();
        for (int i =1;i<=Math.sqrt(n);i++){

            if(n%i == 0){
                if (n/i == i){
                    System.out.print(" "+ i);
                }
                System.out.print( i + " " );
                list.add(n/i);

            }
        }

        for (int i = list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }
}
