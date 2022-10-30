package recursion;

import java.util.Scanner;

public class NaturalNumberSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int sum=new NaturalNumberSum().sum(num1);
		System.out.println(String.format("Sum of natural no. upto %s is = %s",num1,sum));
		sc.close();
	}

	private int sum(int num1) {
		// TODO Auto-generated method stub
		if(num1<=1)
		{
			return num1;
		}
		return num1+sum(num1-1);
	}

}
