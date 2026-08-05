import java.util.ArrayList;
import java.util.Scanner;
public class GreatestInList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true) {
            int number = sc.nextInt();
            if(number == -1) {
                break;
            }
            numbers.add(number);
        }

        int largest = numbers.get(0);
        for(int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) > largest) {
                largest = numbers.get(i);
            }
        }

        System.out.println("Largest: " + largest);
    }
}