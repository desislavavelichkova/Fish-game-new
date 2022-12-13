import Fishes.Carp;
import Fishes.Fish;
import Fishes.SheatFish;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pond pond = new Pond();
        int count = 0;
        int weight = 1;
        int whisckerLength = 1;

        System.out.println("Start the game!");
        System.out.println("-------------------------------");
        System.out.println("Options:");
        System.out.println(" 1 - Create and add fish in the pond.");
        System.out.println(" 2 - Catch fish from the pond.");
        System.out.println(" 3 - Show Capacity of the pond.");
        System.out.println(" 4 - Show State of the pond.");
        System.out.print("Your option: ");

        Scanner s = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int command = Integer.parseInt(str);

        do {
            weight++;
            whisckerLength++;

            //1 - Create and add fish in the pond.
            if (command == 1) {
                count++;
                System.out.println(" 1 - Carp");
                System.out.println(" 2 - SheatFish");
                System.out.print("Type of fish: ");
                str = scanner.nextLine();
                int typeOfFish = Integer.parseInt(str);
                if (typeOfFish == 1) {
                    String color = "blue";
                    Carp currFish = new Carp(weight, "blue");
                    System.out.println();
                    pond.obtainFish(currFish);

                } else if (typeOfFish == 2) {
                    Fish currFish = new SheatFish(weight, whisckerLength);
                    System.out.println();
                    pond.obtainFish(currFish);
                } else {
                    System.out.println("Invalid input!");
                    continue;
                }
                System.out.println();
                scanner = new Scanner(System.in);
            }

            //2 - Catch fish from the pond.
            else if (command == 2) {
                count++;
                System.out.println();
                System.out.println(" 1 - Carp");
                System.out.println(" 2 - SheatFish");
                System.out.print("Type of fish: ");
                str = scanner.nextLine();
                int typeOfFish = Integer.parseInt(str);
                if (typeOfFish == 1) {
                    System.out.println();
                    Carp fish = new Carp(weight, "blue");
                    pond.lostFish(fish);
                } else if (typeOfFish == 2) {
                    System.out.println();
                    weight++;
                    whisckerLength++;
                    SheatFish fish = new SheatFish(weight, whisckerLength);
                    pond.lostFish(fish);
                } else {
                    System.out.println("Invalid input!");
                    continue;
                }
                System.out.println();
                scanner = new Scanner(System.in);
            }
            //3 - Show Capacity of the pond.
            else if (command == 3) {
                System.out.println();
                pond.ShowCapacity();
            }
            // 4 - Show State of the pond
            else if (command == 4) {
                System.out.println();
                pond.ShowState();
            }
            // Different Input
             else {
                System.out.println("Invalid Input!");
                System.out.println("-------------------------------");
                System.out.println("Options:");
                System.out.println(" 1 - Create and add fish in the pond.");
                System.out.println(" 2 - Catch fish from the pond.");
                System.out.println(" 3 - Show Capacity of the pond.");
                System.out.println(" 4 - Show State of the pond.");
                System.out.print("Your option: ");
                str = scanner.nextLine();
                command = Integer.parseInt(str);
                continue;
            }
            if (pond.getPower() > 10) {
                break;
            }
            if (pond.fishes.size() == 0) {
                break;
            }
            System.out.println("-------------------------------");
            System.out.println("Options:");
            System.out.println(" 1 - Create and add fish in the pond.");
            System.out.println(" 2 - Catch fish from the pond.");
            System.out.println(" 3 - Show Capacity of the pond.");
            System.out.println(" 4 - Show State of the pond.");
            System.out.print("Your option: ");
            str = scanner.nextLine();
            command = Integer.parseInt(str);

        }while (pond.getPower() <= 10 || count <= 20);

        if (pond.getPower() > 10) {
            System.out.println("-------------------------------");
            System.out.println("Your pond's power is " + pond.getPower() + ".");
            System.out.println("You win the game!");
            pond.ShowCapacity();
            pond.ShowState();
        }
        else {
            System.out.println("-------------------------------");
            System.out.println("Your pond's power is " + pond.getPower() + ".");
            pond.ShowState();
            pond.ShowCapacity();
            System.out.println("You lose this game!!");
        }
        System.out.println();
        System.out.println("GAME OVER!");
    }
}
