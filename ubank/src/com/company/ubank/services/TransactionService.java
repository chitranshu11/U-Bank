package com.company.ubank.services;


import com.company.ubank.dtos.Transaction;

public interface TransactionService {
    Transaction createTransaction (Transaction transaction);
    Transaction[] getTransactions (int accountNo);
}
