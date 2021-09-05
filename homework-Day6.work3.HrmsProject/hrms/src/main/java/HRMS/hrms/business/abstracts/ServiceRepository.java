package HRMS.hrms.business.abstracts;

import java.util.List;

public interface ServiceRepository<T> {

	List<T> getAll();

	void add(T entity);

	void update(T entity);

	void delete(T entity);

}
