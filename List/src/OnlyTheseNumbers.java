import java.util.ArrayList;
import java.util.Scanner;
public class OnlyTheseNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while(true) {
          int number = sc.nextInt();
          if(number == -1) {
              break;
          }
          numbers.add(number);
        }
        System.out.print("From Where? ");
        int from = sc.nextInt();
        System.out.print("To Where? ");
        int where = sc.nextInt();

        for (int i = from; i <= where; i++) {
            System.out.println(numbers.get(i));
        }
    }
}