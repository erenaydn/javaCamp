

public class StarbucksCustomerManager extends BaseCustomerManager implements ICustomerService  {
	
	ICustomerCheckService _customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService _customerCheckService) {
		this._customerCheckService = _customerCheckService;
		
	}
	
	@Override
	public void save(Customer customer){
		
		if(_customerCheckService.checkRealPersonService(customer)) {
			this.save(customer);
		}
		else {
			System.out.println("Not a valid person");
		}
		
		
	}

}
