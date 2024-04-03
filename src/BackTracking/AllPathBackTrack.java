package BackTracking;
//Maze prob
public class AllPathBackTrack {
    public static void main(String[] args) {
       boolean[][]maze = {
               {true,true,true},
               {true,true,true},
               {true,true,true}
       } ;
       allPath("",maze,0,0);
    }

    static void allPath(String p,boolean[][]maze,int r,int c){
        //base condition is like when we have reached the last cell
        if (r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if (!maze[r][c]){
            return;
        }
        maze[r][c]=false;//marking that already visited
        if (r< maze.length-1){
            allPath(p+'D',maze,r+1,c);//Going to down
        }
        if (c<maze[0].length-1){
            allPath(p+'R',maze,r,c+1);//Going to right
        }
        if (r>0){
            allPath(p+'U',maze,r-1,c);//Going to up
        }
        if (c>0){
            allPath(p+'L',maze,r,c-1);//Going to Left
        }
        //here function ends
        //so when we are returning /removing this from stack we have to make our maze object same as it was previous
        maze[r][c]=true;//remarking those when we are returning to the above functions calls
        //basically we are making those cells as it was previous .
    }
}
