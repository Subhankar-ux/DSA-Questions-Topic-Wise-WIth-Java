package BasicMath;

public class binarySearchSqrt {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;
        System.out.printf("%.3f\n",sqrt(n,p));
    }

    static double sqrt(int n,int p){
        int s = 0;
        int e =n;

        double root = 0.0;
        while(s<=e){
            int m = s + (e -s)/2 ;

            if(m*m < n){
                s = m + 1;
            }else if(m*m>n){
                e = m -1;
            }else {
                root = m;
                return root;
            }
        }

        double inc = 0.1;
        for (int i=0;i<3;i++){
            while (root * root<=n){
                root = root + inc;
            }
            root -= inc;
            inc/=10;

        }
        return root;
    }
}
