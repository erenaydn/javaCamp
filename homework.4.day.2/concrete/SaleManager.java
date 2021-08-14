
public class SaleManager implements SaleService {

	@Override
	public void sellGame(Gamer gamer, Game game, Offer offer) {
		
		double discountedPrice = game.getGamePrice()*(offer.getDiscountRate()/100);
		
		System.out.println(gamer.getFirstName()+" adlý kullanýcý "+ game.getGameName()+" adlý oyunu "+
		offer.getDiscountRate()+" indirim oraný ile "+discountedPrice+ " fiyatýndan satýn almýþtýr.");
		
	}
	
	
	
	

}
