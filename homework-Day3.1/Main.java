package kodluyoruzioHomework3;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setFirstName("Eren");
		student1.setStudentId("12345");
		student1.setLastName("Aydın");
		student1.setEmail("deneme@gmail.com");
		student1.setStudentWorks("Kodlamayı Engin hoca ile öğreniyorum");

		StudentManager studentManager = new StudentManager();

		studentManager.addStudentWork(student1);
		studentManager.studentWorkDone(student1);

		Instructor instructor = new Instructor();
		instructor.setFirstName("Engin");
		instructor.setInstructorCourse("Java öğretiyorum ! ");
		instructor.setInstructorId("32");

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addInstructorCourse(instructor);
		
		
		User user1 = new User();
		user1.setFirstName("Emre");
		user1.setEmail("deneme@gmail.com");
		user1.setLastName("Derin");
		user1.setUserid("furinar");
		
		UserManager userManager = new UserManager();
		userManager.addUser(user1);
	}

}
