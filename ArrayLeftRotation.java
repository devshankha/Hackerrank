import java.lang.reflect.Array;
/**
 * A left rotation operation on an array shifts each of the array's elements  unit to the left. For example, if  left rotations are performed on array , then the array would become .

Given an array  of  integers and a number, , perform  left rotations on the array. Return the updated array to be printed as a single line of space-separated integers.

Function Description

Complete the function rotLeft in the editor below. It should return the resulting array of integers.

rotLeft has the following parameter(s):

An array of integers .
An integer , the number of rotations.
 */
import java.util.Arrays;
import java.util.HashMap;

public class ArrayLeftRotation {
	static int[] anotherRotate(int[] a,int d) {
		int[] f = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int index = (a.length + ((i - d) % a.length)) % a.length;
            System.out.println("The index is "+index);
            f[index] = a[i];
        }
        return f;
		
		
	}
	static int[] rotateArray(int[] arr,int k) {
		int l = arr.length;
		int a[] = new int[arr.length];
		for (int i=0; i < l;i++) {
			a[i] = arr[k];
			
			k++;
			if (k == (arr.length))
				k=0;
		}
		return a;
	 
	} 
	public static void main(String[] args) {
		int []arr = {1,2,3,4,5};
		int[] l1= ArrayLeftRotation.rotateArray(arr, 3);
		System.out.println(Arrays.toString(l1));
		int[] l2= ArrayLeftRotation.anotherRotate(arr, 3);
		System.out.println(Arrays.toString(l2));
		
	}

}
