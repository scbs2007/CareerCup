package Facebook;

import java.util.Scanner;

public class MaxSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		int i;
		for(i =0;i<n;++i)
			arr[i] = sc.nextInt();
		
		int currentMax = arr[0];
		int superMax = 0;
		for(i=0;i<arr.length;++i)
		{
			currentMax = Math.max(arr[i]+currentMax, arr[i]);
			superMax = Math.max(currentMax, superMax);
		}
		System.out.println(superMax);
	}

}
