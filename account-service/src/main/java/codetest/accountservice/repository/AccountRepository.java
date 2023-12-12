package codetest.accountservice.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import codetest.accountservice.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, UUID> {
}
