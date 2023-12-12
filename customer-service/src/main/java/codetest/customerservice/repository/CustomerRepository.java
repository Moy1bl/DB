package codetest.customerservice.repository;

import codetest.customerservice.model.Customer;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, UUID> {
}
