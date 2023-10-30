import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        Random rnd = new Random();
    int die1 = 0;
    int die2 = 0;
    boolean done = false;
    String again = "";
    do
    {
        die1 = rnd.nextInt(6) + 1;
        die2 = rnd.nextInt(6) + 1;
        int total = die1 + die2;

        System.out.println("Die1: " + die1);
        System.out.println("Die2: " + die2);
        System.out.println("You rolled a: " + total);
        if(total == 2)
        {
            System.out.println("Your value is 2. You crapped out!");
            System.out.println("Would you like to play again?[Y, N]");
            again = in.nextLine();
            if(again.equalsIgnoreCase("n"))
            {
                done = true;
            }
        }
        else if(total == 3)
        {
            System.out.println("Your value is 3. You crapped out!");
            System.out.println("Would you like to play again?[Y, N]");
            again = in.nextLine();
            if(again.equalsIgnoreCase("n"))
            {
                done = true;
            }
        }
        else if(total == 12)
        {
            System.out.println("Your value is 12. You crapped out!");
            System.out.println("Would you like to play again?[Y, N]");
            again = in.nextLine();
            if(again.equalsIgnoreCase("n"))
            {
                done = true;
            }
        }
        else if(total == 7)
        {
            System.out.println("Your value is 7. You WIN!");
            System.out.println("Would you like to play again?[Y, N]");
            again = in.nextLine();
            if(again.equalsIgnoreCase("n"))
            {
                done = true;
            }
        }
        else if(total == 11)
        {
            System.out.println("Your value is 11. You WIN!");
            System.out.println("Would you like to play again?[Y, N]");
            again = in.nextLine();
            if(again.equalsIgnoreCase("n"))
            {
                done = true;
            }
        }
    }while(!done);








    }








    }