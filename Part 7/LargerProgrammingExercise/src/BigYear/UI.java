package BigYear;

import java.util.Scanner;

public class UI {
    private boolean isRunning;
    private Scanner sc;
    private BirdDB dataBase;

    public UI(Scanner sc) {
        this.sc = sc;
        this.dataBase = new BirdDB();
    }

    public void start() {
        isRunning = true;
        
        while(isRunning) {
            System.out.print("? ");
            String command = sc.nextLine();

            switch (command) {
                case "Add":
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Latin name: ");
                    String latinName = sc.nextLine();
                    dataBase.add(name, latinName);
                    break;
                case "All":
                    dataBase.all();
                    break;
                case "Quit":
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }
    }
}
