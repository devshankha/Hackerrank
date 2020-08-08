/**
 *  * 
 * 
 * @author devshankhasharm
 * This is again my own solution
 * seems to work in most cases, though not optimized
 *
 */
public class TappingRainWater3 {

	static int maxWater(int[] arr) {
		int water_Capacity = 0;
		for (int i = 0; i < arr.length; i++) {
			// for the leftmost and rightmost, cannot hold any water
			if (i == 0 || i == (arr.length - 1))
				continue;
			int leftMax = arr[i];
			int rightMax = arr[i] ;
			int k = i - 1;
			while (k >= 0 ) {				
				if (arr[k] >= leftMax) {					
					leftMax = arr[k];
					k--;
				}
				else {
					k--;
					continue;
				}				
			}
			//if there is no bar higher than this one on the left, leave it
			if (leftMax == arr[i])
				continue;
			k = i + 1;
			while (k < arr.length ) {				
				if (arr[k] >= rightMax) {					
					rightMax = arr[k];
					k++;
				}
				else {
					k++;
					continue;
				}				
			}
			//if there is no bar higher than this one on the right, leave it
			if (rightMax == arr[i])
				continue;
			//rightMax = arr[k];			
			water_Capacity = water_Capacity + Math.min(leftMax, rightMax) - arr[i];
			System.out.println("For the value of i "+i+" and capacity "+water_Capacity);
			

		}
		return water_Capacity;

	}

	public static void main(String[] args) {
		//int []ls = {3,1,2,1,4};
		//int []ls = {3, 0, 2, 0, 4};
		//int []ls = {3, 1,2,1,1};
		int []ls = {3, 1,2,1,3};
		System.out.println(TappingRainWater3.maxWater(ls));
		//System.out.println(Math.min(3, 3));

	}

}
