package katabank;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account implements AccountInterface{

    private int balance;
    private String history;
    private List<AccountTransaction> transactions = new ArrayList<>();
    private Date currentDate;

    @Override
    public int getBalance() {
        return this.balance;
    }

    @Override
    public void deposit(int amount) {
        this.balance += amount;
        transactions.add(0,new AccountTransaction(this.currentDate, amount, this.balance));
    }

    @Override
    public void withdrawal(int amount) {
        this.balance -= amount;
        transactions.add(0,new AccountTransaction(this.currentDate, -amount, this.balance));
    }

    @Override
    public void printStatement() {

        StringBuilder history = new StringBuilder("Date||Transaction||Balance");
        for(AccountTransaction accountTrx : this.getTransactions()){
            history.append(accountTrx.toString());
        }
        this.history = history.toString();
    }

    @Override
    public String getHistory() {
        return history;
    }



    public List<AccountTransaction> getTransactions() {
        return transactions;
    }

    @Override
    public void setDate(Date date) {
        this.currentDate = date;
    }
}
