package etiyaGamesProject.dataAccess.conretes.jbdc;

import etiyaGamesProject.dataAccess.abstracts.GameDao;
import etiyaGamesProject.entities.concretes.Game;

public class JbdcGameDao implements GameDao {

	@Override
	public void add(Game entity) {
		System.out.println(" Jbdc  datasina eklendi game...");

	}

	@Override
	public void update(Game entity) {
		System.out.println(" Jbdc  datasina güncellendi game..");

	}

	@Override
	public void delete(Game entity) {
		System.out.println(" Jbdc  datasindan silindi game...");

	}

}
