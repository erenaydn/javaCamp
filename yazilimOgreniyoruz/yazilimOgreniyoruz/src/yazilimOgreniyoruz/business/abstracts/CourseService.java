package yazilimOgreniyoruz.business.abstracts;

import java.util.List;

import yazilimOgreniyoruz.entities.concretes.Course;

public interface CourseService {

	void add(Course course);

	void search(String value);

	List<Course> getAll();

}
