package codetest.customerservice.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import codetest.customerservice.model.Customer;
import codetest.customerservice.repository.CustomerRepository;

@Service
public class CustomerService {

    /*
    Key considerations:
    - Validation: it is importannt to make sure that a customer that exists is not created again,
    ensure valid inputs, etc. 
    - Additional features can be used, for instance email. 
    - For each customer, an account should be created. 
    */
    
    private final CustomerRepository customerRepository;

    @Autowired // constructor injection
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    // .save() from JPA
    public Customer saveCustomer(String firstName, String lastName) {
        Customer newCustomer = new Customer(firstName, lastName);
        return customerRepository.save(newCustomer);
    }

    public Customer getCustomerById(UUID id) {
        return customerRepository.findById(id).orElse(null);
    }

}
