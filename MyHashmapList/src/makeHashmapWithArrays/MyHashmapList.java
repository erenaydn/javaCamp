package makeHashmapWithArrays;

public class MyHashmapList {

	String[][] array;
	String[][] tempArray;
	

	public MyHashmapList() {
		array = new String[0][2];
	}

	public void add(String key, String value) {
		tempArray = array;
		array = new String[array.length + 1][2];

		for (int i = 0; i < tempArray.length; i++) {
			array[i][0] = tempArray[i][0];
			array[i][1] = tempArray[i][1];
		}
		array[array.length - 1][0] = key;
		array[array.length - 1][1] = value;
		

		System.out.println(" Ülke- Baþkent bilgileri eklendi . ");
	}

	public void get(String key) {
		for (int i = 0; i < array.length; i++) {
			if (array[i][0] == key) {
				System.out.println(array[i][1] + " ülkesinin baþkenti " + array[i][0]);
			}
		}
	}

	public void getAll() {

		for (int j = 0; j < array.length; j++) {

			System.out.println(array[j][0] + " - " + array[j][1] + " ülkesinin baþkentidir");
		}

	}

}
