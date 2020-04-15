package katabank;

public interface AccountInterface {

    int getBalance();

    void deposit(int amount);

    void withdrawal(int amount);

    void printStatement();
}
