package BackTracking;

import java.util.ArrayList;

public class MazeWithVDH {
    public static void main(String[] args) {
        printPath("",3,3);
        System.out.println(retListPath("",3,3));
    }
    //Here v--> vertically,D-->Diagonally,H-->Horizontally move are allowed
    // to reach the target at the last cell of the maze
    static void printPath(String p,int r,int c){
        if (r==1 && c==1){
            System.out.println(p);
            return;
        }
        if (r>1 && c>1){
            printPath(p+'D',r-1,c-1);
        }
        if (r>1){
            printPath(p+'V',r-1,c);
        }
        if (c>1){
            printPath(p+'H',r,c-1);
        }
    }
    static ArrayList<String > retListPath(String p, int r, int c){
        if (r==1 && c==1){
            ArrayList<String>list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String>list = new ArrayList<>();
        if (r>1 && c>1){
            list.addAll(retListPath(p+'D',r-1,c-1));
        }
        if (r>1){
           list.addAll(retListPath(p+'V',r-1,c));
        }
        if (c>1){
            list.addAll(retListPath(p+'H',r,c-1));
        }

        return list;
    }
}
