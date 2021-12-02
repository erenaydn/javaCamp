package etiyaGamesProject.dataAccess.conretes.hibernate;

import etiyaGamesProject.dataAccess.abstracts.OfferDao;
import etiyaGamesProject.entities.concretes.Offer;

public class HibernateOfferDao implements OfferDao {

	@Override
	public void add(Offer entity) {
		System.out.println(" Hibernate datasina eklendi offer..");

	}

	@Override
	public void update(Offer entity) {
		System.out.println(" Hibernate datasina güncellendi offer..");

	}

	@Override
	public void delete(Offer entity) {
		System.out.println(" Hibernate datasina silindi offer..");

	}

}
