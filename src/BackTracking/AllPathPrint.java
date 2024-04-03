package BackTracking;

import java.util.Arrays;

public class AllPathPrint {
    public static void main(String[] args) {
        boolean [][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][]path = new int[board.length][board[0].length];
        allPathPrint("",board,path,1,0,0);
    }

    static void allPathPrint(String p,boolean[][]maze,int[][]path,int step,int r,int c){
        if (r== maze.length-1 && c==maze[0].length-1){
            path[r][c]=step;
            for (int[]arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        path[r][c]=step;
        if (r<maze.length-1){
            allPathPrint(p+'D',maze,path,step+1,r+1,c);
        }
        if (c<maze[0].length-1){
            allPathPrint(p+'R',maze,path,step+1,r,c+1);
        }
        if (r>0){
            allPathPrint(p+'U',maze,path,step+1,r-1,c);
        }
        if (c>0){
            allPathPrint(p+'L',maze,path,step+1,r,c-1);
        }

        //use backtracking to make the paths object and maze object as it was previous
        maze[r][c]=true;
        path[r][c]=0;
    }
}
