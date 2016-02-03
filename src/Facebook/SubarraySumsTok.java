/*
Given an integer x and an array y, 
create a function that returns true if x exists as a sum of any contiguous elements in y. 
 * */
package Facebook;

import java.util.Scanner;

public class SubarraySumsTok {

	public static boolean check(int arr[], int k)
	{
		int i, n = arr.length;
		for(i=0;i<n;++i)
		{
			
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		int i;
		for(i =0;i<n;++i)
			arr[i] = sc.nextInt();
		
		System.out.println(check(arr, k));
	}

}
