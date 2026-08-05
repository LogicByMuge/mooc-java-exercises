import java.util.ArrayList;
import java.util.Scanner;

public class ArchiveMain {
    public static void main(String[] args) {
        ArrayList<Archive> items = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = sc.nextLine();
            if(identifier.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop");
            String name = sc.nextLine();
            if(identifier.isEmpty()) {
                break;
            }

            items.add(new Archive(identifier, name));
        }
        System.out.println("==Items==");
        ArrayList<Archive> printed = new ArrayList<>();
        for(int i = 0; i < items.size(); i++) {
            Archive item = items.get(i);
            boolean alreadyPrinted = false;

            for(int j = 0; j < printed.size(); j++) {
                Archive printedItem = printed.get(j);
                if(printedItem.getIdentifier().equals(item.getIdentifier())) {
                    alreadyPrinted = true;
                }
            }
            if(!alreadyPrinted) {
                System.out.println(item);
                printed.add(item);
            }
        }
    }
}