package Facebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneNumberPossibleLetterCombinations {

	
	public static void populatemap(Map<Character, String> m)
	{
		m.put('2', "abc");
		m.put('3', "def");
		m.put('4', "ghi");
		m.put('5', "jkl");
		m.put('6', "mno");
		m.put('7', "pqrs");
		m.put('8', "tuv");
		m.put('9', "wxyz");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		String s = sc.next();
		Map<Character, String> m = new HashMap<Character, String>();
		populatemap(m);
		ArrayList<String> result = new ArrayList<String>();
		ArrayList<String> temp;
		
		for(int i =0;i<s.length();++i)
		{
			char c = s.charAt(i);
			String fetched = m.get(c);
			temp = new ArrayList<String>();
			if(fetched ==null)
				continue;
			
			for(int j=0;j<fetched.length(); ++j)
			{
				for(String t: result)
				{
					temp.add(t+fetched.charAt(j));
				}
				if(result.isEmpty())
				{
					temp.add(fetched.charAt(j)+"");
				}
			}
			
			result = temp;	
		}
		System.out.println(result + "\n" +result.size());
	}
}
