package Facebook;

import java.util.Scanner;

public class RemoveAllZerosArrayRightEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int i;
		for(i =0;i<n;++i)
			arr[i] = sc.nextInt();
		i = arr.length - 1;
		while(arr[i]==0&& i>=0)
		{--i;}	
//		System.out.println(arr.toString());
		int temp;
		for(int j=0;j<n;++j)
		{
			if(arr[j] == 0)
			{
				temp = arr[j];
				arr[j] = arr[i];
				arr[i]=temp;
				--i;
				while(arr[i]==0 && i>j){--i;}
				if(i<=j)
					break;
			
			}
		}
		for(i=0;i<n;++i)
		System.out.print(arr[i] + " ");
	}

}
