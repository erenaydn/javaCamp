
public class GamerServiceManager implements IGamerServiceManager{

	@Override
	public void add(Gamer gamer) {
		System.out.println(gamer.getFirstName()+ " adlý kullanýcý eklendi.");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName()+ " adlý kullanýcý güncellendi.");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+ " adlý kullanýcý silindi.");
	}
	
	
	
	
}
