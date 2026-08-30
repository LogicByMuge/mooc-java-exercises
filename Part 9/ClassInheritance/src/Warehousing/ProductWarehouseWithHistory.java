package Warehousing;

public class ProductWarehouseWithHistory extends ProductWarehouse{
    private double initialBalance;
    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.initialBalance = initialBalance;
        history = new ChangeHistory();

        // Set starting balance
        super.addToWarehouse(initialBalance);

        // Record initial state in history
        history.add(getBalance());
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        history.add(getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double taken = super.takeFromWarehouse(amount);
        history.add(getBalance());
        return taken;
    }

    public String history() {
        return history.toString();
    }

    public void printAnalysis() {
        System.out.println(productName + ":\n" +
                "History: " + history() + "\n" +
                "Largest amount of product: " + history.maxValue() + "\n" +
                "Smallest amount of product: " + history.minValue() + "\n" +
                "Average: " + history.average());
    }
}
