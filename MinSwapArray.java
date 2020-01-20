package src.main;
import java.util.Arrays;
import java.util.HashMap;

/* Minimum number of swaps required to sort an array
Given an array of n distinct elements, find the minimum number of swaps required to sort 
the array.  

*  code is from == https://www.youtube.com/watch?v=J9ikRMK8Yhs&t=323s
*/

public class MinSwapArray {
	

	
	public static void main(String[] args) {
		int arr[] = {1,7,3,5,2,4,6};
		//System.out.println(MinSwapArray.minSwapsCouples(arr));
		boolean isVisited[] = new boolean[arr.length+1];
		HashMap<Integer,Integer> nodeMap = new HashMap<>();
		for (int i=1; i < isVisited.length;i++) {
			nodeMap.put(i,arr[i-1]);
		}
		System.out.println("Printing the map "+nodeMap);
		System.out.println(Arrays.toString(isVisited) );
		int count_swap=0;
		for (int k=1;k<=nodeMap.size();k++) {
			int nextNode;
			if (isVisited[k] == false) {
				isVisited[k] = true;
				if (k == nodeMap.get(k)) {
					System.out.println("continuing for "+nodeMap.get(k));
					continue;
				} else {
					int c = nodeMap.get(k);
					while (!isVisited[c]) {
						isVisited[c]= true;						
						c = nodeMap.get(c);
						++count_swap;
						
						
						
					}
				}
					
				
				
			}
				
		}
		System.out.println(count_swap);
			
	}

}
