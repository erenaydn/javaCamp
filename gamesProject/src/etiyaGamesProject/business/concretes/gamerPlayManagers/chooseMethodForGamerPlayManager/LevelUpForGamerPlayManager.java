package etiyaGamesProject.business.concretes.gamerPlayManagers.chooseMethodForGamerPlayManager;

import java.time.LocalDate;

import etiyaGamesProject.business.abstracts.gamerPlayServices.GamerPlayService;
import etiyaGamesProject.business.abstracts.gamerPlayServices.chooseMethodForGamerPlayServices.LevelUpGamerPlayService;
import etiyaGamesProject.entities.concretes.Game;
import etiyaGamesProject.entities.concretes.User;

public class LevelUpForGamerPlayManager implements LevelUpGamerPlayService {

	LocalDate timenow = LocalDate.now();
	User user;
	GamerPlayService gamerPlayservice;

	public LevelUpForGamerPlayManager(GamerPlayService gamerPlayservice) {
		super();
		this.gamerPlayservice = gamerPlayservice;
	}

	public LevelUpForGamerPlayManager() {
		super();

	}

	@Override
	public void levelUpChooseManager(User user, Game game) {
		this.gamerPlayservice.levelUp(user, game);
	}

}
