package Assignement_3;
//Maze Solver 🕹️: Build and solve virtual mazes.

//Interface for Maze operations
interface MazeOperations {
 void displayMaze();
 boolean solveMaze(int x, int y);
}

//Abstract class for Maze
abstract class AbstractMaze {
 protected int[][] maze;
 protected int rows;
 protected int cols;

 public AbstractMaze(int[][] maze) {
     this.maze = maze;
     this.rows = maze.length;
     this.cols = maze[0].length;
 }

 public abstract void displayMaze();
}

//Concrete class for Maze Solver
class MazeSolver extends AbstractMaze implements MazeOperations {
 public MazeSolver(int[][] maze) {
     super(maze);
 }

 @Override
 public void displayMaze() {
     for (int i = 0; i < rows; i++) {
         for (int j = 0; j < cols; j++) {
             System.out.print(maze[i][j] + " ");
         }
         System.out.println();
     }
 }

 @Override
 public boolean solveMaze(int x, int y) {
     // Base case: if (x, y) is the bottom-right corner
     if (x == rows - 1 && y == cols - 1) {
         maze[x][y] = 2; // Mark the path
         return true;
     }

     // Check if maze[x][y] is valid
     if (isSafe(x, y)) {
         maze[x][y] = 2; // Mark the path

         // Move forward in x direction
         if (solveMaze(x + 1, y)) {
             return true;
         }

         // If moving in x direction doesn't lead to a solution
         // then move down in y direction
         if (solveMaze(x, y + 1)) {
             return true;
         }

         // If none of the above movements work then
         // BACKTRACK: unmark x, y as part of solution path
         maze[x][y] = 0;
         return false;
     }
     return false;
 }

 private boolean isSafe(int x, int y) {
     return (x >= 0 && x < rows && y >= 0 && y < cols && maze[x][y] == 0);
 }
}

//Main class
public class demo2 {
 public static void main(String[] args) {
     int[][] maze = {
         {0, 0, 0, 0},
         {0, 1, 1, 0},
         {0, 0, 0, 0},
         {1, 1, 0, 0}
     };

     MazeSolver solver = new MazeSolver(maze);
     System.out.println("Original Maze:");
     solver.displayMaze();

     if (solver.solveMaze(0, 0)) {
         System.out.println("Solved Maze:");
         solver.displayMaze();
     } else {
         System.out.println("No solution exists.");
     }
 }
}