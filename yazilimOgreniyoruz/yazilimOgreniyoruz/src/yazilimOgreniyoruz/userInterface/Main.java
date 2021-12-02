package yazilimOgreniyoruz.userInterface;

import yazilimOgreniyoruz.business.abstracts.CategoryService;
import yazilimOgreniyoruz.business.abstracts.CourseService;
import yazilimOgreniyoruz.business.abstracts.TrainerService;
import yazilimOgreniyoruz.business.concretes.CategoryManager;
import yazilimOgreniyoruz.business.concretes.CourseManager;
import yazilimOgreniyoruz.business.concretes.TrainerManager;
import yazilimOgreniyoruz.dataAccess.concretes.hibernate.HibernateCategoryDao;
import yazilimOgreniyoruz.dataAccess.concretes.hibernate.HibernateCourseDao;
import yazilimOgreniyoruz.dataAccess.concretes.hibernate.HibernateTrainerDao;
import yazilimOgreniyoruz.entities.concretes.Category;
import yazilimOgreniyoruz.entities.concretes.Course;
import yazilimOgreniyoruz.entities.concretes.Trainer;


public class Main {

	public static void main(String[] args) {
		Trainer trainer1 = new Trainer(1, "Engin", "Demiroð", "engin.demirog@etiya.com", "12345", "yakisikli.jpg");

		TrainerService trainerService = new TrainerManager(new HibernateTrainerDao());
		trainerService.add(trainer1);
		
		for (Trainer trainerItem : trainerService.getAll()) {
			System.out.println("Eðitmenler: " + trainerItem.getFirstName());
		}

		Course course1 = new Course();
		course1.setId(1);
		course1.setCategoryId(1);
		course1.setName("Java");
		course1.setDescription("Java'ya giriþ");
		course1.setImgPath("Java.jpg");
		course1.setTrainer(trainer1);
		
		CourseService courseService = new CourseManager(new HibernateCourseDao());
		courseService.add(course1);
		
		for (Course courseItem : courseService.getAll()) {
			System.out.println(courseItem.getName() + " eðitiminin hocasý: " + courseItem.getTrainer().getFirstName() + " resmi: " + courseItem.getTrainer().getImgPath());
		}


		Category category1 = new Category(1, "Programlama", "Programlamaya giriþ");

		CategoryService categoryService = new CategoryManager(new HibernateCategoryDao());
		categoryService.add(category1);
		
		for (Category categoryItem : categoryService.getAll()) {
			System.out.println("Kategoriler: " + categoryItem.getName());
		}
		
		courseService.search("Engin");
		

	}

}
