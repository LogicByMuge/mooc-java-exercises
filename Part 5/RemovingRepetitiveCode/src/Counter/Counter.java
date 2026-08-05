package Counter;

public class Counter {
    int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        this.value = 0;
    }

    public int getValue() {
        return this.value;
    }

    public void increase() {
        this.value++;
    }

    public void decrease() {
        this.value--;
    }

    public void increase(int increaseBy) {
        this.value += increaseBy;
    }

    public void decrease(int decreaseBy) {
        this.value -= decreaseBy;
    }

    @Override
    public String toString() {
        return "Count: " + getValue();
    }
}
