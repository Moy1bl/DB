package codetest.transactionservice.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import codetest.transactionservice.model.Transaction;
import codetest.transactionservice.service.TransactionService;
import codetest.transactionservice.dto.TransactionRequest;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping("/deposit")
    public ResponseEntity<Transaction> deposit(@RequestBody TransactionRequest transactionRequest) {
        System.out.println("TransactionController: deposit: transactionRequest: " + transactionRequest);
        Transaction savedTransaction = transactionService.deposite(transactionRequest.getAccountId(),
                transactionRequest.getTypeOfTransaction(), transactionRequest.getAmount());
        return ResponseEntity.ok(savedTransaction);
    }

    @PostMapping("/withdraw")
    public ResponseEntity<Transaction> withdraw(@RequestBody TransactionRequest transactionRequest) {
        System.out.println("TransactionController: withdraw: transactionRequest: " + transactionRequest);
        Transaction savedTransaction = transactionService.withdraw(transactionRequest.getAccountId(),
                transactionRequest.getTypeOfTransaction(), transactionRequest.getAmount());
        return ResponseEntity.ok(savedTransaction);
    }

    @GetMapping("/accounts/{accountNumber}/transactions")
    public ResponseEntity<List<Transaction>> getTransactionsByAccount(@PathVariable UUID accountNumber) {
        List<Transaction> transactions = transactionService.getLast10Transactions(accountNumber);
        return ResponseEntity.ok(transactions);
    }

}
