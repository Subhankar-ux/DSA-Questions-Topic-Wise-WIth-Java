package BasicMath;

public class NewtonSQRT {
    public static void main(String[] args) {
     int n=16;
        System.out.println(sqrt(n));
    }
    //using newton - raphson method
    //formula is : actual root = (guessed root + (num/guessed root))/2;
    static double sqrt(int n){
        double x = n;
        double root = 0.0;
        while (true){
            root =0.5*( x + (n/x));

            if (Math.abs(root-x)<1){
                break;
            }
            x=root;
        }
        return root;
    }
}
