package GradeStatistics;

import java.util.Scanner;

public class GradeCalculator {
    Scanner sc = new Scanner(System.in);
    GradeStatistics gradeStatistics = new GradeStatistics();

    public void run() {
        while (true) {
            int point = Integer.parseInt(sc.nextLine());

            // Calculate
            if(point == -1) {
                break;
            }

            gradeStatistics.addGrade(point);
        }
        System.out.println("Point average (all): " + gradeStatistics.getAverage());
        System.out.println("Point average (passing): " + (gradeStatistics.getNumOfPassing() > 0 ?
                gradeStatistics.getAveragePassing() : "-"));
        System.out.println("Pass percentage: " + (gradeStatistics.getNumOfPassing() > 0 ?
                gradeStatistics.getPercentage() : "-"));
    }
}
