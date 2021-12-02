package etiyaGamesProject.business.concretes.gamerPlayManagers;

import etiyaGamesProject.business.abstracts.gamerPlayServices.GamerPlayService;
import etiyaGamesProject.entities.concretes.Game;
import etiyaGamesProject.entities.concretes.User;

public class MaleGamerPlayManager implements GamerPlayService {

	public MaleGamerPlayManager() {
		super();
	}

	@Override
	public void levelUp(User user, Game game) {
		System.out.println("Kullanici level atladi , hesabiniza birazdan puan yansiyacaktir. ");

		user.setGamerPoint(user.getGamerPoint() + 70);

		System.out.println(user.getGamerPoint() + " : yeni puan bu sekildedir. Erkek oyuncu puanlamasi yansimistir.");

	}

	@Override
	public void levelDown(User user, Game game) {
		System.out.println(user.getFirstName() + " adli Kullanici level düstü.");

	}

}
