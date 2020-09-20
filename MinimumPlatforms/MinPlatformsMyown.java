import java.util.Arrays;
//My own, simple and appears to work better

public class MinPlatformsMyown {
	
	static int minimumplatforms(double[] arr, double[] dept ) {
		Arrays.sort(arr);
		Arrays.sort(dept);
		int platforms = 0;
		int maxPlatforms = 0;
		int ai = 0;
		int di = 0;
		int l = arr.length;
		while (ai <  l && di < l) {
			if (arr[ai] < dept[di]) {
				platforms++;
				ai++;
				
			} else {
				platforms--;
				di++;
				
			}
			if (platforms > maxPlatforms)
				maxPlatforms = platforms;
		}
		return maxPlatforms;
	}
	
	public static void main(String[] args) {
		double arr[] = {9.00, 9.40, 9.50, 11.00, 15.00, 18.00};
		double dep[] = {9.10, 12.00, 11.20, 11.30, 19.00, 20.00};
		
		int k = minimumplatforms(arr, dep);
		System.out.println(k);
		
		
	}

}
