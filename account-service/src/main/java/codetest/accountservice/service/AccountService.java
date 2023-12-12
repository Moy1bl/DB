package codetest.accountservice.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import codetest.accountservice.model.Account;
import codetest.accountservice.repository.AccountRepository;


@Service
public class AccountService {

    private final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account createAccount(UUID customerId){
        Account account = new Account(customerId);
        return accountRepository.save(account);
    }

    public Account getAccountById(UUID accountId){
        return accountRepository.findById(accountId).orElse(null);
    }

    public Double getBalance(UUID accountId){
        Account account = getAccountById(accountId);
        return account != null ? account.getBalance() : null;
    }    
}
