package Facebook;

import java.util.Scanner;

public class PreToPostBST {

	public static void convertToPostOrder(int arr[], int i, int j)
	{
		int temp = j;
		if(i>=temp)
			return;
		
		while(temp>i)
		{
			if(arr[i] > arr[temp])
				break;
			--temp;
		}
		convertToPostOrder(arr, i+1, temp);
		convertToPostOrder(arr, temp+1, j);
		int root = arr[i];
		for(int k = i+1; k<=j; ++k)
			arr[k-1] = arr[k];
		arr[j] = root;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input - 10 7 5 4 3 6 10 9 8 11 15
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i =0;i<n; ++i)
		{
			arr[i] = sc.nextInt();
		}
		convertToPostOrder(arr, 0, arr.length-1);
		for(int i=0;i<arr.length;++i)
			System.out.print(arr[i]+" ");
	}

}
