package lv.rvt;

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        // Round the balance to 1 decimal place for better display
        return String.format("The card has a balance of " + this.balance + " euros");
    }
    public double balance() {
        return this.balance;
    }

    public void eatAffordably() {
        if (this.balance - 2.60 > 0) {
            this.balance -= 2.60;
        }
    }

    public void eatHeartily() {
        if (this.balance - 4.60 > 0) {
            this.balance -= 4.60;
        }
    }

    public void addMoney(double increase) {
        this.balance += increase;
    }

    public boolean takeMoney(double amount) {
        if (this.balance() >= amount) {
            this.balance = this.balance - amount;
            return true;
        }
        return false;
    }

}
