import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true) {
            String item = sc.nextLine();
            if(item.isEmpty()) {
                break;
            }
            items.add(new Item(item));
        }

        for(int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }
    }
}
