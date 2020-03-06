import java.util.Arrays;
// climbing-the-leaderboard problem in hackerrank
public class ClimbingLeaderBoard {
	//this is my own implementation, works but not optimized
	static int[] climbingLeaderboard(int[] scores, int[] alice) {
		int result[] = new int[alice.length];
		int k = result.length;
		for (int i=0; i < k; i++) {
			int counter = 0 ;
			int position =1;
			int initial = 0;
			//System.out.println("This is for num "+alice[i]+" "+counter+" "+scores[counter]);
			//System.out.println("herehere");
			while ((counter <= (scores.length-1)) && (scores[counter] > alice[i])) {
				//System.out.println("If it enters here for num "+alice[i]);
				if (scores[counter] != initial) {
					position++;
					initial = scores[counter];
				}
				// position++;
				counter++;
			}
			result[i]= position;			
		}
		return result;
		//input is {100,90,90,80,75,60}
		//It should give 6,5,4,2,1


    }
	//This is the Optimized version
	static int[] climbingLeaderboardP(int[] scores, int[] alice) {
		int n = scores.length;
		int m = alice.length;
		int []res = new int[m];
		int []rank = new int[n];
		rank[0] = 1;
		for (int i=1; i < n;i++) {
			if (scores[i] == scores[i-1])
				rank[i] = rank[i-1];
			else
				rank[i] = rank[i-1]+1;
		}
		for (int i=0;i < m;i++) {
			int aliceScore = alice[i];
			if (aliceScore > scores[0]) {
				res[i] = 1;
			} else 
			if (aliceScore < scores[n-1]) {
				res[i]=rank[n-1]+1;
			} else {
				int index =binarySearch(scores, aliceScore);
				res[i]=rank[index];
			}
				
			
		}
		return res;	


    }
	
	private static int binarySearch(int[] a, int key) {

		int lo = 0;
		int hi = a.length - 1;

		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (a[mid] == key) {
				return mid;
			} else if (a[mid] < key && key < a[mid - 1]) {
				return mid;
			} else if (a[mid] > key && key >= a[mid + 1]) {
				return mid + 1;
			} else if (a[mid] < key) {
				hi = mid - 1;
			} else if (a[mid] > key) {
				lo = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] scores = {110,90,90,90,70,65,50};
		int[] alice = {55,75,100,120};
		int[] m = climbingLeaderboard(scores, alice);
		System.out.println(Arrays.toString(m));
		int[] m2 = climbingLeaderboardP(scores, alice);
		System.out.println(Arrays.toString(m2));
		
		
		
	}

}
