package etiyaGamesProject.entities.concretes;

import etiyaGamesProject.entities.abstracts.Entity;

public class Game implements Entity {
	private int id;
	private String name;

	private double unitePrice;

	public Game() {
		super();
	}

	public Game(int id, String name, double unitePrice) {
		super();
		this.name = name;
		this.id = id;
		this.unitePrice = unitePrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getUnitePrice() {
		return unitePrice;
	}

	public void setUnitePrice(double unitePrice) {
		this.unitePrice = unitePrice;
	}

}
