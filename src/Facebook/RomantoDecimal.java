package Facebook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomantoDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		m.put('I', 1);
		m.put('V', 5);
		m.put('X', 10);
		m.put('L', 50);
		m.put('C', 100);
		m.put('D', 500);
		m.put('M', 1000);
		
		int i, n = s.length();
		
		char c1, c2;
		int result = 0, t1, t2;
		for(i=0;i<n;)
		{
			c1 = s.charAt(i);
			t1 = m.get(c1);
			if(i<n-1)
			{
				c2 = s.charAt(i+1);
				t2 = m.get(c2);
			}
			else
			{
				t2 =0;
			}
			
			if(t1 < t2)
			{
				result += (t2 - t1);
				i +=2;
			}
			else if(t1 >= t2)
			{
				result += (t1);
				i += 1;
			}
		}
		System.out.println(result);
	}
}
