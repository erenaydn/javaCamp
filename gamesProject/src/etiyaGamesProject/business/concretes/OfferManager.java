package etiyaGamesProject.business.concretes;

import java.util.ArrayList;

import etiyaGamesProject.business.abstracts.OfferService;
import etiyaGamesProject.dataAccess.abstracts.OfferDao;
import etiyaGamesProject.entities.concretes.Offer;

public class OfferManager implements OfferService {

	ArrayList<Offer> offers = new ArrayList<Offer>();

	OfferDao offerDao;

	public OfferManager(OfferDao offerDao) {
		super();
		this.offerDao = offerDao;
	}

	@Override
	public void add(Offer offer) {
		System.out.println("Kampanya sisteme eklendi");
		offers.add(offer);
		offerDao.add(offer);

	}

	@Override
	public void update(Offer offer) {
		System.out.println("Kampanya güncellendi.");

	}

	@Override
	public void remove(Offer offer) {
		System.out.println("Kampanya silindi.");

	}

	@Override
	public ArrayList<Offer> getAllOffers() {

		System.out.println("----");
		System.out.println(offers);
		System.out.println();
		return offers;
	}

}
