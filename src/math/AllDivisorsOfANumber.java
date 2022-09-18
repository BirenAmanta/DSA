package math;

import java.util.Scanner;

public class AllDivisorsOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		new AllDivisorsOfANumber().allDivisorsOfANumber(num1);
		sc.close();
	}

	private void allDivisorsOfANumber(int num1) {
		// TODO Auto-generated method stub
		
		int i=1,prev=0;
		for(;i*i<num1;i++)
		{
			if(num1%i==0)
			{
				System.out.print(i+" ");
				prev=i;
			}
		}
		for(;i>=1;i--)
		{
			if(num1%i==0 &&  prev!=num1/i)
			{
				System.out.print(num1/i+" ");
				prev=num1/i;
			}
		}
	}

}
