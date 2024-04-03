package BackTracking;

public class MazeWithObstacles {
    public static void main(String[] args) {
        boolean [][]maze = {
                {true,true,true},
                {true,false,true},//false represents the obstacles/resistance
                {true,true,true},
        };
        pathRestrictions("",maze,0,0);
    }
    static void pathRestrictions(String p,boolean[][]maze,int r,int c){
        if (r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        //for countering the resistance , we cannot go into further more calls
        if (!maze[r][c]){
            return;
        }
        //maze.length - 1 represents the last row of the maze
        if (r< maze.length-1){
            pathRestrictions(p+'D',maze,r+1,c);
        }
        if (c<maze[0].length-1){
            pathRestrictions(p+'R',maze,r,c+1);
        }
    }
}
