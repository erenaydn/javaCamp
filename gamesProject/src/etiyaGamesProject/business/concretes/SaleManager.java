package etiyaGamesProject.business.concretes;

import etiyaGamesProject.business.abstracts.SaleService;
import etiyaGamesProject.entities.concretes.Game;
import etiyaGamesProject.entities.concretes.Offer;
import etiyaGamesProject.entities.concretes.User;

public class SaleManager implements SaleService {

	@Override
	public void sellService(User user, Game game, Offer offer) {

		double discountedPrice = game.getUnitePrice() - (game.getUnitePrice() * (offer.getDiscountRate() / 100));

		System.out.println(user.getFirstName() + " adli oyuncu " + game.getName() + " adli oyunu "
				+ offer.getOfferName() + "adli kampanya ile " + offer.getDiscountRate() + " indirim yüzdesi ile "
				+ discountedPrice + " TL ücreti ile almistir.");

	}

}
