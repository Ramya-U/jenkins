package com.cg.service;

import com.cg.model.Account;
import com.cg.model.Customer;

public interface IAccountService {
public Account createAccount(Customer customer,double amount);
}
