package Facebook;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class KnightProblem {

	public static void display(int arr[][])
	{
		int i, j;
		for(i=0;i<arr.length;++i)
		{
			for(j=0;j<arr.length;++j)
				System.out.print(arr[i][j] + " ");
			System.out.println("\n");
		}
		
	}
	
	public static void populate(int arr[][], String destination)
	{
		Queue<String> sc = new LinkedList<String>();
		sc.add(destination);
		sc.add("#");
		int count = 1;
		int n = arr.length;
		int flag;
		while(!sc.isEmpty())
		{
			flag = 0;
			while(!sc.peek().equals("#"))
			{	
				String[] a = sc.poll().split(" ");
				int x = Integer.parseInt(a[0]);
				int y = Integer.parseInt(a[1]);
				
				arr[x][y] = count;
				if((x+1<n && y-2 <n) && (x+1>=0 && y-2 >=0) && arr[x+1][y-2]==0)
					sc.offer((x+1)+" "+ (y-2));
				if((x+1<n && y+2 <n) && (x+1>=0 && y+2 >=0)&& arr[x+1][y+2]==0)
					sc.offer((x+1)+" "+ (y+2));
				if((x-1<n && y-2 <n) && (x-1>=0 && y-2 >=0)&& arr[x-1][y-2]==0)
					sc.offer((x-1)+" "+ (y-2));
				if((x-1<n && y+2 <n) && (x-1>=0 && y+2 >=0)&& arr[x-1][y+2]==0)
					sc.offer((x-1)+" "+ (y+2));
				if((x-2<n && y-1 <n) && (x-2>=0 && y-1 >=0)&& arr[x-2][y-1]==0)
					sc.offer((x-2)+" "+ (y-1));
				if((x-2<n && y+1 <n) && (x-2>=0 && y+1 >=0)&& arr[x-2][y+1]==0)
					sc.offer((x-2)+" "+ (y+1));
				if((x+2<n && y-1 <n) && (x+2>=0 && y-1 >=0)&& arr[x+2][y-1]==0)
					sc.offer((x+2)+" "+ (y-1));
				if((x+2<n && y+1 <n) && (x+2>=0 && y+1 >=0)&& arr[x+2][y+1]==0)
					sc.offer((x+2)+" "+ (y+1));
				flag=1;
			}
			if(sc.peek().equals("#"))
			{
				sc.poll();
				if(flag==1)
				sc.offer("#");
				count++;
			}
		}
			
	}
	public static String findmin(int arr[][], int x, int y)
	{
		int n=arr.length;
		int min = Integer.MAX_VALUE;
		int minx=0, miny=0;
		if((x+1<n && y-2 <n) && (x+1>=0 && y-2 >=0))
		{	
			if(min>arr[x+1][y-2])
			{
				min = arr[x+1][y-2];
				minx = x+1; 
				miny = y-2;
			}
		
		}
		if((x+1<n && y+2 <n) && (x+1>=0 && y+2 >=0))
		{	
			if(min>arr[x+1][y+2])
			{
				min = arr[x+1][y+2];
				minx = x+1; 
				miny = y+2;
			}
		
		}
		if((x-1<n && y-2 <n) && (x-1>=0 && y-2 >=0))
		{
			if(min>arr[x-1][y-2])
			{
				min = arr[x-1][y-2];
				minx = x-1; 
				miny = y-2;
			}
		}
		if((x-1<n && y+2 <n) && (x-1>=0 && y+2 >=0))
		{
			if(min>arr[x-1][y+2])
			{
				min = arr[x-1][y+2];
				minx = x-1; 
				miny = y+2;
			}
		}
		if((x-2<n && y-1 <n) && (x-2>=0 && y-1 >=0))
		{
			if(min>arr[x-2][y-1])
			{
				min = arr[x-2][y-1];
				minx = x-2; 
				miny = y-1;
			}
		}
		if((x-2<n && y+1 <n) && (x-2>=0 && y+1 >=0))
		{
			if(min>arr[x-2][y+1])
			{
				min = arr[x-2][y+1];
				minx = x-2; 
				miny = y+1;
			}
		}
		if((x+2<n && y-1 <n) && (x+2>=0 && y-1 >=0))
		{
			if(min>arr[x+2][y-1])
			{
				min = arr[x+2][y-1];
				minx = x+2; 
				miny = y-1;
			}
		}
		if((x+2<n && y+1 <n) && (x+2>=0 && y+1 >=0))
		{
			if(min>arr[x+2][y+1])
			{
				min = arr[x+2][y+1];
				minx = x+2; 
				miny = y+1;
			}
		}
			
		return minx+" "+miny; 
	}
	public static void findShortest(int arr[][], String source, String destination)
	{
		Queue<String> path = new LinkedList<String>();
		String str;
		path.offer(source);
		while(source.equals(destination)==false)
		{
			String[] a = source.split(" ");
			int x = Integer.parseInt(a[0]);
			int y = Integer.parseInt(a[1]);
			int n = arr.length;
			str = findmin(arr, x, y);
			path.offer(str);
			source = str;
		}
		
		System.out.println(path);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int n = Integer.parseInt(sc.nextLine());
		int arr[][] = new int[n][n];
		
		//display(arr);
		String source = sc.nextLine();
		String destination = sc.nextLine();
		
		populate(arr, destination);
		findShortest(arr, source, destination);
		
		
	}

}
