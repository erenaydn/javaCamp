package etiyaGamesProject.business.concretes.gamerPlayManagers.chooseMethodForGamerPlayManager;

import java.time.LocalDate;

import etiyaGamesProject.business.abstracts.gamerPlayServices.GamerPlayService;
import etiyaGamesProject.business.abstracts.gamerPlayServices.chooseMethodForGamerPlayServices.LevelDownGamerPlayService;
import etiyaGamesProject.entities.concretes.Game;
import etiyaGamesProject.entities.concretes.User;

public class LevelDownForGamerPlayManager implements LevelDownGamerPlayService {

	LocalDate timenow = LocalDate.now();
	User user;
	GamerPlayService gamerPlayservice;

	public LevelDownForGamerPlayManager(GamerPlayService gamerPlayservice) {
		super();
		this.gamerPlayservice = gamerPlayservice;
	}

	public LevelDownForGamerPlayManager() {
		super();

	}

	@Override
	public void LevelDownChooseManager(User user, Game game) {

		this.gamerPlayservice.levelDown(user, game);

	}

}
