package GradeStatistics;

public class GradeDistribution {
    int five = 0;
    int four = 0;
    int three = 0;
    int two = 0;
    int one = 0;
    int zero = 0;

    public void addGrade(int point) {
        if(point < 50) {
            zero++;
        } else if (point < 60) {
            one++;
        } else if (point < 70) {
            two++;
        } else if (point < 80) {
            three++;
        } else if (point < 90) {
            four++;
        } else if (point >= 90) {
            five++;
        }
    }

    public void printStars(int num) {
        int number = 0;
        switch (num) {
            case 5:
                number = five;
                break;
            case 4:
                number = four;
                break;
            case 3:
                number = three;
                break;
            case 2:
                number = two;
                break;
            case 1:
                number = one;
                break;
            case 0:
                number = zero;
                break;
        }
        for(int i = 0; i < number; i++) {
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
