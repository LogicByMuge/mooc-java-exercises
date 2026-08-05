public class Timer {
    private ClockHand hundredthsOfASecond;
    private ClockHand seconds;

    public Timer() {
        this.hundredthsOfASecond = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance() {
        this.hundredthsOfASecond.advance();

        if(hundredthsOfASecond.getValue() == 0) {
            this.seconds.advance();
        }
    }

    @Override
    public String toString() {
        return this.seconds + ":" + this.hundredthsOfASecond;
    }
}
