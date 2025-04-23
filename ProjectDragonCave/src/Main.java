import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);

        // Print console output
        String scenario = "You are in a land full of dragons. In front of you, \nYou see two caves. In one cave, the dragon is friendly \nand will share his treasure with you. The other dragon \nis greedy and hungry and will eat you on sight. \nWhich cave will you go into? (1 or 2)";
        System.out.println(scenario);

        // Ask for player input
        int playerInput = sc.nextInt();

        // Process input and return outcome
        switch (playerInput) {
            case 1:
                System.out.println("You approach the cave…");
                delayMillis(1000);
                System.out.println("It is dark and spooky…");
                delayMillis(1000);
                System.out.println("A large dragon jumps out in front of you!");
                delayMillis(3000);
                System.out.println("He opens his jaws and…");
                delayMillis(3000);
                System.out.println("Gobbles you down in one bite!");
                break;
            case 2:
                System.out.println("The air grows cool...");
                delayMillis(1000);
                System.out.println("The faint glimmer of treasure catches your eye in the shadows...");
                delayMillis(3000);
                System.out.println("Suddenly, a magnificent dragon emerges!");
                delayMillis(1000);
                System.out.println("Its eyes shine with kindness, and it greets you warmly...");
                delayMillis(3000);
                System.out.println("The friendly dragon shares its treasure with you, granting you riches beyond imagination.");
                delayMillis(3000);
                System.out.println("You have triumphed!");
                break;
            default:
                System.out.println("You are missing the point.");
                break;
        }
    }

    private static void delayMillis(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
    }
}