package etiyaGamesProject.business.concretes.gamerPlayManagers;

import etiyaGamesProject.business.abstracts.gamerPlayServices.GamerPlayService;
import etiyaGamesProject.entities.concretes.Game;
import etiyaGamesProject.entities.concretes.User;

public class FemaleGamerPlayManager implements GamerPlayService {
	
	public FemaleGamerPlayManager() {

	}

	@Override
	public void levelUp(User user, Game game) {
		System.out.println("Kullanici level atladi , hesabiniza birazdan puan yansiyacaktir. ");

		user.setGamerPoint(user.getGamerPoint() + 70);

		System.out.println(user.getGamerPoint() + " : yeni puan bu sekildedir.Kadin kullanici puanlamasý yansimistir");

	}

	@Override
	public void levelDown(User user, Game game) {
		System.out.println(user.getFirstName() + " adli Kullanici level düstü.");

	}

}
