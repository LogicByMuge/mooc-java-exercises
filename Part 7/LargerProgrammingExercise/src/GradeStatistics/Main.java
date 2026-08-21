package GradeStatistics;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumOfPoints = 0;
        int numOfPoints = 0;
        int sumOfPassing = 0;
        int numOfPassing = 0;
        float average = 0;
        float averagePassing = 0;

        System.out.println("Enter point totals, -1 stops:");
        while(true) {
            int point = Integer.parseInt(sc.nextLine());

            // if input is -1 compute the average
            if(point == -1) {
                break;
            }

            // [0 - 100]
            if(point >= 0 && point <= 100) {
                sumOfPoints += point;
                numOfPoints++;
                // Passing grade
                if(point >= 50) {
                    sumOfPassing += point;
                    numOfPassing++;
                }
            }
        }
        average = (float) sumOfPoints / numOfPoints;
        averagePassing = (float) sumOfPassing / numOfPassing;
        float percentage = (float) 100 * numOfPassing / numOfPoints;
        System.out.println("Point average (all): " + average);
        System.out.println("Point average (passing): " + (numOfPassing > 0 ? averagePassing : "-"));
        System.out.println("Pass percentage: " + percentage);
    }
}