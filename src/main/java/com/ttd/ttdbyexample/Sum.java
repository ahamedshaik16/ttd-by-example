package com.ttd.ttdbyexample;

public class Sum implements Expression {

    final Expression augmend;
    final Expression addmend;

    public Sum(Expression augmend, Expression addmend) {
        this.augmend = augmend;
        this.addmend = addmend;
    }

    @Override
    public Money reduce(Bank bank, String toCurrency) {
        int amount = this.augmend.reduce(bank, toCurrency).amount + this.addmend.reduce(bank, toCurrency).amount;
        return  new Money(amount, toCurrency);
    }
}
