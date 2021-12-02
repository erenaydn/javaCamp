package etiyaGamesProject.entities.concretes;

import etiyaGamesProject.entities.abstracts.Entity;

public class Offer implements Entity {

	private int offerId;
	private String offerName;
	private double discountRate;

	public Offer() {
		super();
	}

	public Offer(int offerId, String offerName, double discountRate) {
		super();
		this.offerId = offerId;
		this.offerName = offerName;
		this.discountRate = discountRate;
	}

	public int getOfferId() {
		return offerId;
	}

	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}

	public String getOfferName() {
		return offerName;
	}

	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

}
