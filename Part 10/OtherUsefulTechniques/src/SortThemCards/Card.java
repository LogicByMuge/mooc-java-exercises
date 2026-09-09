package SortThemCards;

public class Card implements Comparable<Card>{
    private int value;
    private Suit suit;

    public Card(int value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        String valueStr = switch (value) {
            case 11 -> "J"; // Jack
            case 12 -> "Q"; // Queen
            case 13 -> "K"; // King
            case 14 -> "A"; // Ace
            default -> String.valueOf(value); // 2–10
        };

        return suit + " " + valueStr;
    }

    @Override
    public int compareTo(Card other) {
        // First compare by value
        if (this.value != other.value) {
            return this.value - other.value;
        }
        // If values are equal, compare by suit ordinal
        return this.suit.ordinal() - other.suit.ordinal();
    }
}