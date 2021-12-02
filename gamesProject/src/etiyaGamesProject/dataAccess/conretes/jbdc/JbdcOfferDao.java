package etiyaGamesProject.dataAccess.conretes.jbdc;

import etiyaGamesProject.dataAccess.abstracts.OfferDao;
import etiyaGamesProject.entities.concretes.Offer;

public class JbdcOfferDao implements OfferDao {

	@Override
	public void add(Offer entity) {
		System.out.println(" Jbdc  datasina eklendi offer.");

	}

	@Override
	public void update(Offer entity) {
		System.out.println(" Jbdc  datasina güncellendi offer.");

	}

	@Override
	public void delete(Offer entity) {
		System.out.println(" Jbdc  datasina silindi offer.");

	}

}
