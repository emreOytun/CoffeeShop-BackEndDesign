package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbuckCustomerManager extends BaseCustomerManager {
	CustomerCheckService customerCheckService;
		
	public StarbuckCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) {
		if (customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);	// saves to the DB
		} else {
			System.out.println("Invalid person!");
		}
	}

}
