package Facebook;

import java.util.Scanner;

public class DivisionUsingMinus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt(); //greater
		int n2 = sc.nextInt(); //smaller
		
		int count = 1;
		int temp = n2;
		int flag;
		do
		{
			flag =0;
			int i;
			for(i=1; (n2 + i*temp <= n1); i++)
			{
				n2 += i*temp;
				count += i;
				flag =1;
			}
		}while(n2<n1 && flag ==1);
		System.out.println(count);
		
	}

}
