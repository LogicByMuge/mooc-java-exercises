public class ClockHand {
    private int value;
    private int limit;

    public ClockHand(int limit) {
        this.limit = limit;
        this.value = 0;
    }

    public void advance() {
        this.value++;

        if(this.value >= this.limit) {
            this.value = 0;
        }
    }

    public int getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        if (this.value < 10) {
            return "0" + getValue();
        }
        return "" + getValue();
    }
}
