import java.rmi.RemoteException;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {

		SaleManager sales = new SaleManager();

		Gamer gamer1 = new Gamer("Eren", "Aydýn", "1234", LocalDate.of(1996, 06, 15));

		Game game1 = new Game("Pubg", "FPS", 1500);

		Offer offer1 = new Offer(123, "YIL BAÞI ", 20);
		
		

		// Mernis doðrulama
		MernisServiceAdapter manager = new MernisServiceAdapter();
		manager.CheckRealPerson(gamer1);
		// sistem check return true dönen

		CheckRealService manager1 = new CheckRealService();
		manager1.CheckRealPerson(gamer1);

		// oyun kayýt, silme, update
		GameServiceManager gamemanager = new GameServiceManager();
		gamemanager.add(game1);
		gamemanager.delete(game1);
		gamemanager.update(game1);
		// User kayýt, silme, update

		GamerServiceManager gamermanager = new GamerServiceManager();
		gamermanager.add(gamer1);
		gamermanager.delete(gamer1);
		gamermanager.update(gamer1);

		// kampanya kayýt, silme, update

		OfferServiceManager offermanager = new OfferServiceManager();
		offermanager.add(offer1);
		offermanager.delete(offer1);
		offermanager.update(offer1);
		
		// Satýþ iþlemi 
		sales.sellGame(gamer1, game1, offer1);

	}

}
