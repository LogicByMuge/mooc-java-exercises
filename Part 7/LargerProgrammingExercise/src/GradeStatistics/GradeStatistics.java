package GradeStatistics;

public class GradeStatistics {
    GradeDistribution gradeDistribution = new GradeDistribution();

    private int sumOfPoints = 0;
    private int numOfPoints = 0;
    private int sumOfPassing = 0;
    private int numOfPassing = 0;
    private float average = 0;
    private float averagePassing = 0;
    private float percentage = 0;

    public void addGrade(int point) {
        // [0 - 100]
        if(point >= 0 && point <= 100) {
            gradeDistribution.addGrade(point);
            sumOfPoints += point;
            numOfPoints++;
            // Passing grade
            if(point >= 50) {
                sumOfPassing += point;
                numOfPassing++;
            }
        }
    }

    public float getAverage() {
        return average = (float) sumOfPoints / numOfPoints;
    }

    public float getAveragePassing() {
        return averagePassing = (float) sumOfPassing / numOfPassing;
    }

    public float getPercentage() {
        return percentage = (float) 100 * numOfPassing / numOfPoints;
    }

    public int getNumOfPassing() {
        return numOfPassing;
    }

    public void printGradeDistribution() {
        gradeDistribution.printGradeDistribution();
    }

}
