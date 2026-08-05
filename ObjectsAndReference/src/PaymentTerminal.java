public class PaymentTerminal {
    private double money;
    private int affordableMeals;
    private int heartyMeals;

    public PaymentTerminal() {
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        //affordable meals costs 2.50 euros
        if(payment < 2.50) {
            return payment;
        }

        this.money += 2.50;
        this.affordableMeals++;
        return payment - 2.50;
    }

    public double eatHeartily(double payment) {
        //hearty meals costs 4.30 euros
        if(payment < 4.30) {
            return payment;
        }

        this.money += 4.30;
        this.heartyMeals++;
        return payment - 4.30;
    }

    public boolean eatAffordably(PaymentCard card) {
        //affordable meals costs 2.50 euros
        if(card.getBalance() < 2.50) {
            return false;
        }
        card.takeMoney(2.50);
        this.affordableMeals++;
        return true;
    }

    public boolean eatHeartily(PaymentCard card) {
        //affordable meals costs 4.30 euros
        if(card.getBalance() < 4.30) {
            return false;
        }
        card.takeMoney(4.30);
        this.heartyMeals++;
        return true;
    }

    public void addMoneyToCard(PaymentCard card, int amount) {
        if(amount < 0) {
            return;
        }
        card.addMoney(amount);
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals +
                ", number of sold hearty meals " + heartyMeals;
    }
}
