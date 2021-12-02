package OCP;

public class CustomerManager implements CustomerDalService{

	private CustomerDalService customerDalService;
	
	public CustomerManager(CustomerDalService customerDalService) {
		super();
		this.customerDalService = customerDalService;
	}

	@Override
	public void add() {
		
		customerDalService.add();
		
	}	

}
