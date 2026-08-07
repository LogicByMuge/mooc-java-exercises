package LiquidContainers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;
        boolean isRunning = true;

        while(isRunning) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");
            String input = sc.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            switch(command) {
                case "add":
                    if(amount > 100 || ((firstContainer + amount) > 100)) {
                        firstContainer = 100;
                    } else {
                        firstContainer += amount;
                    }
                    break;
                case "move":
                    int liquidToPass = firstContainer;
                    if(amount > firstContainer) {
                        firstContainer = 0;
                        secondContainer += liquidToPass;
                    } else {
                        if(secondContainer != 100) {
                            firstContainer -= amount;
                            secondContainer += amount;
                        }
                    }
                    break;
                case "remove":
                    if((secondContainer - amount) < 0) {
                        secondContainer = 0;
                    } else {
                        secondContainer -= amount;
                    }
                    break;
                case "quit":
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }
    }
}