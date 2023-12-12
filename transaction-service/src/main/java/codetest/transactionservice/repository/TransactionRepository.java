package codetest.transactionservice.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import codetest.transactionservice.model.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, UUID> {
    @Query("SELECT t FROM Transaction t WHERE t.accountNumber = :accountNumber ORDER BY t.transactionDate DESC")
    List<Transaction> findLast10TransactionsByAccount(@Param("accountNumber") UUID accountNumber);

}