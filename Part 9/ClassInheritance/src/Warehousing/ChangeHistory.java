package Warehousing;

import ABC.A;

import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {
        history = new ArrayList<>();
    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();
    }

    public String toString() {
        return history.toString();
    }

    public double maxValue() {
        double largest = history.get(0);
        for(int i = 0; i < history.size(); i++) {
            if(history.get(i) > largest) {
                largest = history.get(i);
            }
        }
        return largest;
    }

    public double minValue() {
        double smallest = maxValue();
        for(int i = 0; i < history.size(); i++) {
            if(history.get(i) < smallest) {
                smallest = history.get(i);
            }
        }
        return smallest;
    }

    public double average() {
        if(history.isEmpty()) return 0;
        double sum = 0;
        for (double value : history) {
            sum += value;
        }
        return sum / history.size();
    }
}
