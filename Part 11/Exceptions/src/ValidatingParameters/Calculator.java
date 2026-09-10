package ValidatingParameters;

public class Calculator {

    public int factorial(int number) {
        if(number < 0) {
            throw new IllegalArgumentException("Number must be non negative");
        }

        int factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public int binomialCoefficient(int n, int k) {
        if(n < 0 || k < 0) {
            throw new IllegalArgumentException("Number must be non negative");
        }
        if(k > n) {
            throw new IllegalArgumentException("subset size must not exceed the set size");
        }
        return factorial(n) / (factorial(k) * factorial(n - k));

    }
}
