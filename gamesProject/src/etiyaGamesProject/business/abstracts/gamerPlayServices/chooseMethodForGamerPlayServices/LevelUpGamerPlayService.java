package etiyaGamesProject.business.abstracts.gamerPlayServices.chooseMethodForGamerPlayServices;

import etiyaGamesProject.entities.concretes.Game;
import etiyaGamesProject.entities.concretes.User;

public interface LevelUpGamerPlayService {
	void levelUpChooseManager(User user, Game game);

}
