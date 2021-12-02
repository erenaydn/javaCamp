package yazilimOgreniyoruz.business.concretes;

import java.util.List;

import yazilimOgreniyoruz.business.abstracts.CourseService;
import yazilimOgreniyoruz.dataAccess.abstracts.CourseDao;
import yazilimOgreniyoruz.entities.concretes.Course;

public class CourseManager implements CourseService{
	
	CourseDao courseDao;
	
	public CourseManager(CourseDao courseDao) {
		super();
		this.courseDao = courseDao;
	}

	@Override
	public void add(Course course) {
		this.courseDao.add(course);
		
	}

	@Override
	public void search(String value) {
		for (Course courseItem : this.courseDao.getAllEntites()) {
			if (courseItem.getName() == value || courseItem.getTrainer().getFirstName() == value) {
				System.out.println(value + " ile arama sonucu çýkan kurslar: " + courseItem.getName());
			}
		}
		
	}

	@Override
	public List<Course> getAll() {
		// TODO Auto-generated method stub
		return this.courseDao.getAllEntites();
	}

}
