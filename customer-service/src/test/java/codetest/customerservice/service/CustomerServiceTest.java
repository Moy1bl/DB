package codetest.customerservice.service;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.verify;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.boot.test.context.SpringBootTest;

import codetest.customerservice.model.Customer;
import codetest.customerservice.repository.CustomerRepository;


@SpringBootTest
public class CustomerServiceTest {

    @Mock
    private CustomerRepository customerRepository;

    @InjectMocks
    private CustomerService customerService;

    @Test
    public void testSaveCustomer() {

        Customer customer = new Customer("John", "Doe");
        when(customerRepository.save(any(Customer.class))).thenReturn(customer);

        Customer savedCustomer = customerService.saveCustomer(customer.getFirstName(), customer.getLastName());

        assertThat(savedCustomer).isNotNull();
        verify(customerRepository).save(any(Customer.class));

    }
}
