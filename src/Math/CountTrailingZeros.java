package Math;

import java.util.Scanner;

public class CountTrailingZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int zeros=new CountTrailingZeros().count(number);
		System.out.println("Trailing zeros ="+zeros);
		sc.close();
	}

	private int count(int number) {
		// TODO Auto-generated method stub
		int result=0;
		for(int i=5;i<=number;i=i*5)
		{
			result=result+number/i;
		}
		return result;
	}

}
