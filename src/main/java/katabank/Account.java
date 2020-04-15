package katabank;

public class Account implements AccountInterface{

    private int balance;

    @Override
    public int getBalance() {
        return this.balance;
    }

    @Override
    public void deposit(int amount) {
        this.balance += amount;
    }

    @Override
    public void withdrawal(int amount) {
     this.balance-=amount;
    }

    @Override
    public void printStatement() {

    }
}
