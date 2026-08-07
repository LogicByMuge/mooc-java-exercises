package LiquidContainers2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();
        boolean isRunning = true;

        while(isRunning) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);
            String input = sc.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];

            switch(command) {
                case "add": {
                    int amount = Integer.parseInt(parts[1]);
                    firstContainer.add(amount);
                    break;
                }
                case "move": {
                    int amount = Integer.parseInt(parts[1]);
                    firstContainer.remove(amount);
                    secondContainer.add(amount);
                    break;
                }
                case "remove": {
                    int amount = Integer.parseInt(parts[1]);
                    secondContainer.remove(amount);
                    break;
                }
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