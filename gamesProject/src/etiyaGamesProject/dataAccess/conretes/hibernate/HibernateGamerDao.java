package etiyaGamesProject.dataAccess.conretes.hibernate;

import etiyaGamesProject.dataAccess.abstracts.GamerDao;
import etiyaGamesProject.entities.concretes.Gamer;

public class HibernateGamerDao implements GamerDao {

	@Override
	public void add(Gamer entity) {
		System.out.println(" Hibernate datasina eklendi oyuncu.");

	}

	@Override
	public void update(Gamer entity) {
		System.out.println(" Hibernate datasina güncellendi oyuncu..");

	}

	@Override
	public void delete(Gamer entity) {
		System.out.println(" Hibernate datasina silindi oyuncu..");

	}

}
