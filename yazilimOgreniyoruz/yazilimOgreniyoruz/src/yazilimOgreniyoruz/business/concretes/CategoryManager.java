package yazilimOgreniyoruz.business.concretes;

import java.util.List;

import yazilimOgreniyoruz.business.abstracts.CategoryService;
import yazilimOgreniyoruz.dataAccess.abstracts.CategoryDao;
import yazilimOgreniyoruz.entities.concretes.Category;

public class CategoryManager implements CategoryService {

	CategoryDao categoryDao;

	public CategoryManager(CategoryDao categoryDao) {
		super();
		this.categoryDao = categoryDao;
	}

	@Override
	public List<Category> getAll() {

		return this.categoryDao.getAllEntites();
	}

	@Override
	public void add(Category category) {
		this.categoryDao.add(category);

	}

}
