package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void Save(Customer customer) {	// Design Note: Since Starbucks and Nero saves customers to the database in the same way/to the same table, this abstract class is created.
		System.out.println(customer.getFirstName() + " saved to the database!");
	}
	
}
