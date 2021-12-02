package yazilimOgreniyoruz.dataAccess.concretes.hibernate;

import java.util.ArrayList;
import java.util.List;

import yazilimOgreniyoruz.dataAccess.abstracts.CategoryDao;
import yazilimOgreniyoruz.entities.concretes.Category;

public class HibernateCategoryDao implements CategoryDao {
	List<Category> categories;

	public HibernateCategoryDao() {
		super();
		this.categories = new ArrayList<Category>();
	}

	@Override
	public List<Category> getAllEntites() {

		return this.categories;
	}

	@Override
	public void add(Category entity) {
		System.out.println(entity.getName() + " adli kategori eklendi. ");
		this.categories.add(entity);
	}

	@Override
	public void update(Category entity) {
		System.out.println(entity.getName() + " adli kategori güncellendi. ");

	}

	@Override
	public void delete(Category entity) {
		System.out.println(entity.getName() + " adli kategori silindi. ");

	}

}
