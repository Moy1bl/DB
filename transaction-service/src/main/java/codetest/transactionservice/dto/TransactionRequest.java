package codetest.transactionservice.dto;

import java.util.UUID;

public class TransactionRequest {
    private UUID accountId;
    private String typeOfTransaction;
    private double amount;

    public TransactionRequest(UUID accountId, String typeOfTransaction, double amount) {
        this.accountId = accountId;
        this.typeOfTransaction = typeOfTransaction;
        this.amount = amount;
    }

    public UUID getAccountId() {
        return this.accountId;
    }

    public void setAccountId(UUID accountId) {
        this.accountId = accountId;
    }

    public String getTypeOfTransaction() {
        return this.typeOfTransaction;
    }

    public void setTypeOfTransaction(String typeOfTransaction) {
        this.typeOfTransaction = typeOfTransaction;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}