/*
Given a string. find if you can make a palindrome out of it, after removing <= k characters.
*/

package Facebook;

import java.util.Scanner;

public class kPalindrome {

	public static boolean check(String s, int k)
	{
		int i=0, j = s.length()-1;
		if(k<0)
			return false;
		while(s.charAt(i)==s.charAt(j) && (i<j))
		{
			++i;
			--j;
		}
		String t1,t2;
		if(i<j)
		{
			t1 = s.substring(i+1, j+1);
			t2 = s.substring(i, j);
			
			if(check(t1,k-1) || check(t2,k-1))
				return true;
			else
				return false;
		}
		else
			return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String s = sc.next();
		int k  = sc.nextInt();
		System.out.println(check(s, k));
			}
		
	

}
