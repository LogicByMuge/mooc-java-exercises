package GradeStatistics;

public class GradeDistribution {
    int[] grades = new int[6];

    public void addGrade(int point) {
        if(point < 50) {
            grades[0]++;
        } else if (point < 60) {
            grades[1]++;
        } else if (point < 70) {
            grades[2]++;
        } else if (point < 80) {
            grades[3]++;
        } else if (point < 90) {
            grades[4]++;
        } else if (point >= 90) {
            grades[5]++;
        }
    }

    private void printStars(int num) {
        for (int i = 0; i < grades[num]; i++) {
            System.out.print("*");
        }
    }

    public void printGradeDistribution() {
        for(int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            printStars(i);
            System.out.println();
        }
    }
}
