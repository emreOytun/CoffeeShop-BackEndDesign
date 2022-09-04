import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Adapter.MernisCustomerCheckService;
import Concrete.*;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.Save(new Customer(1, "Emre", "Oytun", "16/02/2001", "Turk"));
	
		CustomerCheckService checkService = new MernisCustomerCheckService();
		System.out.print(checkService.CheckIfRealPerson(new Customer(1, "Emre", "Oytun", "16/02/2001", "22778039570")));
	}

}
