package collectionPractice;

import java.util.*;

public class Freq {
	public static void main(String[] args) {
		
		// Map<String, Integer> m = new HashMap<String, Integer>();
		// Map<String, Integer> m = new TreeMap<String, Integer>();
		Map<String, Integer> m = new LinkedHashMap<String, Integer>();
		// Initialize frequency table from command line
		
		String str = "if it is to be it is up to me to delegate";
		String[] strArr = str.split(" ");
		
		for (String a : strArr ) {
			Integer freq = m.get(a);
			m.put(a, (freq == null) ? 1 : freq + 1);
		}

		System.out.println(m.size() + " distinct words:");
		System.out.println(m);
	}
}
