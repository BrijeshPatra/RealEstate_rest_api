package com.springboot.RealEstate.controller;

import com.springboot.RealEstate.entity.Transaction;
import com.springboot.RealEstate.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @GetMapping
    public List<Transaction> getAllTransactions() {
        return transactionService.getAllTransactions();
    }

    @GetMapping("/{tid}")
    public Transaction getTransactionById(@PathVariable Long tid) {
        return transactionService.getTransactionById(tid);
    }

    @PostMapping
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        return transactionService.createTransaction(transaction);
    }

    @PutMapping("/{tid}")
    public Transaction updateTransaction(@PathVariable Long tid, @RequestBody Transaction updatedTransaction) {
        return transactionService.updateTransaction(tid, updatedTransaction);
    }

    @DeleteMapping("/{tid}")
    public void deleteTransaction(@PathVariable Long tid) {
        transactionService.deleteTransaction(tid);
    }
}
