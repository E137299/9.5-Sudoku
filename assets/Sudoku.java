public class Sudoku{
    //Attributes
    int[][] grid;

    public Sudoku(){
        grid = new int[9][9];
    }

    public int[][] generateBoard(){

        /* Your code here */
        
    }

    public void displayBoard(){
        System.out.println(" ----------------------");
        for(int y = 0; y < 9; y++){
            for(int x = 0; x < 9; x++){
                if(x%3==0){
                    System.out.print("| ");
                }
                System.out.print(grid[y][x]+" ");
            }
            if (y%3==2){
                System.out.println("|\n -----------------------");
            }else{
                System.out.println("|");
            }
        }
        System.out.println();
    }

}