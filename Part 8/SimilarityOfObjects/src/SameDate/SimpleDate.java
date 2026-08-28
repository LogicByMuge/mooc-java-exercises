package SameDate;

public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object comparedObject) {
        if(this == comparedObject) {
            return false;
        }
        if(!(comparedObject instanceof SimpleDate)) {
            return false;
        }
        SimpleDate comparedDate = (SimpleDate) comparedObject;
        return this.day == comparedDate.day &&
        this.month == comparedDate.month &&
        this.year == comparedDate.year;
    }

    // I don't really get the deeper logic behind multiplying by 372 and 31.
    // It's supposed to prevent collision between objects hash code that has something to do -
    // with how many months there are.
    public int hashCode() {
        return year * 372 + month * 31 + day;
    }
}
