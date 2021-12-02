package etiyaGamesProject.dataAccess.conretes.hibernate;

import etiyaGamesProject.dataAccess.abstracts.GameDao;
import etiyaGamesProject.entities.concretes.Game;

public class HibernateGameDao implements GameDao {

	@Override
	public void add(Game entity) {
		System.out.println(" Hibernate datasina eklendi.");

	}

	@Override
	public void update(Game entity) {
		System.out.println(" Hibernate datasina güncellendi.");
	}

	@Override
	public void delete(Game entity) {
		System.out.println(" Hibernate datasindan silindi.");

	}

}
