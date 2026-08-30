package Warehousing;

public class Warehouse {
    protected double capacity = 0;
    protected double balance;

    // Creates an empty warehouse, which has the capacity provided as a parameter;
    // an invalid capacity (<=0) creates a useless warehouse, with the capacity 0.
    public Warehouse(double capacity) {
        if(capacity > 0) {
            this.capacity = capacity;
        }
    }

    // Returns the balance of the warehouse,
    // i.e. the capacity which is taken up by the items in the warehouse.
    public double getBalance() {
        return balance;
    }

    // Returns the total capacity of the warehouse (i.e. the one that was provided in the constructor).
    public double getCapacity() {
        return capacity;
    }

    // Returns a value telling how much space is left in the warehouse.
    public double howMuchSpaceLeft() {
        return capacity - balance;
    }

    // Adds the desired amount to the warehouse;
    // if the amount is negative, nothing changes, and if everything doesn't fit,
    // then the warehouse is filled up and the rest is "thrown away" / "overflows".
    public void addToWarehouse(double amount) {
        if(amount > 0) {
            if((balance + amount) < capacity) {
                balance += amount;
            } else {
                balance = capacity;
            }
        }
    }

    // Take the desired amount from the warehouse. The method returns much we actually get.
    // If the desired amount is negative, nothing changes and we return 0.
    // If the desired amount is greater than the amount the warehouse contains,
    // we get all there is to take and the warehouse is emptied.
    public double takeFromWarehouse(double amount) {
        double returnBalance = balance;
        if(amount < 0) {
            return 0;
        }
        if(amount > balance) {
            balance = 0;
            return returnBalance;
        }
        balance -= amount;
        return amount;
    }

    // Returns the state of the object represented as a string like this balance = 64.5, space left 123.5
    public String toString() {
        return "balance = " + balance + ", space left " + howMuchSpaceLeft();
    }
}
