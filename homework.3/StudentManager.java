package kodluyoruzioHomework3;

public class StudentManager {
	public void studentWorkDone(Student user) {
		
		System.out.println(user.getStudentId()+"  öðrenci idsi olan öðrenci "+user.getStudentWork()+" adlý  ödevi tamamladý");
		
		
	}
	public void addStudentWork(Student user) {
		System.out.println(user.getFirstName()+" adlý öðrenci "+user.getStudentWork() +" adlý ödevi ekledi.");
	}

}
