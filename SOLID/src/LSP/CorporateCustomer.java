package LSP;

public class CorporateCustomer extends CustomerManager{
	
	private String corporateName;
	private	String taxNumber;
	public CorporateCustomer() {
		super();
	}
	public CorporateCustomer(int id,String corporateName, String taxNumber) {
		super(id);
		this.corporateName = corporateName;
		this.taxNumber = taxNumber;
	}
	public String getCorporateName() {
		return corporateName;
	}
	public void setCorporateName(String corporateName) {
		this.corporateName = corporateName;
	}
	public String getTaxNumber() {
		return taxNumber;
	}
	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}
	
}
