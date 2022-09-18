package math;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		boolean check=new PrimeNumber().primeCheck(num1);
		System.out.println("Prime ="+check);
		sc.close();
	}

	private boolean primeCheck(int num1) {
		// TODO Auto-generated method stub
		/********************
		 * 
		 * The logic is to check where the no is 2's or 3's 
		 * factorial or not if yes then that's not a prime if no
		 * then will check rest of the number 
		 * 
		 * ex: 
		 * 	->lets take 37
		 * so the nos from 1-37 are
		 *  1,2,3,4,5,6,7,8,9,10,12,13,14,15,16,
		 *  16,17,18,19,20,21,22,23,24,25,26,27,
		 *  28,29,30,31,32,33,34,35,36
		 * 
		 * let's remove 2's and 3's factor from the above list
		 * 	5,7,11,13,17,19,23,25,27,29,31,35
		 * 
		 * 	we can see there is a pattern in the above list
		 * 	if we take n=5
		 * 		then next no is (n+2)
		 * 		then next series of n is (n+6)
		 * 
		 * 		so we need to run a loop starting from 5
		 * 		and increment n to n+6 upto root of(n)  
		 ***************************/
		if(num1==1)
		{
			return false;
		}
		if(num1==2 || num1==3 )
		{
			return true;
		}
		if(num1%2==0 || num1%3==0)
		{
			return false;
		}
		
		for(int i=5;i*i<=num1;i=i+6)
		{
			if(num1%i==0 || num1%(i+2)==0)
			{
				return false;
			}
		}
		
		return true;
	}

}
