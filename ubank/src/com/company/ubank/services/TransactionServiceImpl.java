package com.company.ubank.services;


import com.company.ubank.dtos.Transaction;

public class TransactionServiceImpl implements TransactionService{
    private Transaction[] transactions;
    private int counter;
    public TransactionServiceImpl() {
        transactions = new Transaction[100];
        counter = 0;
    }

    @Override
    public Transaction createTransaction(Transaction transaction) {
        transactions[counter++] = transaction;
        return transaction;
    }

    @Override
    public Transaction[] getTransactions(int accountNo) {
        Transaction[] Atemp = new Transaction[100];
        int cTemp = 0;

        for(Transaction transaction : transactions) {
            if(transaction.getAccountNo() == accountNo) {
                Atemp[cTemp++] = transaction;
            }
        }
        return Atemp;
    }
}
