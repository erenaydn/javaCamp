package kodlamaioHomework2;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product("Java ile React ", " Java ve react üzerine harika bir kurs. ", "Engin Demiroð","1500","1200");
		
		Product product2 = new Product();
		product2.setCourseName("2 2 Java ile React ");
		product2.setCourseInstructor("Engin demiroð");
		product2.setCoursePrice("15000");
		product2.setCourseDiscountedPrice("10000");
		product2.setCourseDetail("JAVA ÜZERÝNE ");
		
		ProductServiceManager manager = new ProductServiceManager();
		// ürün ekleme çýkarma silme 
		manager.add(product1);
		manager.add(product2);
		
		manager.delete(product2);
		manager.delete(product1);
		
		manager.update(product1);
		manager.update(product2);
		// tüm ürünleri görme 
		Product[] products = new Product[] {product1,product2};
		
		manager.getAll(products);
	}

}
