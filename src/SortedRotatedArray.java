import java.util.Arrays;

public class SortedRotatedArray {

	public static void main(String[] args) {

		int num[] = { 4, 5, 6, 7, 8, 2, 3 };
		System.out.println("Min Value is: "+findMin(num));
		
	}

	public static int findMin(int n[]) {

		if (n.length == 1) {
			return n[0];
		}
		if (n.length == 2) {
			return Math.min(n[0], n[1]);
		}
		// No Rotation
		if (n[0] < n[n.length - 1]) {
			return n[0];
		}
		int mid = n.length / 2;

		if (n[mid] > n[0]) {
			return findMin(Arrays.copyOfRange(n, mid + 1, n.length));
		}

		else
			return findMin(Arrays.copyOfRange(n, 0, mid + 1));

	}

}
