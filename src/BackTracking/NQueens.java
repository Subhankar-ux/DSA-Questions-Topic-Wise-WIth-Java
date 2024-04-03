package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public static void main(String[] args) {
        int n =4;
        boolean[][]board = new boolean[n][n];
        System.out.println(queens(board,0));
    }

    static int queens(boolean [][]board,int row){
        if (row== board.length){
            display(board);
            System.out.println();
            return 1;//found one answer when it hits the base condition basically when row becomes ,out of range
        }
        int count =0;
        //placing the queens and checking for every row and col
        for (int col=0;col<board.length;col++){
            //place the queen if it is safe to place
            if (isSafe(board,row,col)){
                board[row][col]=true;//true means we have placed the queen, successfully
                count = count + queens(board,row+1);
                board[row][col]=false;//changes made due to function call , making same as it was previous #Backtracking
            }
        }
        return count;
    }

    static boolean isSafe(boolean[][]board,int row,int col){
        //check vertical row i.e. above row are checking is there any Queen already present or not
        for (int i=0;i<row;i++){
            if (board[i][col]){
                return false;//board[i][col]=true ,that means it contains a Queen already
                //it is not safe to put a queen at board[row][col]
            }
        }

        //for left diagonal check
        int maxLeft = Math.min(row,col);
        for (int i=1;i<=maxLeft;i++){
            if (board[row-i][col-i]){
                return false;//board[row-i][col-i] = true , that means we have found a queen which is already placed
                //in the left diagonal of the given cell
            }
        }
        //for right diagonal check
        int maxRight = Math.min(row,board.length-1-col);
        for (int i=1;i<=maxRight;i++){
            if (board[row-i][col+i]){
                return false;//we have found an Q at the right diagonal, please return don't need check further recursion calls
            }
        }
        return true;
    }

    public static void display(boolean[][]board){
        for (boolean[]row:board){
            for (boolean element:row){
                if (element){
                    System.out.print("Q ");
                }else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

}
