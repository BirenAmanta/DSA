package Math;

import java.util.*;
public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int digit=new CountDigits().count(number);
		System.out.println("digit ="+digit);
		sc.close();
	}

	private int count(int number) {
		// TODO Auto-generated method stub
		int count=0;
		while(number>0)
		{
			number=number/10;
			count++;
		}
		
		return count;
		
	}

}
