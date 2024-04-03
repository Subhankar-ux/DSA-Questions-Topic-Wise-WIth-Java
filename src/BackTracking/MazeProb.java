package BackTracking;

import java.util.ArrayList;

public class MazeProb {
    public static void main(String[] args) {
        int count = countPaths("",3,3);
        System.out.println(count);
        printPath("",3,3);
        System.out.println(retListOfPaths("",3,3));
    }
    //Here only go down, and go left are allowed
    static int countPaths(String p,int r,int c){
        if (r==1 || c==1){
            return 1;
        }

        int left = countPaths(p+'D',r-1,c);
        int right = countPaths(p+'R',r,c-1);

        return left + right;
    }

    //Here only go down, and go left are allowed
    static void printPath(String p,int r,int c){
        if (r==1 && c==1){
            System.out.println(p);
            return;
        }
        if (r>1){
            printPath(p+'D',r-1,c);
        }
        if (c>1){
            printPath(p+'R',r,c-1);
        }
    }

    //Here only go down, and go left are allowed
    static ArrayList<String> retListOfPaths(String p,int r,int c){
        if (r==1 && c==1){
            ArrayList<String>list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String>list = new ArrayList<>();
        if (r>1){
            list.addAll(retListOfPaths(p+'D',r-1,c));
        }
        if (c>1){
            list.addAll(retListOfPaths(p+'R',r,c-1));
        }
        return list;
    }

}
