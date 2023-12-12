package codetest.transactionservice.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import codetest.transactionservice.model.Transaction;
import codetest.transactionservice.repository.TransactionRepository;
import jakarta.transaction.Transactional;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;


    @Transactional
    public Transaction deposite(UUID accountNumber, String transactionType, double amount) {
        Transaction transaction = new Transaction(accountNumber, transactionType, amount);
        return transactionRepository.save(transaction);
    }
    
    @Transactional
    public Transaction withdraw(UUID accountNumber, String transactionType, double amount) {
        Transaction transaction = new Transaction(accountNumber, transactionType, amount);
        return transactionRepository.save(transaction);
    }
    
    public List<Transaction> getLast10Transactions(UUID accountId) {
        return transactionRepository.findLast10TransactionsByAccount(accountId);
    }
}
