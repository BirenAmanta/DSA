package recursion;

import java.util.Scanner;


public class PrintNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		new PrintNumbers().printNumbers(num1);
		new PrintNumbers().printNumbersRev(num1);
		sc.close();
	}

	private void printNumbers(int num1) {
		// TODO Auto-generated method stub
		if(num1==0)return;
		printNumbers(num1-1);
		System.out.println(num1);
	}
	private void printNumbersRev(int num1) {
		// TODO Auto-generated method stub
		if(num1==0)return;
		System.out.println(num1);
		printNumbers(num1-1);
	}

}
