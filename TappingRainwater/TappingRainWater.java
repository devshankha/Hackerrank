/*
https://www.geeksforgeeks.org/trapping-rain-water/
Given n non-negative integers representing an elevation map where the width of each bar is 1,
compute how much water it is able to trap after raining.

THis is my own solution, not very affective, but appears to work in cases


*/
public class TappingRainWater {

	static int calCulateWater(int arr[]) {
		int water=0;
		int m = arr.length;
		for (int i=0; i < m;i++ ) {			
			if (i ==0 || i == (m-1)) {				
				continue;
			}
			int lHighest=lHighest(arr, i);
			int rHighest=rHighest(arr, i);			
			int low = lHighest < rHighest ? lHighest:rHighest;			
			water = water+(low-arr[i]);		
			
		}
		return water;
	}

	static int lHighest(int[] arr, int i) {
		int l=arr[i];
		for (int j=i-1; j>=0; j--) {
			if (l < arr[j])
				l = arr[j];
		}
		return l;

	}

	static int rHighest(int[] arr, int i) {
		int r = arr[i];
		int m = arr.length;
		
		for (int j=i+1; j <= m-1; j++) {
			
			if (r < arr[j])
				r = arr[j];
			
		}
		
		return r;
		

	}
	public static void main(String[] args) {
		int[] arr = {2,0,2,0,0,2};
		int c=calCulateWater(arr);
		System.out.println(c);
		
	}

}
