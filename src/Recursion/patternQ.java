package Recursion;

public class patternQ {
    public static void main(String[] args) {
        int r=4;
        int c=0;
        pattern(r,c);
    }
    static void pattern(int r,int c){
        if (r==0){
            return;
        }
        if (c<r){
            System.out.print(" * ");
            pattern(r,c+1);
        }else {
            System.out.println("");
            pattern(r-1,0);
        }
    }
}
