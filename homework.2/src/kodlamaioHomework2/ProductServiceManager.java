package kodlamaioHomework2;

public class ProductServiceManager  {

	public void add(Product product) {

		System.out.println(product.getCourseName() + " adlý kurs eklendi. ");
		System.out.println("-----");
	}

	public void delete(Product product) {

		System.out.println(product.getCourseName() + " adlý kurs silindi. ");
		System.out.println("-----");
	}

	public void update(Product product) {

		System.out.println(product.getCourseName() + " adlý kurs güncellendi. ");
		System.out.println("-----");
	}
	public void getAll(Product[] products) {
		
		for(Product product: products) {
			
			System.out.println("Kurs adý : "+product.getCourseName());
			System.out.println("Kurs hocasý : "+product.getCourseInstructor());
			System.out.println("Kurs indirimli fiyatý : "+product.getCourseDiscountedPrice());
			System.out.println("----- ");
		}
	}
}
