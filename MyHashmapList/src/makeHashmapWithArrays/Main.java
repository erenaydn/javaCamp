package makeHashmapWithArrays;

public class Main {

	public static void main(String[] args) {
		MyHashmapList hash = new MyHashmapList();
		
		hash.add("Ankara", "Türkiye");
		hash.add("Berlin", "Almanya");
		hash.get("Ankara");
		
		
		hash.getAll();

	}

}
