package com.company.ubank.services;


import com.company.ubank.dtos.Account;
import com.company.ubank.exceptions.AccountAlreadyRegisteredException;
import com.company.ubank.exceptions.AccountNotFoundException;
import com.company.ubank.exceptions.IncorrectPasswordException;
import com.company.ubank.exceptions.InsufficientBalanceException;

public interface AccountService {
    boolean login (Account account) throws AccountNotFoundException, IncorrectPasswordException;
    boolean register (Account account) throws AccountAlreadyRegisteredException;
    Account getAccount (int accountNo) throws AccountNotFoundException;
    Account deposit (int accountNo, int amount) throws AccountNotFoundException;
    Account withdraw (int accountNo, int amount) throws AccountNotFoundException, InsufficientBalanceException;
}
