package etiyaGamesProject.business.concretes;

import java.util.ArrayList;

import etiyaGamesProject.business.abstracts.GamerService;
import etiyaGamesProject.business.abstracts.UserIdentityValidatorService;
import etiyaGamesProject.dataAccess.abstracts.GamerDao;
import etiyaGamesProject.entities.concretes.Gamer;

public class GamerManager implements GamerService {

	UserIdentityValidatorService userIdentityValidatorService;
	GamerDao gamerDao;
	ArrayList<Gamer> gamers = new ArrayList<Gamer>();

	public GamerManager(UserIdentityValidatorService userIdentityValidatorService, GamerDao gamerDao) {
		super();
		this.userIdentityValidatorService = userIdentityValidatorService;
		this.gamerDao = gamerDao;
	}

	@Override
	public void add(Gamer gamer) {
		if (userIdentityValidatorService.isValid(gamer)) {
			System.out.println("Kullanici eklendi.");
			gamers.add(gamer);
			gamerDao.add(gamer);
		} else {
			System.out.println("Dogrulama basarisiz oldu.");
		}

	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Kullanici güncellendi.");

	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Kullanici silindi.");

	}

	@Override
	public ArrayList<Gamer> getAllGamers() {
		System.out.println("----");
		System.out.println(gamers);
		System.out.println("----");
		return gamers;
	}

	@Override
	public String toString() {
		return "GamerManager [userIdentityValidatorService=" + userIdentityValidatorService + ", gamers=" + gamers
				+ "]";
	}

}
