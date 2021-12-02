package yazilimOgreniyoruz.business.abstracts;

import java.util.List;

import yazilimOgreniyoruz.entities.concretes.Category;

public interface CategoryService {

	List<Category> getAll();

	void add(Category category);

}
