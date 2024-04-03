package BackTracking;

public class NKnights {
    public static void main(String[] args) {
      int n=4;
      boolean[][]board = new boolean[n][n];
      knights(board,0,0,4);
    }
    static void knights(boolean[][]board,int row,int col,int knights){
        if (knights==0){
            display(board);
            System.out.println();
            return;
        }
        if (row== board.length-1 && col==board.length){
            return;//it means we have reached the last cell,so please return
        }
        if (col == board.length){
            knights(board,row+1,0,knights);
            return;
        }
        if (isSafe(board,row,col)){
            board[row][col]=true;
            knights(board,row,col+1,knights-1);//as one knight placed
            board[row][col]=false;//backtracking
        }
        knights(board,row,col+1,knights);//move ahead if you fail to place a knight in the cell
    }

    static boolean isSafe(boolean[][]board,int row,int col){
        if (isValid(board,row-2,col-1)){
            if (board[row-2][col-1]){
                return false;//because in that particular cell a knight is already placed
            }
        }
        if (isValid(board,row-2,col+1)){
            if (board[row-2][col+1]){
                return false;//because in that particular cell a knight is already placed
            }
        }
        if (isValid(board,row-1,col+2)){
            if (board[row-1][col+2]){
                return false;//because in that particular cell a knight is already placed
            }
        }
        if (isValid(board,row-1,col-2)){
            if (board[row-1][col-2]){
                return false;//because in that particular cell a knight is already placed
            }
        }

        return true;

    }


    //do not repeat your self ,hence created this function
    static boolean isValid(boolean[][]board,int row,int col){
        //basically it will check whether the index out of bound or not
        if (row>=0 && row<board.length && col>=0 && col< board.length){
            return true;
        }
        return false;
    }
    public static void display(boolean[][]board){
        for (boolean[]row:board){
            for (boolean element:row){
                if (element){
                    System.out.print("K ");
                }else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
