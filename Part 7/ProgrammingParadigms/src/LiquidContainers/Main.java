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

            // FIX 1: "amount" is no longer parsed here for every command.
            // Previously, Integer.parseInt(parts[1]) ran before the switch,
            // which crashed with ArrayIndexOutOfBoundsException whenever the
            // command was "quit" (parts only has 1 element, no parts[1]).
            // Now each case parses its own amount, only when it needs one.

            switch(command) {
                case "add": {
                    int amount = Integer.parseInt(parts[1]);
                    if(amount > 100 || ((firstContainer + amount) > 100)) {
                        firstContainer = 100;
                    } else {
                        firstContainer += amount;
                    }
                    break;
                }
                case "move": {
                    int amount = Integer.parseInt(parts[1]);

                    // FIX 2: rewritten to correctly cap both sides.
                    // Old code only blocked moving when secondContainer was
                    // ALREADY exactly 100, so a move that pushed it PAST 100
                    // (e.g. second=50, move=100) resulted in an invalid value
                    // like 150 instead of being capped at 100.
                    // New logic: move only what firstContainer actually has
                    // (Math.min handles "move more than available" case),
                    // then cap secondContainer at 100 afterward (excess wasted).
                    int moveAmount = Math.min(amount, firstContainer);
                    firstContainer -= moveAmount;
                    secondContainer += moveAmount;
                    if(secondContainer > 100) {
                        secondContainer = 100;
                    }
                    break;
                }
                case "remove": {
                    int amount = Integer.parseInt(parts[1]);
                    if((secondContainer - amount) < 0) {
                        secondContainer = 0;
                    } else {
                        secondContainer -= amount;
                    }
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