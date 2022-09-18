package math;

import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		new PrimeFactor().printFactor(num1);
		sc.close();
	}

	private void printFactor(int num1) {
		// TODO Auto-generated method stub
		/*******************
		 * 
		 * Using Prime Number Logic
		 * 
		 *******************/
		
		if (num1<=1)return ;
		for(int i=2;i*i<=num1;i++)
		{
			while(num1%i==0)
			{
				System.out.print(i+" ");
				num1=num1/i;
			}
		}
		if(num1>1)
		{
			System.out.print(num1+" ");
		}
	}

}
