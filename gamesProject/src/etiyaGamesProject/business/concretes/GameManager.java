package etiyaGamesProject.business.concretes;

import etiyaGamesProject.business.abstracts.GameService;
import etiyaGamesProject.dataAccess.abstracts.GameDao;
import etiyaGamesProject.entities.concretes.Game;

public class GameManager implements GameService {

	GameDao gameDao;

	public GameManager(GameDao gameDao) {
		super();
		this.gameDao = gameDao;
	}

	@Override
	public void add(Game game) {
		System.out.println("Oyun sisteme eklendi.");
		gameDao.add(game);

	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun güncellendi.");
		gameDao.update(game);

	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun sistemden silindi.");
		gameDao.delete(game);

	}

}
