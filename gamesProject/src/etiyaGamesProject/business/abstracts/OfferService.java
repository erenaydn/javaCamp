package etiyaGamesProject.business.abstracts;

import java.util.ArrayList;

import etiyaGamesProject.entities.concretes.Offer;

public interface OfferService {
	void add(Offer offer);

	void update(Offer offer);

	void remove(Offer offer);

	ArrayList<Offer> getAllOffers();

}
