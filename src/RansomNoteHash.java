import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RansomNoteHash {

	public static void main(String[] args) {

		String mag = "this is what I said Imm goinng to do. i really like you a lot //Choose a Bigger file here//";
		String ransom = "i want money from you";

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		Map<Character, Integer> ransomMap = new HashMap<Character, Integer>();
		
		for (int i = 0; i < mag.length() - 1; i++) {
			char c = mag.charAt(i);
			if (!map.containsKey(c))
				map.put(c, 1);
			else {
				int value = map.get(c);
				map.put(c, ++value);
			}
		}

		System.out.println(map);

		for (int i = 0; i < ransom.length() - 1; i++) {
			char c = ransom.charAt(i);
			if (!ransomMap.containsKey(c))
				ransomMap.put(c, 1);
			else {
				int value = (ransomMap.get(c));
				ransomMap.put(c, ++value);
			}
		}
		System.out.println(ransomMap);
		
		System.out.println(enoughLetters(map, ransomMap));
	}
	
	static boolean enoughLetters(Map<Character, Integer> magMap,
			Map<Character, Integer> ransomMap) {
		for (Entry<Character, Integer> e : ransomMap.entrySet()) {
			Character letter = e.getKey();
			Integer available = magMap.get(letter);
			if (available == null || e.getValue() > available)
				return false;
		}
		return true;
	}
	
}
