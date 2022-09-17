package bitManipulation;

import java.util.Scanner;

public class CountSetBits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int count=new CountSetBits().count(number);
		System.out.println(count);
		sc.close();
	}

	private int count(int number) {
		// TODO Auto-generated method stub
		int check=0;
		while(number>0)
		{
			if((number&1)==1)
			{
				check++;
			}
			number=number>>1;
		}
		
		return check;
	}


}
