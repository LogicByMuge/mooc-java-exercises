import java.util.ArrayList;
import java.util.Scanner;

public class Television {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<TelevisionProgram> television = new ArrayList<>();

        while(true) {
            System.out.print("Name: ");
            String name = sc.nextLine();
            if(name.isEmpty()) {
                break;
            }

            System.out.print("Duration: ");
            int duration = Integer.valueOf(sc.nextLine());

            television.add(new TelevisionProgram(name, duration));
        }

        System.out.print("Program's maximum duration? ");
        int maxDuration = sc.nextInt();

        for(int i = 0; i < television.size(); i++) {
            if(television.get(i).getDuration() <= maxDuration) {
                System.out.println(television.get(i));
            }
        }
    }
}