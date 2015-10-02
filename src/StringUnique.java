public class StringUnique {

	public static void main(String[] args) {
		String str = new String();
		str="think32329302 0000 323 %%%$$s";
		str.toCharArray();
		System.out.println(isUniqueChar(str));
		System.out.println(new StringBuilder(str).reverse().toString());
	
	}

	public static boolean isUniqueChar(String str) {
		int checker = 0;
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if ((checker & (1 << val)) > 0)
				return false;
			checker |= (1 << val);
		}
		return true;

	}
}
