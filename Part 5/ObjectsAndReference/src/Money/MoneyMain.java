package Money;

public class MoneyMain {
    public static void main(String[] args) {
        Money a = new Money(10, 10);
        Money b = new Money(3, 50);
        System.out.println(a.minus(b));
    }
}