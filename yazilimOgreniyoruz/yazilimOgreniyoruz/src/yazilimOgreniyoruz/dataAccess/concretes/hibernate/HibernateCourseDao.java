package yazilimOgreniyoruz.dataAccess.concretes.hibernate;

import java.util.ArrayList;
import java.util.List;

import yazilimOgreniyoruz.dataAccess.abstracts.CourseDao;
import yazilimOgreniyoruz.entities.concretes.Course;

public class HibernateCourseDao implements CourseDao {
	
	List<Course> courses;
	
	public HibernateCourseDao() {
		super();
		this.courses = new ArrayList<Course>();
	}

	@Override
	public List<Course> getAllEntites() {
		
		
		return this.courses;
	}

	@Override
	public void add(Course entity) {
		System.out.println(entity.getName()+ " adli kurs eklendi. ");
		this.courses.add(entity);
	}

	@Override
	public void update(Course entity) {
		System.out.println(entity.getName()+ " adli kurs güncellendi. ");
		
	}

	@Override
	public void delete(Course entity) {
		System.out.println(entity.getName()+ " adli kurs silindi. ");
		
	}

}
