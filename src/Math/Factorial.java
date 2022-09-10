package Math;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int result=new Factorial().factorial(number);
		System.out.println("factorial ="+result);
		sc.close();
	}

	private int factorial(int number) {
		// TODO Auto-generated method stub
		
		if(number==0)return 1;
		return number*factorial(number-1);
	}

}
