public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int room, int squares, int pricePerSquare) {
        this.rooms = room;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        return this.getSquares() > compared.getSquares();
    }

    public int priceDifference(Apartment compared) {
        int thisPrice = this.getSquares() * this.getPricePerSquare();
        int comparedPrice = compared.getSquares() * compared.getPricePerSquare();
        return Math.abs(thisPrice - comparedPrice);
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int thisPrice = this.getSquares() * this.getPricePerSquare();
        int comparedPrice = compared.getSquares() * compared.getPricePerSquare();

        return thisPrice > comparedPrice;
    }

    public int getRooms() {
        return this.rooms;
    }

    public int getSquares() {
        return this.squares;
    }

    public int getPricePerSquare() {
        return pricePerSquare;
    }
}
