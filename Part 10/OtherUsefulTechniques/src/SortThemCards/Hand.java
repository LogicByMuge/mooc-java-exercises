package SortThemCards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Hand implements Comparable<Hand>{
    private ArrayList<Card> cards;
    private int sum = 0;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void add(Card card) {
        cards.add(card);
        sum += card.getValue();
    }

    public void print() {
        Iterator<Card> iterator = cards.iterator();
        while (iterator.hasNext()) {
            Card c = iterator.next();
            System.out.println(c);
        }
    }

    public void sort() {
        Collections.sort(cards);
    }

    public int getSum() {
        return sum;
    }

    @Override
    public int compareTo(Hand o) {
        return Integer.compare(this.getSum(), o.getSum());
    }
}
