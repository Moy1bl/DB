package codetest.customerservice.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    private UUID customerId;
    // @NotBlank(message = "First name cannot be an empty field")
    private String firstName;
    // @NotBlank(message = "Last name cannot be an empty field")
    private String lastName;
    private List<UUID> accountNumbers; 
    /*
    the accountNumbers field is not needed in the Customer entity class 
    because the Account entity class has a field called customerId
     */

    // no-argument constructor by JPA convention
    // creates instances of the entity class
    public Customer() {
    }

    public Customer(String firstName, String lastName) {
        this.customerId = UUID.randomUUID();
        this.accountNumbers = new ArrayList<UUID>();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public UUID getId() {
        return this.customerId;
    }

    public void setId(UUID customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<UUID> getAccountNumbers() {
        return this.accountNumbers;
    }

    public void addAccount(UUID accountNumber){
        accountNumbers.add(accountNumber);
    }

}
