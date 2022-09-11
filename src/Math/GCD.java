package Math;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int result=new GCD().gcd(num1,num2);
		System.out.println("GCD ="+result);
		sc.close();
	}

	public int gcd(int num1, int num2) {
		/*
		 * Normal Algo
		*/
		/*int max=Math.min(num1, num2);
		int result=1;
		for(int i=2;i<=max;i++)
		{
			if(num1%i==0 && num2%i==0)
			{
				result=result*i;
				num1=num1/i;
				num2=num2/i;
			}
		}
		return result;
		*/
		/**********************************
		 * Euclidean algo
		 * 
		 * Note: based on long division
		 * 
		 * ex: let a=12 ,b=18
		 * 
		 * devide b/a where b>a untill the reminder becomes zero
		 * and use prev reminder as quotient in next divide operation
		 * and always devide small with large
		 * 
		 * step1:
		 *  ->rem=18%12(return reminder of 18/12)
		 * step2:
		 *  then in next divide 
		 *  	take 12 and 6
		 *  	repeat same step 1 untill reminder becomes 0
		 * 
		 ***********************************/
		
		if(num2==0)return num1;
		return gcd(num2,num1%num2);
	}

}
