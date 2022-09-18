package math;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int result=new LCM().lcm(num1,num2);
		System.out.println("LCM ="+result);
		sc.close();
	}

	private int lcm(int num1, int num2) {
		// TODO Auto-generated method stub
		
		/*******************************
		 * The idea of getting LCM of two number is 
		 * simple we use GCD of two number and devide 
		 * that GCD with the multiplication of those 
		 * two numbers
		 * 
		 * ex:->
		 * 		let a & b are the two number
		 * 		then the lcm will be = (a*b)/gcd(a,b)
		 * 		
		 * Note:
		 * 		lcm is nothing but lowest common factor or
		 * 			lowest common prime factor
		 * 		
		 * 		if a=12 and b=18
		 * 			thn a=2^2 * 3^1
		 * 				b=2^1 * 3^2
		 * 			will take maximum of 2s power and 3 power
		 * 			of both a and b
		 * 			max of 2s power is= 2^2
		 * 			max of 3s power is= 3^2
		 * 			
		 * 			multiply those = 2^2 * 3^2 
		 * 						   = 36
		 * 
		 * 		so LCM of a & b is =36
		 * 		
		 * 		while getting GCD we took minimum of 2s and 3s
		 * 			which will be =2^1 * 3^1
		 * 						  =	6
		 * 		so if we divide (12*18)/6=36
		 * 			which concludes that LCM = product of two nos
		 * 									  ---------------------	
		 * 									   GCD of those tow nos	 
		 * 
		 *******************************/
		int gcd= new GCD().gcd(num1, num2);
		
		return (num1*num2)/gcd;
	}

}
