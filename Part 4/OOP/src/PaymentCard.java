public class PaymentCard {
    private double balance;

    public PaymentCard(double OpeningBalance) {
        this.balance = OpeningBalance;
    }

    public void eatAffordably() {
        if(this.balance >= 2.60) {
            this.balance -= 2.60;
        }
    }

    public void eatHeartily() {
        if(this.balance >= 4.60) {
            this.balance -= 4.60;
        }
    }

    public void addMoney(double amount) {
        if(amount > 0) {
            if (amount > 150) {
                this.balance = 150;
            } else {
                this.balance += amount;
            }
        }
    }

    @Override
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

}
