package etiyaGamesProject.business.concretes.gamerPlayManagers;

import etiyaGamesProject.business.abstracts.gamerPlayServices.GamerPlayService;
import etiyaGamesProject.entities.concretes.Game;
import etiyaGamesProject.entities.concretes.User;

public class AgedGamerPlayManager implements GamerPlayService {

	public AgedGamerPlayManager() {
		super();
	}

	@Override
	public void levelUp(User user, Game game) {
		System.out.println("Kullanici level atladi , hesabiniza birazdan puan yansiyacaktir. ");

		user.setGamerPoint(user.getGamerPoint() + 90);

		System.out.println(user.getGamerPoint() + " : yeni puan bu sekildedir.Yasli kullanici puanlamasý yansimistir");

	}

	@Override
	public void levelDown(User user, Game game) {
		System.out.println(user.getFirstName() + " adli Kullanici level düstü.");

	}

}
