package etiyaGamesProject.dataAccess.abstracts;

public interface EntitityRepository<T> {

	void add(T entity);

	void update(T entity);

	void delete(T entity);

}
