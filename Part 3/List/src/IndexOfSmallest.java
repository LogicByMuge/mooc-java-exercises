import java.util.ArrayList;
import java.util.Scanner;
public class IndexOfSmallest {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true) {
            int number = sc.nextInt();
            if(number == 9999) {
                break;
            }
            numbers.add(number);
        }

        int smallest = numbers.get(0);
        int smallestIndex = 0;
        for(int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) < smallest) {
                smallest = numbers.get(i);
                smallestIndex = i;
            }
        }

        System.out.println("Smallest number: " + smallest);
        System.out.println("Found at index: " + smallestIndex);
    }
}