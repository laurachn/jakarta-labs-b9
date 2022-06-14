package tugas1;

import java.util.TreeMap;
import java.util.TreeSet;

public class Runner {

	public static void main(String[] args) {
		TreeMap<String, String> husband = new TreeMap<>();
		husband.put("Atta Halilintar", "Aurel Hermansyah");
		husband.put("Raffi Ahmad", "Nagita Slavina");
		husband.put("Harvey Moeis", "Sandra Dewi");
		
		for (String key : husband.keySet()) {
			System.out.println("Husband : " + key + " , Wife : " + husband.get(key));
		}
		
		TreeSet<Integer> grade = new TreeSet<>();
		grade.add(90);
		grade.add(70);
		grade.add(100);
		
		for (Integer item : grade) {
			System.out.println("Grade : " + item);
		}
	}

}
