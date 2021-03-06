package concretes;

import abstracts.CustomerManager;
import entities.Customer;
import abstracts.CustomerCheckService;

public class StarbucksCustomerManager extends CustomerManager {
	 CustomerCheckService customerCheckService;
	
	 public StarbucksCustomerManager(CustomerCheckService customerCheckService)
	 {
		 this.customerCheckService=customerCheckService;
	 }
	 @Override 
	 public void save (Customer customer) {
		 if (customerCheckService.checkIfRealPerson(customer)) {
			 super.save(customer);
			 System.out.println("Customer Checked!");
		 }
		 else {
			 throw new RuntimeException("Not a valid customer!");
		 }
	 }
	 
}
