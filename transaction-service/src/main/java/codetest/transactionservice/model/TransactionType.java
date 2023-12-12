package codetest.transactionservice.model;
// for some reason enum is not working in the project
public class TransactionType {
    public static final TransactionType DEPOSIT = new TransactionType("DEPOSIT");
    public static final TransactionType WITHDRAWAL = new TransactionType("WITHDRAWAL");

    private String name;

    private TransactionType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
