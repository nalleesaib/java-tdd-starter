package katabank;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AccountTransaction {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    private Date date;
    private int amount;
    private int balance;

    public AccountTransaction(Date date, int amount, int balance) {
        this.date = date;
        this.amount = amount;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return sdf.format(date) + "||" + this.amount + "||" + this.balance;
    }


}
