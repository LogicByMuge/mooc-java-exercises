package Money;

public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money addition) {
        int addedEuros = this.euros() + addition.euros();
        int addedCents = this.cents() + addition.cents();
        if(addedCents >= 100) {
            addedCents = addedCents - 100;
            addedEuros++;
        }
        Money newMoney = new Money(addedEuros, addedCents);
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (this.euros() < compared.euros()) {
            return true;
        } else if(this.euros() == compared.euros()) {
            if(this.cents() < compared.cents()) {
                return true;
            }
        }
        return false;
    }

    public Money minus(Money compared) {
        int subtractedEuros = this.euros() - compared.euros();
        int subtractedCents = this.cents() - compared.cents();
        if(subtractedCents < 0) {
            subtractedEuros--;
            subtractedCents = 100 + subtractedCents;
        }

        if(subtractedEuros < 0) {
            subtractedEuros = 0;
            subtractedCents = 0;
        }
        Money newMoney = new Money(subtractedEuros, subtractedCents);
        return newMoney;
    }
}