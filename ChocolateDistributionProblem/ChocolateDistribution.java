
/*
 * Maximum number of chocolates to be distributed equally among k students
Given n boxes containing some chocolates arranged in a row. There are k number of students. 
The problem is to distribute maximum number of chocolates equally among k students by selecting
 a consecutive sequence of boxes from the given lot. Consider the boxes are arranged in a row with numbers 
 from 1 to n from left to right. We have to select a group of boxes which are in consecutive order that could 
 provide maximum number of chocolates equally to all the k students. An array arr[] is given representing 
 the row arrangement of the boxes and arr[i] represents number of chocolates in that box at position ‘i’.
 * 
 * 
 * 
 */

//This is my own solution, not very effective, but it works

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ChocolateDistribution {
	//dummy value is 2,7,6,1,4
	static int maxChocolates(int arr[],int k) {
		Map m = new HashMap();
		for (int i=0; i < arr.length; i++) {
			int mIndex=0;
			int sum=0;
			int c= i;
			for (int j=i; j < arr.length;j++) {
				sum = sum+arr[j];
				if (sum %k == 0)
					mIndex=j;
				
			}
			int total =0;
			for (int x=c; x<= mIndex;x++) {
				total = total+arr[x];
				
			}
			m.put(c,total);
			
		}
		Iterator itr = m.entrySet().iterator();
		int largest=0;
		while (itr.hasNext()) {
			Map.Entry me = (Entry) itr.next();
			int val =(int) me.getValue();
			if (val > largest)
				largest = val;
			
			
		}
		
		System.out.println(m);
		return largest;
		
	}
	public static void main(String[] args) {
		int[] arr = { 3,6,1,8,40};
		int k = 3;
		int ad =maxChocolates(arr, k);
		System.out.println(ad);
		
	}

}
