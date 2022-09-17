package Math;

import java.util.Scanner;

public class IterativePower {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int power=sc.nextInt();
		int result=new IterativePower().pow(number,power);
		System.out.println("("+number+")^"+power+"="+result);
		sc.close();
	}

	private int pow(int number, int power) {
		// TODO Auto-generated method stub
		int res=1;
		while(power>0)
		{
			if((power&1)==1)
			{
				res=res*number;
			}
			number=number*number;
			power=power>>1;
		}
		return res;
	}

}
