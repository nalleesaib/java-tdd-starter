package katabank;

public interface AccountManager {

    /**
     *
     * @param account
     * @param operationCost
     */
    void operate(Account account , OperationCost operationCost);
}
