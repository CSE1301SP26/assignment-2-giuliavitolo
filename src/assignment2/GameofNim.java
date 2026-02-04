import java.util.Scanner;

public class GameofNim {
    public static void main(String[] args) {
//1. Setup
    System.out.println("How many sticks would you like to start with?");
    Scanner in = new Scanner(System.in);
    int sticks = in.nextInt();
    boolean playersTurn = true;

//2. Loop
    while (sticks > 0){
        if (playersTurn) {
            System.out.println("Would you like to take 1 or 2 sticks?");
            int takenSticks = in.nextInt();
            sticks = sticks - takenSticks;
            System.out.println("There are " + sticks + " sticks left.");
            playersTurn = false;
            } 
        else {
            int computersTurn = (int) (Math.random()*2)+1 ;
            System.out.println("Your opponent took " + computersTurn + " sticks.");
            sticks = sticks - computersTurn;
            System.out.println(sticks + " sticks remain.");
            playersTurn = true;
        }
        //3. Winner
        if (sticks <= 0) {
            if (playersTurn) {
            System.out.println("You lose...");
        }
        else {
            System.out.println("You win!");
        }
        }

        }
in.close();
    }
    }
    

