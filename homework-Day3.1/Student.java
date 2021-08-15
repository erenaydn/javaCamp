package kodluyoruzioHomework3;

public class Student extends User {
	private String studentId;
	private String studentWork;
	
	
	public Student() {
		super();
	}
	public Student(String studentId, String studentWork) {
		super();
		this.studentId = studentId;
		this.studentWork = studentWork;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentWork() {
		return studentWork;
	}
	public void setStudentWorks(String studentCourse) {
		this.studentWork = studentCourse;
	}
	
	

}
