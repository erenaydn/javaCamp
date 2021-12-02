package etiyaGamesProject.business.abstracts.gamerPlayServices;

import etiyaGamesProject.entities.concretes.Game;
import etiyaGamesProject.entities.concretes.User;

public interface GamerPlayService {

	void levelUp(User user, Game game);

	void levelDown(User User, Game game);

}
