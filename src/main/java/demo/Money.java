package demo;

import java.util.Objects;


public class Money {
    int amount;
    String devise;

    public  Money(int n, String s){
        amount=n;
        devise=s;
    }
    public Money add(Money that) {
        return new Money(this.amount+that.amount,this.devise);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return amount == money.amount &&
                Objects.equals(devise, money.devise);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, devise);
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount + devise + '\'' +
                '}';
    }
}
