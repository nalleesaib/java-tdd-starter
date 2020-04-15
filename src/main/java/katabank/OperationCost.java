package katabank;

/**
 *
 */
public enum OperationCost {
    BALANCE(1.0),
    DEPOSIT(2.0),
    WITHDRAW(3.0),
    OPERATION_LIST(0.5);

    Double value = 0.0;

    /**
     *
     * @param value
     */
    private  OperationCost(Double value){
        this.value = value;
    }

    /**
     *
     * @return
     */
    public Double getValue() {
        return value;
    }
}
