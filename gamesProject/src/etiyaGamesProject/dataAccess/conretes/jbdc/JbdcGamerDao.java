package etiyaGamesProject.dataAccess.conretes.jbdc;

import etiyaGamesProject.dataAccess.abstracts.GamerDao;
import etiyaGamesProject.entities.concretes.Gamer;

public class JbdcGamerDao implements GamerDao {

	@Override
	public void add(Gamer entity) {
		System.out.println(" Jbdc  datasina eklendi gamer.");

	}

	@Override
	public void update(Gamer entity) {
		System.out.println(" Jbdc  datasina güncellendi gamer.");

	}

	@Override
	public void delete(Gamer entity) {
		System.out.println(" Jbdc  datasina silindi gamer...");

	}

}
