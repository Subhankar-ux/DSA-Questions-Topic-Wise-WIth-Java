package com.Kunal;

public class PatternQuestions {
    public static void main(String[] args) {
        //pattern1(5);
        //pattern2(5);
       // pattern4(5);
        //pattern5(5);
        //pattern6(5);
        //pattern7(5);
        //pattern8(5);
        pattern9(4);

    }
    static void pattern1(int n){
        for (int i =1;i<=n;i++){
            for (int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int i = 0;i<n;i++){
            for (int j = 0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for (int i = 1;i<=n;i++){
            for (int j = 1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for (int row=0;row<2*n;row++){
            int totalColsInRow = row>n ? 2*n-row:row;
            for (int col = 0;col<totalColsInRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for (int row = 0 ;row<2*n;row++){
            int totalColInRow = row>n ? 2*n-row:row;

            int spaces = n - totalColInRow;
            for (int j = 0;j<spaces;j++){
                System.out.print(" ");
            }
            for (int col = 0;col<totalColInRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern7(int n){

        for (int i =1;i<=n;i++){
            int spaces = n-i;
            for (int j = 1;j<=spaces;j++){
                System.out.print("  ");
            }
            for (int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            for (int j = 2;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern8(int n){
        for (int i =1;i<2*n;i++){
            int c= i>n?2*n-i:i;
            int spaces = n-c;
            for (int j = 1;j<=spaces;j++){
                System.out.print("  ");
            }
            for (int j=c;j>=1;j--){
                System.out.print(j+" ");
            }
            for (int j = 2;j<=c;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern9(int n){
     int originalN = n;
     n = 2*n;
     for (int i =0;i<=n;i++){
         for (int j =0;j<=n;j++){
             int atEveryIndex = originalN - Math.min(Math.min(i,j),Math.min(n-j,n-i));
             System.out.print(atEveryIndex+" ");
         }
         System.out.println();
     }

    }
}
