package LSP;

public class CustomerManager {
// Liskov's Substitution
	private int id;

	public CustomerManager() {
		super();
	}

	public CustomerManager(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
