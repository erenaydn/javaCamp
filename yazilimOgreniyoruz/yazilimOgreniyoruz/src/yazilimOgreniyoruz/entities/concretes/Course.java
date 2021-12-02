package yazilimOgreniyoruz.entities.concretes;


import yazilimOgreniyoruz.entities.abstracts.Entity;

public class Course implements Entity {

	private int id;
	private int categoryId;
	private String name;
	private Trainer trainer;
	private String description;
	private String imgPath;

	public Course() {
		super();
	}

	public Course(int id, int categoryId, String name, Trainer trainer, String description, String imgPath) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.name = name;
		this.trainer = trainer;
		this.description = description;
		this.imgPath = imgPath;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

}
