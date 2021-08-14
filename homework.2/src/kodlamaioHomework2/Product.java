package kodlamaioHomework2;

public class Product {
	
	private String courseName;
	private String courseDetail;
	private String courseInstructor;
	private String coursePrice;
	private String courseDiscountedPrice;
	
	public Product() {
		
	}
	public Product(String courseName, String courseDetail, String courseInstructor, String coursePrice,
			String courseDiscountedPrice) {
		super();
		this.courseName = courseName;
		this.courseDetail = courseDetail;
		this.courseInstructor = courseInstructor;
		this.coursePrice = coursePrice;
		this.courseDiscountedPrice = courseDiscountedPrice;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDetail() {
		return courseDetail;
	}
	public void setCourseDetail(String courseDetail) {
		this.courseDetail = courseDetail;
	}
	public String getCourseInstructor() {
		return courseInstructor;
	}
	public void setCourseInstructor(String courseInstructor) {
		this.courseInstructor = courseInstructor;
	}
	public String getCoursePrice() {
		return coursePrice;
	}
	public void setCoursePrice(String coursePrice) {
		this.coursePrice = coursePrice;
	}
	public String getCourseDiscountedPrice() {
		return courseDiscountedPrice;
	}
	public void setCourseDiscountedPrice(String courseDiscountedPrice) {
		this.courseDiscountedPrice = courseDiscountedPrice;
	}
	
	

}
