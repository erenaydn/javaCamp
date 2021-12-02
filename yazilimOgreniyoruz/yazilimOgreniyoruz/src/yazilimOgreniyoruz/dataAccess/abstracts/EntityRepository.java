package yazilimOgreniyoruz.dataAccess.abstracts;

import java.util.List;

public interface EntityRepository<T> {

	List<T> getAllEntites();

	void add(T entity);

	void update(T entity);

	void delete(T entity);

}
