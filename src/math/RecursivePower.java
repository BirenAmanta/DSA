package math;

import java.util.Scanner;

public class RecursivePower {
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int power=sc.nextInt();
		int result=new RecursivePower().pow(number,power);
		System.out.println("("+number+")^"+power+"="+result);
		sc.close();
	}

	private int pow(int number, int power) {
		// TODO Auto-generated method stub
		if(power==0)return 1;
		int temp=pow(number,power/2);
		if(power%2==0)
		{
			return temp*temp;
		}
		return temp*temp*number;
	}
}
