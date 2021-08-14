package kodlamaioHomework2;

public class ProductServiceManager  {

	public void add(Product product) {

		System.out.println(product.getCourseName() + " adlý kurs eklendi. ");
	}

	public void delete(Product product) {

		System.out.println(product.getCourseName() + " adlý kurs silindi. ");
	}

	public void update(Product product) {

		System.out.println(product.getCourseName() + " adlý kurs güncellendi. ");
	}
	public void getAll(Product[] products) {
		
		for(Product product: products) {
			
			System.out.println(product.getCourseName());
			System.out.println(product.getCourseInstructor());
			System.out.println(product.getCourseDiscountedPrice());
		}
	}
}
