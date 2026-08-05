public class OverloadedCounter {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter(10);

        System.out.println(counter1);
        System.out.println(counter2);

        counter1.increase();
        counter2.decrease();

        System.out.println(counter1);
        System.out.println(counter2);

        counter1.increase(4);
        counter2.decrease(4);

        System.out.println(counter1);
        System.out.println(counter2);
    }
}