
public class OfferServiceManager implements IOfferServiceManager {

	@Override
	public void add(Offer offer) {
		System.out.println(offer.getOfferName()+ " adlý kampanya  eklendi.");
		
	}

	@Override
	public void update(Offer offer) {
		System.out.println(offer.getOfferName()+ " adlý kampanya  güncellendi.");
		
	}

	@Override
	public void delete(Offer offer) {
		System.out.println(offer.getOfferName()+ " adlý kampanya  silindi.");
		
	}

}
