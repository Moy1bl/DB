package codetest.accountservice.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import codetest.accountservice.model.Account;
import codetest.accountservice.service.AccountService;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService){
        this.accountService = accountService;
    }

    @PostMapping
    public ResponseEntity<Account> createAccount(@RequestBody UUID customerId){
        Account account = accountService.createAccount(customerId);
        return ResponseEntity.ok(account);
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<Double> getBalance(@PathVariable UUID customerId){
        Double balance = accountService.getBalance(customerId);
        return balance != null ? ResponseEntity.ok(balance) : ResponseEntity.notFound().build();
    }
    
}
