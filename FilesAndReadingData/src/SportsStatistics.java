import java.util.Scanner;
import java.nio.file.Paths;
public class SportsStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Team:");
        String team = scanner.nextLine();
        try(Scanner sc = new Scanner(Paths.get("data.csv"))) {
            int games = 0;
            int wins = 0;
            int losses = 0;
            while(sc.hasNextLine()) {
                String[] parts = sc.nextLine().split(",");
                int homeTeamScore = Integer.valueOf(parts[2]);
                int visitingTeamScore = Integer.valueOf(parts[3]);
                if(parts[0].equals(team)) {
                    games++;
                    if(homeTeamScore > visitingTeamScore) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
                if(parts[1].equals(team)) {
                    games++;
                    if(homeTeamScore < visitingTeamScore) {
                        wins++;
                    } else {
                        losses++;
                    }
                }

            }
            System.out.println("Games: " + games);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}