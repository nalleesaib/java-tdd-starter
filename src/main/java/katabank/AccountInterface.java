package katabank;

import java.util.Date;
import java.util.List;

public interface AccountInterface {

    int getBalance();

    void deposit(int amount);

    void withdrawal(int amount);

    void printStatement();

    String getHistory();

    List<AccountTransaction> getTransactions();

    void setDate(Date date);
}
