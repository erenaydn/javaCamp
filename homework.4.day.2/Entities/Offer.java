
public class Offer extends Base {
	private int offerId;
	private String offerName;
	private double discountRate;
	
	
	public Offer() {
		
		
	}

	public Offer(int offerId, String offerName, int discountRate) {
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
