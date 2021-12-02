package yazilimOgreniyoruz.entities.concretes;

public class Trainer extends User {
	private String imgPath;

	public Trainer() {
		super();
	}

	public Trainer(int id, String firstName, String lastName, String email, String password, String imgPath) {
		super(id, firstName, lastName, email, password);
		this.imgPath = imgPath;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
}
