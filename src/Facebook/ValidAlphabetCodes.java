/*

If a=1, b=2, c=3,....z=26. Given a string, find all possible codes that string can generate. Give a count as well as print the strings.

For example:
Input: "1123". You need to general all valid alphabet codes from this string.

Output List
aabc //a = 1, a = 1, b = 2, c = 3
kbc // since k is 11, b = 2, c= 3
alc // a = 1, l = 12, c = 3
aaw // a= 1, a =1, w= 23
kw // k = 11, w = 23

*/

package Facebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class ValidAlphabetCodes {

	public static ArrayList<String> allPermutations(String s)
	{
		ArrayList<String> result = new ArrayList<String>();
		
		if(s.length() == 1)
		{
			result.add(s);
			return result;
		}
		for(int i=0;i<s.length();++i)
		{
			char c = s.charAt(i);
			StringBuilder remaining = new StringBuilder((s.substring(0,i) + s.substring(i+1)));
			ArrayList<String> intermediate = new ArrayList<String>();
			intermediate = allPermutations(remaining.toString());
			for(int j =0;j<intermediate.size();++j)
			{
				result.add(c+intermediate.get(j));
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, Character> m = new HashMap<Integer, Character>();
		int i;
		for(i = 1; i<27;++i)
		{
			m.put(i,(char)(64+i));
		}
		
		/*for(Map.Entry<Integer, Character> e: m.entrySet())
		{
			System.out.println(e.getKey()+" " + e.getValue());
		}
		*/
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		int count =n/2;
		StringBuilder sb = new StringBuilder();
		HashSet<String> a = new HashSet<String>();
		
		while(count !=0)
		{
			for(i = 1; i <= count;++i)
				sb.append("2");
			
			for(i = 1; i <= n-count*2;++i)
				sb.append("1");
		
			--count;
			//System.out.println(sb.toString());
			
			ArrayList<String> set = allPermutations(sb.toString());
			
			for(String str: set)
				a.add(str);
			sb.delete(0, sb.length());
		}
			String st = "";
			for(i=0;i<n;++i)
				st +="1";
			a.add(st);
			
			for(String str:a)
			{
				String copy = s;
				
				String toHash = "";
				boolean flag = false;
				for(int j=0;j<str.length();++j)
				{
					int beginIndex = Integer.parseInt(str.charAt(j)+"");
					if(m.get(Integer.parseInt(copy.substring(0, beginIndex))) == null)
					{
						flag = true;
						break;
					}
					else
						toHash = toHash + ""+ m.get(Integer.parseInt(copy.substring(0, beginIndex)));
					copy = copy.substring(beginIndex, copy.length());
				}
				if(flag != true)
					System.out.println(toHash);
			}
		}
		
	

}
