package coffeemachine;

import java.util.Scanner;

public class CoffeeMachine {

    static boolean loop = true;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (loop) {
                   }

        System.out.println("1. Black Coffee");
        System.out.println("2. Hot Chocklate");
        System.out.println("3. Cappucino");
        System.out.println("4. Latte");
        System.out.println("5. Tea ");
        System.out.println("0. Exit");
        System.out.print("\nMake a choice :");

        int choice = sc.nextInt();
        sc.nextLine();

        // switch choice is there to choose diffrent conditions.
        switch (choice) {
            case 0:
                loop = false;
                break;

            case 1:
                System.out.println("Black Coffee");
                break;

            case 2:
                System.out.println("Hot Chocklate");
                break;

            case 3:
                System.out.println("Cappucino");
                break;

            case 4:
                System.out.println("Latte");
                break;
            case 5:
                System.out.println("Tea");
                break;
            default:
                System.out.println("No such choice");
                break;
        }

    }
}
