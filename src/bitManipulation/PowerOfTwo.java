package bitManipulation;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		boolean check=new PowerOfTwo().check(number);
		System.out.println(check);
		sc.close();
	}

	private boolean check(int number) {
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
		
		return check==1;
	}
}
