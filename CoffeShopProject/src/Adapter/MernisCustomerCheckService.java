package Adapter;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisCustomerCheckService implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoap client = new KPSPublicSoapProxy();
		
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationality()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), 2001);
		} catch (NumberFormatException e) {
			System.out.println("Number format is invalid!");
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
}
