package codetest.transactionservice.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "transactions")
public class Transaction {
    
    @Id
    private UUID transactionId;

    private UUID accountNumber;
    private String transactionType;
    private double amount;
    private String transactionDate;

    public Transaction() {
    }

    public Transaction(UUID accountNumber, String transactionType, double amount) {
        this.transactionId = UUID.randomUUID();
        this.accountNumber = accountNumber;
        this.transactionType = transactionType;
        this.amount = amount;
        this.transactionDate = java.time.LocalDate.now().toString();
    }

    public UUID getTransactionId() {
        return this.transactionId;
    }

    public UUID getAccountNumber() {
        return this.accountNumber;
    }

    public String getTransactionType() {
        return this.transactionType;
    }

    public double getAmount() {
        return this.amount;
    }

    public String getTransactionDate() {
        return this.transactionDate;
    }
}



