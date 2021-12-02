package youtubeSRP;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Single Responsibility Prenciple ;
	public class CustomerManager {

		// Aspect oriented programming;
		public void TransactionalOperation() {
			update();
			save();
		}

		public void update() {

			MyContext myContext = new MyContext();
			myContext.update();

		}

		public void save() {

			MyContext myContext = new MyContext();
			myContext.save();

		}
	}

	public class MyContext {

		public void update() {

		}

		public void save() {

		}

	}

	public class PersonManager {
		public void update() {
			CustomerManager customerManager = new CustomerManager();
			customerManager.TransactionalOperation();

		}
	}
}
