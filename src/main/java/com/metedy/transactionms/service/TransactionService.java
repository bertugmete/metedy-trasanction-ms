package com.metedy.transactionms.service;

import com.metedy.transactionms.model.Transaction;

import java.util.List;

public interface TransactionService {

    Transaction saveTransaction(Transaction transaction);

    void deleteTransaction(Long id);

    List<Transaction> findAllTransactionsOfUser(Long id);
}
