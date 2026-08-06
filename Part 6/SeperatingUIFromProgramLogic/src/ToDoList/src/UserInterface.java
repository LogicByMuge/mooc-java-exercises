import java.util.Scanner;

public class UserInterface {
    private ToDoList list;
    private Scanner sc;

    public UserInterface(ToDoList list, Scanner sc) {
        this.list = list;
        this.sc = sc;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = sc.nextLine();
            if(command.equals("stop")) {
                break;
            }
            if(command.equals("add")) {
                System.out.print("To add: ");
                String task = sc.nextLine();
                list.add(task);
            }
            if(command.equals("list")) {
                list.print();
            }
            if(command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int number = Integer.parseInt(sc.nextLine());
                list.remove(number);
            }
        }
    }
}
