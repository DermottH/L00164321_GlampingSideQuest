package atulab.ie.ghglamptst;

import java.util.Scanner;

public class App {
    // Simulates setting up a camp.
    public static int setUpCamp() {
        System.out.println("\nYou are setting up your camp...");
        int points = (int) (Math.random() * 11) + 5; // Random points between 5 and 15
        System.out.println("Camp setup complete! +" + points + " points.");
        return points;
    }

    // Simulates starting a fire.
    public static int startFire() {
        System.out.println("\nYou are starting a fire...");
        int points = (int) (Math.random() * 6) + 5; // Random points between 5 and 10
        System.out.println("Fire started successfully! +" + points + " points.");
        return points;
    }

    // Simulates cooking a chicken.
    public static int cookChicken() {
        System.out.println("\nYou are cooking a chicken...");
        int points = (int) (Math.random() * 21) + 10; // Random points between 10 and 30
        System.out.println("Chicken cooked perfectly! +" + points + " points.");
        return points;
    }

    // Displays the help menu.
    public static void showHelp() {
        System.out.println("\n=== Help Menu ===");
        System.out.println("1. To set up camp, gather materials and choose a safe location.");
        System.out.println("2. To start a fire, use flint and wood, ensuring a safe environment.");
        System.out.println("3. To cook a chicken, ensure it's cooked thoroughly over the fire.");
        System.out.println("==================");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalScore = 0;

        while (true) {
            System.out.println("\n=== Welcome to Glamping Side Quest ===");
            System.out.println("1. Set up a camp");
            System.out.println("2. Start a fire");
            System.out.println("3. Cook a chicken");
            System.out.println("4. View your score");
            System.out.println("5. Help");
            System.out.println("6. Exit");
            System.out.println("=======================================");

            System.out.print("Choose an option (1-6): ");
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
                    showHelp();
                    break;
                case "6":
                    System.out.println("\nThank you for playing! Final score: " + totalScore);
                    scanner.close();
                    return;
                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }
        }
    }
}
