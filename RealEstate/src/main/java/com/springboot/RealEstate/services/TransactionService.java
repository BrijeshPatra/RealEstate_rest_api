package com.springboot.RealEstate.services;

import com.springboot.RealEstate.entity.Transaction;
import com.springboot.RealEstate.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    public Transaction getTransactionById(Long tid) {
        return transactionRepository.findById(tid)
                .orElseThrow(() -> new IllegalArgumentException("Invalid transaction ID: " + tid));
    }

    public Transaction createTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    public Transaction updateTransaction(Long tid, Transaction updatedTransaction) {
        Transaction transaction = transactionRepository.findById(tid)
                .orElseThrow(() -> new IllegalArgumentException("Invalid transaction ID: " + tid));

        transaction.setPrid(updatedTransaction.getPrid());
        transaction.setType(updatedTransaction.getType());
        transaction.setPrice(updatedTransaction.getPrice());
        transaction.setAmount(updatedTransaction.getAmount());

        return transactionRepository.save(transaction);
    }

    public void deleteTransaction(Long tid) {
        transactionRepository.deleteById(tid);
    }
}
