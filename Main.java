import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        intro();
        generateLocks();
        runGame();
        checkLocks();
        askForReplay();


    }

    public static void replay() {
        runGame();
        checkLocks();
    }

    public static void intro() {
        System.out.println("Ahoy, matey! Welcome to 'Pirate's Combo Lock'!" +
                "\nYe be a fearless pirate on a quest to unlock the hidden treasure in the chest by crackin' the combo lock. " +
                "\nThe riches be awaitin', but ye to guess three digits correctly." +
                "\nCan ye outsmart the locks and claim the booty, or will ye face defeat?" +
                "\nGet ready to embark on a thrilling adventure and see if ye have what it takes to be a true pirate!\n\n");
    }

    public static int lock1 = 0;
    public static int lock2 = 0;
    public static int lock3 = 0;

    public static void generateLocks() {
        Random rand = new Random();
        lock1 = rand.nextInt(10);
        lock2 = rand.nextInt(10);
        lock3 = rand.nextInt(10);
    }

    public static int guess1 = 0;
    public static int guess2 = 0;
    public static int guess3 = 0;

    public static void runGame() {
        Scanner scan = new Scanner(System.in);
        int lock = 1;
        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter yer guess for combo lock dial " + lock + ":");
            switch (lock) {
                case 1:
                    guess1 = scan.nextInt();
                    lock++;
                    break;
                case 2:
                    guess2 = scan.nextInt();
                    lock++;
                    break;
                case 3:
                    guess3 = scan.nextInt();
                    lock++;
                    break;
            }

        }
    }

    public static void checkLocks() {
        int unlocks = 0;
        if (guess1 == lock1) {
            unlocks++;
        }
        if (guess2 == lock2) {
            unlocks++;
        }
        if (guess3 == lock3) {
            unlocks++;
        }
        switch (unlocks) {
            case 3:
                System.out.println("Ahoy, me hearty! " +
                    "\nAs ye enter the final digit of the combo, there be a mighty 'click.' " +
                    "\nThe ancient lock surrenders to yer skill, and with a creak and a groan, the treasure chest swings open wide. " +
                    "\nInside, the sight be nigh mesmerizin'! " +
                    "\nGleaming gold doubloons, glitterin' jewels, and precious pearls spill forth like a waterfall of riches. " +
                    "\nThe chest be filled to the brim with untold wealth, the spoils of a pirate's dreams. " +
                    "\nYe stand triumphant, surrounded by the treasures of the deep, a true swashbucklin' legend of the high seas! ");
                break;

            case 1:
                System.out.println("Avast, matey! " +
                    "\nAs ye twist the dial and enter the final digit, ye feel a slight give, a tantalizin' sign that the chest be not as firmly locked as before. " +
                    "\nThe 'clunk' be softer, and ye know ye've guessed one of the numbers right. " +
                    "\nBut the treasure chest be a crafty foe, and it holds its secrets tight. " +
                    "\nThough it be not fully unlocked, ye've made a dent in its defenses. " +
                    "\nKeep yer wits about ye and try again, for the riches be closer than ye think!");
                break;
            case 0:
                System.out.println("Arrr, matey! " +
                    "\nAs ye enter the final digit of the combo, ye hear a disheartenin' 'clunk' instead of the triumphant 'click' ye were hopin' for. " +
                    "\nThe lock be stubborn, and the chest stays sealed tight, as if guardin' its secrets from the likes of ye. " +
                    "\nYe gave it yer best shot, but today be not the day for treasures untold. " +
                    "\nThe chest remains a mystery, its riches locked away, but fear not, for the seas be vast, and there be more adventures awaitin'! " +
                    "\nYe may not have unlocked this chest, but the spirit of a true pirate be undaunted. " +
                    "\nSet sail once more, me hearty, and who knows what other treasures ye may discover on yer journey! ");
                break;

            case 2:
                System.out.println("Arrr, ye be makin' progress, me fearless pirate! " +
                    "\nWith two correct guesses under yer belt, the lock be groanin' and creakin', and the chest be wigglin' ever so slightly in response. " +
                    "\nIt be clear that ye're onto somethin', and the treasure's grip be weakenin'. " +
                    "\nJust one more digit to guess, and ye might see the riches spill forth. " +
                    "\nKeep yer wits about ye, me hearty! Victory be within reach.");
                break;
        }
    }
    public static void askForReplay()
    {
        System.out.println("\nYe still be standin' before the chest, me hearty. " +
                "\nWould ye like to give it another go? (y/n)");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        switch (input) {
            case "n":
                break;
            case "y":
                System.out.println("Ahoy, brave pirate! " +
                        "\nThe lock be no match for yer determination. " +
                        "\nGo ahead and enter yer next guess for the combo, and may the winds of fortune be with ye! ");
                replay();
            default:
                System.out.println("Arrr, yer input be as mysterious as Davy Jones' locker. " +
                        "Please enter 'y' for yes or 'n' for no, me hearty.");
                askForReplay();
        }
    }

    }