package codetest.accountservice.model;

import java.util.UUID;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "accounts")
public class Account {
    
    @Id
    private UUID accountNumber;

    private UUID customerId;
    private Double balance;

    public Account() {
    }

    public Account(UUID customerId) {
        this.accountNumber = UUID.randomUUID();
        this.customerId = customerId;
        this.balance = 0.0;
    }

    public UUID getAccountNumber() {
        return this.accountNumber;
    }

    public UUID getCustomerId() {
        return this.customerId;
    }

    public void setBalance(Double balance){
        this.balance = balance;
    }

    public Double getBalance() {
        return this.balance;
    }

}
