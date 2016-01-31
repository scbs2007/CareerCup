package Facebook;

import java.util.Arrays;
import java.util.Scanner;

public class TripletSumZero {

	public static boolean triplet(int a[], int s)
	{
		int i, j, k, sum;
		
		int n = a.length;
		Arrays.sort(a);
		
		for(i=0;i<=n-3;++i)
		{
			j=i+1;
			k=n-1;
			
			while(j<k)
			{
				sum = a[i]+a[j]+a[k];
				if(sum == s)
				{
					return true;
				}
				else if(sum < s)
				{
					j++;
				}
				else
				{
					k--;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int key = sc.nextInt();
		int a[] = new int[n];
		
		int i;
		for(i =0;i<n; ++i)
		{
			a[i] = sc.nextInt();
		}
		System.out.println(triplet(a, key));
	}

}
