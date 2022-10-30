package recursion;

import java.util.Scanner;

public class SunOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int sum=new SunOfDigits().digitSum(num1);
		System.out.println(String.format("Digits sum of %s is = %s",num1,sum));
		sc.close();
	}

	private int digitSum(int num1) {
		// TODO Auto-generated method stub
		if(num1<=9)
		return num1;
		return num1%10+digitSum(num1/10);
	}

}
