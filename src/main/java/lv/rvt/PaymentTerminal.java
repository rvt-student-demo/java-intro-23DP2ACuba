package lv.rvt;

public class PaymentTerminal {

    private double money;
    private int affordableMeals;
    private int heartyMeals;
    private static final double ap = 2.50;
    private static final double hp = 4.30;

    public PaymentTerminal() {
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        if (payment >= ap) {
            this.money = this.money + ap;
            affordableMeals++;
            return payment - ap;
        } 
        return payment;
    }

    public double eatHeartily(double payment) {
        if (payment >= hp) {
            this.money = this.money + hp;
            heartyMeals++;
            return payment - hp;
        }
        return payment;
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() >= ap) {
            card.takeMoney(ap);
            affordableMeals++;
            return true;
        }
        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() >= hp) {
            card.takeMoney(hp);
            heartyMeals++;
            return true;
        }
        return false;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            money += sum;
        }    
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}

