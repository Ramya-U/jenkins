package createAccount;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.cg.model.Account;
import com.cg.model.Address;
import com.cg.model.Customer;
import com.cg.service.AccountServiceImpl;
import com.cg.service.IAccountService;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	private Customer customer;
	private double openingBalance;
	private Account account;
    private IAccountService accService;

	@Before
	public void setUp() {
		customer=new Customer();
		accService=new AccountServiceImpl();
			}
	
	
	@Given("^customer details and opening balance$")
	public void customer_details_and_opening_balance() throws Throwable {
	  customer.setFirstName("Tom");
	  customer.setLastName("jerry");
	  Address address=new Address();
	  address.setCity("Chennai");
	  address.setDoorNo(11);
	  openingBalance=1000;
	}

	@When("^for valid customer with minimum opening balance (\\d+)$")
	public void for_valid_customer_with_minimum_opening_balance(int amount) throws Throwable {
	   this.openingBalance=amount;
	}

	@Then("^create new Savings account$")
	public void create_new_Savings_account() throws Throwable {
	   account=accService.createAccount(customer,openingBalance);
	   assertNotNull(account);
	   assertEquals("savings",account.getAccountType());
	}

	@Then("^create new Current account$")
	public void create_new_Current_account() throws Throwable {
		  account=accService.createAccount(customer,openingBalance);
		   assertNotNull(account);
		   assertEquals("current",account.getAccountType());
	}

	@Then("^create new RD account$")
	public void create_new_RD_account() throws Throwable {
		  account=accService.createAccount(customer,openingBalance);
		   assertNotNull(account);
		   assertEquals("RD",account.getAccountType());
	}

	@Then("^create new FD account$")
	public void create_new_FD_account() throws Throwable {
		  account=accService.createAccount(customer,openingBalance);
		   assertNotNull(account);
		   assertEquals("FD",account.getAccountType());
	}


}
