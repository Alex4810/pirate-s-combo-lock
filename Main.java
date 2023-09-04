import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args)
    {
        intro();
        int[] lock = lock();

        // Create an empty guess array
        int[] guess = new int[4];
        runGame(lock, guess);


    }
    public static boolean unlocked = false;
    public static void intro()
    {
        System.out.println("Ahoy, matey! Welcome to 'Pirate's Combo Lock'!" +
                "\nYe be a fearless pirate on a quest to unlock hidden treasure chests by crackin' the combo locks. " +
                "\nThe riches be awaitin', but ye have only a limited number of attempts." +
                "\nCan ye outsmart the locks and claim the booty, or will ye face defeat?" +
                "\nGet ready to embark on a thrilling adventure and see if ye have what it takes to be a true pirate!");
    }
    public static int[] lock()
    {
        int[] combo = new int[4];
        Random rand = new Random();
        for(int i = 1; i<=4; i++)
        {
            combo[i] = rand.nextInt(10);
        }
        return combo;
    }

    public static int[] guess()
    {
        int[] combo = new int[4];

        return combo;
    }

    public static void runGame(int[]lock, int[] guess)
    {
        Scanner scan = new Scanner(System.in);
        int combos = 0;
        for(int i = 1; i <= 4; i++)
        {
            System.out.println("Guess the number in combo lock slot " + i + ":");
            guess[i] = scan.nextInt();
        }
        for(int i = 1; i <= 4; i++)
        {
            if(lock[i] == guess[i])
            {
                combos++;
            }
        }
        if(combos == 4)
        {
            unlocked = true;
        }
    }

}
