package kodluyoruzioHomework3;

public class InstructorManager  extends User{
	
	public void addInstructorCourse(Instructor user){
		System.out.println(user.getInstructorCourse()+" adlý kurs " + user.getInstructorId()+" kullanýcý idsi ile eklenmiþtir.");
	}

}
