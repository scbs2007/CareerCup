package Facebook;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AllPalindromesinString {

	public static void findPalin(String s, Set<String> sc, int count)
	{
		int i, n =s.length(), j, k;
		for(i =0; i < n; ++i)
		{
			j=i-1;
			k=i+count;
			while(j>=0 && k<n)
			{
				if(s.charAt(j) == s.charAt(k))
				{
					j--; k++;
					sc.add(s.substring(j+1, k));
				}
				else
					break;
			}
			sc.add(s.substring(j+1, k));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Set<String> set = new HashSet<String>();
		findPalin(s, set, 0);
		findPalin(s, set, 1);
		System.out.println(set);
		
	}

}
