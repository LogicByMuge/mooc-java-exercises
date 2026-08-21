package GradeStatistics;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumOfPoints = 0;
        int numOfPoints = 0;
        float average = 0;

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
            }
        }
        average = (float) sumOfPoints / numOfPoints;
        System.out.println("Sum of points: " + sumOfPoints);
        System.out.println("Num of points: " + numOfPoints);
        System.out.println("Point average (all): " + average);
    }
}