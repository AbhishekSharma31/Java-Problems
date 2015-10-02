public class StringPermutationOther {

	public static void main(String[] args) {
		
		String st =new String("this");
		String tr =new String("shit");

		System.out.println(permu(st,tr));

	}

	public static boolean permu(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}

		int[] letters = new int[256];
		char[] s_array = s.toCharArray();

		for (char c : s_array) {
			// count no of each character
			letters[c]++;
		}
		for (int i=0; i < t.length(); i++) {
			int c = (int) t.charAt(i);
			if (--letters[c] < 0) {
				return false;
			}
		}

		return true;

	}

}
