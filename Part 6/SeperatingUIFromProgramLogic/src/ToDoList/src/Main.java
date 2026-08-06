import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToDoList list = new ToDoList();
        Scanner sc = new Scanner(System.in);
        UserInterface ui = new UserInterface(list,sc);
        ui.start();
    }
}