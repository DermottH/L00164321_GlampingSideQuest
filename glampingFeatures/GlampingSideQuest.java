import java.util.Scanner;

public class GlampingSideQuest {

    /**
     * Display the main menu for the Glamping Side Quest.
     */
    public static void displayMenu() {
        System.out.println("\n=== Welcome to Glamping Side Quest ===");
        System.out.println("1. Set up a camp");
        System.out.println("2. Start a fire");
        System.out.println("3. Cook a chicken");
        System.out.println("4. View your score");
        System.out.println("5. Exit");
        System.out.println("=======================================");
    }

    /**
     * Simulates setting up a camp.
     */
    public static int setUpCamp() {
        System.out.println("\nYou are setting up your camp...");
        // Add more logic here for choosing items, scoring, etc.
        System.out.println("Camp setup complete! +10 points.");
        return 10;
    }

    /**
     * Simulates starting a fire.
     */
    public static int startFire() {
        System.out.println("\nYou are starting a fire...");
        // Add random chance logic here.
        System.out.println("Fire started successfully! +5 points.");
        return 5;
    }

    /**
     * Simulates cooking a chicken.
     */
    public static int cookChicken() {
        System.out.println("\nYou are cooking a chicken...");
        // Add logic for undercooked/burnt/perfectly cooked chicken.
        System.out.println("Chicken cooked perfectly! +20 points.");
        return 20;
    }

    /**
     * Main game loop.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalScore = 0;

        while (true) {
            displayMenu();
            System.out.print("Choose an option (1-5): ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    totalScore += setUpCamp();
                    break;
                case "2":
                    totalScore += startFire();
                    break;
                case "3":
                    totalScore += cookChicken();
                    break;
                case "4":
                    System.out.println("\nYour current score is: " + totalScore);
                    break;
                case "5":
                    System.out.println("\nThank you for playing! Final score: " + totalScore);
                    scanner.close();
                    return;
                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }
        }
    }
}
