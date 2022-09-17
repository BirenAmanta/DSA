package bitManipulation;

import java.util.Scanner;


public class CheckKthBitSet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int k=sc.nextInt();
		boolean check=new CheckKthBitSet().check(number,k);
		System.out.println(check);
		sc.close();
	}

	private boolean check(int number, int k) {
		// TODO Auto-generated method stub
		return (number &(1<<(k-1)))!=0;
	}

}
