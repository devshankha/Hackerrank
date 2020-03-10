
public class AlmostSorted {
	//This is almost sorted problem in hackerrank
	//Code works and take from github (slightly modified)
	//https://github.com/havelessbemore/hackerrank/blob/master/algorithms/sorting/almost-sorted.java
	
	static void almostSorted(int[] arr) {
		int l = 0;
		int N = arr.length;
		int r = N - 1;

		// Check for out of place index from the left
		while (l < r && arr[l] <= arr[l + 1]) {
			++l;
		}

		// Check if array already sorted
		if (l == r) {
			System.out.println("yes");
			return;
		}

		// Check for out of place index from the right
		while (r > l && arr[r] >= arr[r - 1]) {
			--r;
		}

		// Check if swapping or reversing would NOT sort the array
		if ((l > 0 && arr[r] < arr[l - 1]) || (r < N - 1 && arr[l] > arr[r + 1])) {
			System.out.println("no");
			return;
		}

		// Check if we're dealing with a reversal
		int m;
		for (m = l + 1; m < r && arr[m] >= arr[m + 1]; ++m) {
		}
		if (m == r) {
			System.out.println("yes\n" + ((r - l < 2) ? "swap " : "reverse ") + (l + 1) + " " + (r + 1));
			return;
		}

		// Check if we're NOT dealing with a swap
		if (m - l > 1 || arr[l] < arr[r - 1] || arr[r] > arr[l + 1]) {

			System.out.println("no");
			return;
		}

		// Check if we're dealing with a swap
		for (int k = r - 1; m < k && arr[m] <= arr[m + 1]; ++m) {
		}
		if (r - m > 1)
			System.out.println("no");
		else
			System.out.println("yes\nswap " + (l + 1) + " " + (r + 1));

	}
	public static void main(String[] args) {
		int[]k = {2,3,10,7,5};
		almostSorted(k);
		
	}

}
