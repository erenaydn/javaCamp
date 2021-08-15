
public class Game extends Base {

	private String gameName;
	private String gameType;
	private double gamePrice;
	
	public Game() {
		
	}

	public Game(String gameName, String gameType, double gamePrice) {
		super();
		this.gameName = gameName;
		this.gameType = gameType;
		this.gamePrice = gamePrice;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getGameType() {
		return gameType;
	}

	public void setGameType(String gameType) {
		this.gameType = gameType;
	}

	public double getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}

}
