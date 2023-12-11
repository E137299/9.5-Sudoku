public class Main{
    public static void main(String[] args){
        Sudoku game = new Sudoku();

        //Start timer
        long startTime = System.currentTimeMillis();
        // Call the generateBoard method here
        game.generateBoard(); 
        //End timer
        long endTime = System.currentTimeMillis();
        // Calculate the time that the generateBoard method took to run.
        long duration = endTime - startTime;

        System.out.println("\n\nTime taken by the method: " + duration + " millisecond.\n");
        game.displayBoard();
    }
}