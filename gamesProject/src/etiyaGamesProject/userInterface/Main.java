package etiyaGamesProject.userInterface;

import etiyaGamesProject.business.abstracts.gamerPlayServices.chooseMethodForGamerPlayServices.LevelDownGamerPlayService;
import etiyaGamesProject.business.abstracts.gamerPlayServices.chooseMethodForGamerPlayServices.LevelUpGamerPlayService;
import etiyaGamesProject.business.concretes.GameManager;
import etiyaGamesProject.business.concretes.GamerManager;
import etiyaGamesProject.business.concretes.SaleManager;
import etiyaGamesProject.business.concretes.gamerPlayManagers.AgedGamerPlayManager;
import etiyaGamesProject.business.concretes.gamerPlayManagers.ChildGamerPlayManager;
import etiyaGamesProject.business.concretes.gamerPlayManagers.FemaleGamerPlayManager;
import etiyaGamesProject.business.concretes.gamerPlayManagers.MaleGamerPlayManager;
import etiyaGamesProject.business.concretes.gamerPlayManagers.chooseMethodForGamerPlayManager.LevelDownForGamerPlayManager;
import etiyaGamesProject.business.concretes.gamerPlayManagers.chooseMethodForGamerPlayManager.LevelUpForGamerPlayManager;
import etiyaGamesProject.cores.MernisKPSServiceAdapter;
import etiyaGamesProject.dataAccess.conretes.hibernate.HibernateGameDao;
import etiyaGamesProject.dataAccess.conretes.hibernate.HibernateGamerDao;
import etiyaGamesProject.entities.concretes.Game;
import etiyaGamesProject.entities.concretes.Gamer;
import etiyaGamesProject.entities.concretes.Offer;
import etiyaGamesProject.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		Gamer maleGamer = new Gamer("12345678910", "Eren", "Aydin", 1995, "Male", 0);
		Gamer femaleGamer = new Gamer("1098765431", "Deniz", "Aydin", 1995, "Female", 0);
		User childGamer = new Gamer("10987654321", "Cansu", "Aydin", 2010, "Female", 0);
		User agedGamer = new Gamer("10987654321", "Ceren", "Aydin", 1950, "Female", 0);

		Game lolGame = new Game(11, "Lol", 150);
		Game dotagame = new Game(12, "Dota", 130);
		Game pubgGame = new Game(13, "Pubg", 450);

		Offer offer1 = new Offer(1, "Yil basi ", 20);

		// -------------------Oyuncu kayit islemleri..-----------
		GamerManager gamerManager = new GamerManager(new MernisKPSServiceAdapter(), new HibernateGamerDao());
		// kimlik bilgisi uzunlugu dogru kullanici
		gamerManager.add(maleGamer);
		System.out.println("------");
		// kimlik bilgisi uzunlugu yanlis kullanici
		gamerManager.add(femaleGamer);
		// eklenen oyunculari goruntuleme
		gamerManager.getAllGamers();
		System.out.println("------");

		// -------------------------Oyun satis islemleri..---------------
		SaleManager sellingManager = new SaleManager();
		sellingManager.sellService(childGamer, pubgGame, offer1);
		System.out.println("------");

		// ------------------- Oyun ekleme islemleri------------
		GameManager gameManager = new GameManager(new HibernateGameDao());
		gameManager.add(dotagame);
		gameManager.delete(pubgGame);
		gameManager.update(lolGame);

		System.out.println("------");
		// ---------------- Oyuncuyu level atlatarak puan verme sistemi..------------
		LevelUpGamerPlayService ageGamerPlayer = new LevelUpForGamerPlayManager(new AgedGamerPlayManager());
		LevelUpGamerPlayService childGamerPlayer = new LevelUpForGamerPlayManager(new ChildGamerPlayManager());
		LevelUpGamerPlayService femaleGamerPlayer = new LevelUpForGamerPlayManager(new FemaleGamerPlayManager());
		LevelUpGamerPlayService maleGamerPlayer = new LevelUpForGamerPlayManager(new MaleGamerPlayManager());

		childGamerPlayer.levelUpChooseManager(childGamer, lolGame);
		System.out.println("------");
		femaleGamerPlayer.levelUpChooseManager(femaleGamer, dotagame);
		System.out.println("------");
		ageGamerPlayer.levelUpChooseManager(agedGamer, pubgGame);
		System.out.println("------");
		maleGamerPlayer.levelUpChooseManager(maleGamer, pubgGame);
		System.out.println("------");

		// ------------------- Oyuncuyu level düsürme sistemi --------
		LevelDownGamerPlayService ageGamerPlayer2 = new LevelDownForGamerPlayManager(new AgedGamerPlayManager());
		LevelDownGamerPlayService childGamerPlayer2 = new LevelDownForGamerPlayManager(new ChildGamerPlayManager());
		LevelDownGamerPlayService femaleGamerPlayer2 = new LevelDownForGamerPlayManager(new FemaleGamerPlayManager());
		LevelDownGamerPlayService maleGamerPlayer2 = new LevelDownForGamerPlayManager(new MaleGamerPlayManager());

		femaleGamerPlayer2.LevelDownChooseManager(femaleGamer, pubgGame);
		ageGamerPlayer2.LevelDownChooseManager(agedGamer, pubgGame);
		childGamerPlayer2.LevelDownChooseManager(childGamer, pubgGame);
		maleGamerPlayer2.LevelDownChooseManager(maleGamer, pubgGame);
		System.out.println("------");

	}

}
