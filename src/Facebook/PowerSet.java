package Facebook;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class PowerSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		int i, temp, j; 
		int n = s.length();
		
		int totalElements = 1<< n;
		LinkedHashSet<String> result = new LinkedHashSet<String>();
		result.add("");
		for(i=1; i<totalElements; ++i)
		{
			StringBuffer str = new StringBuffer("");
			for(j=0;j<n;j++)
			{
				temp = (i& (1<<j));
				if(temp > 0)
				{
					str.append(s.charAt(j));
				}
			}
			result.add(str.toString());
		}
		System.out.println(result);
		sc.close();
	}
}
