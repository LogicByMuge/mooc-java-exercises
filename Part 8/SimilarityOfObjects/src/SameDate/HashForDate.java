package SameDate;

import java.util.HashSet;

public class HashForDate {
    public static void main(String[] args) {
        HashSet<SimpleDate> dates = new HashSet<>();
        dates.add(new SimpleDate(1,2,2000));
        dates.add(new SimpleDate(1,2,2000));
        System.out.println(dates.size()); // should be 1, not 2
    }
}
