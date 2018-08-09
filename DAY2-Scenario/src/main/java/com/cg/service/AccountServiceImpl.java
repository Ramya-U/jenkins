package com.cg.service;

import com.cg.model.Account;
import com.cg.model.Customer;
import com.cg.util.AccountUtil;

public class AccountServiceImpl implements IAccountService {

	@Override
	public Account createAccount(Customer customer, double amount) {
		Account account=null;
		if(customer!=null) {
			account=new Account();
			account.setCustomer(customer);
			if(amount>0) {
				if(amount==1000) {
					account.setAccountType("savings");
					account.setOpeningBalance(amount);
				}
					else if(amount==10000) {
						account.setAccountType("current");
						account.setOpeningBalance(amount);
					}
						else if(amount==100) {
							account.setAccountType("RD");
							account.setOpeningBalance(amount);
						}	
						else if(amount==500) {
						account.setAccountType("FD");
						account.setOpeningBalance(amount);
					}
				}
			}

			
		account.setAccountNo(AccountUtil.generateAccountNo());
		return account;
	}

}
