
public class GameServiceManager implements IGameServiceManager{
	
	@Override
	public void add(Game game) {
		System.out.println(game.getGameName()+ " adlý oyun eklendi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName()+ " adlý oyun SÝLÝNDÝ.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName()+ " adlý oyun GÜNCELLENDÝ.");
		
	}

}
