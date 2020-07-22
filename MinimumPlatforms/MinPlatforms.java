//Famous problem MinPlatforms for railway station

/** Minimum Number of Platforms Required for a Railway/Bus Station
Given arrival and departure times of all trains that reach a railway station, the task is to find the 
minimum number of platforms required for the railway station so that no train waits.
We are given two arrays which represent arrival and departure times of trains that stop.
*/




import java.util.Arrays;

public class MinPlatforms {
	static int minPlatforms(double arr[], double dep[]) {
		
		// stores minimum platforms needed
		int minPlatforms = 0;
		// maintains the count of trains
		int count = 0;
		// take two indices for arrival and departure time
		int i=0,j=0;
		int k = arr.length;
		// run till train is scheduled to arrive
		while (i < k ) {
			// if train is scheduled to arrive next
			if (arr[i] < dep[j]) {
				count++;
				minPlatforms = Math.max(count,minPlatforms);
				i++;
			}
			// if train is scheduled to depart next i.e.
			// (departure[j] < arrival[i]), decrease the count of trains
			// and move pointer j to next departure

			// If two trains are arriving and departing at the same time, i.e.
			// (arrival[i] == departure[j]) depart the train first
			
			
			else {
				count--;
				j++;
			}
		}
		return minPlatforms;
	}
	public static void main(String[] args) {
		double[] arrival = { 2.00, 2.10, 3.00, 3.20, 3.50, 5.00 };
		double[] departure = { 2.30, 3.40, 3.20, 4.30, 4.00, 5.20 };

		// sort arrival time of trains
		Arrays.sort(arrival);

		// sort departure time of trains
		Arrays.sort(departure);
		System.out.println(minPlatforms(arrival, departure));

	}

}
