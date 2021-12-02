package etiyaGamesProject.business.abstracts;

import java.util.ArrayList;

import etiyaGamesProject.entities.concretes.Gamer;

public interface GamerService {
	void add(Gamer gamer);

	void update(Gamer gamer);

	void delete(Gamer gamer);

	ArrayList<Gamer> getAllGamers();

}
