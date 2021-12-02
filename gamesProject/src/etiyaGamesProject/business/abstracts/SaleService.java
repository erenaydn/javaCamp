package etiyaGamesProject.business.abstracts;

import etiyaGamesProject.entities.concretes.Game;
import etiyaGamesProject.entities.concretes.Offer;
import etiyaGamesProject.entities.concretes.User;

public interface SaleService {

	void sellService(User user, Game game, Offer offer);

}
