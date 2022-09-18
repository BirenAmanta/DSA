package math;
import java.util.Scanner;

public class CheckPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		if(new CheckPalindrom().checkPalindrom(number))
		{
			System.out.println("Number is a palindrom");
		}
		else
		{
			System.out.println("Number is not a palindrom");
		}
		
		sc.close();
	}

	private boolean checkPalindrom(int number) {
		// TODO Auto-generated method stub
		
		int reverse=0;
		int temp=number;
		while(temp>0)
		{
			reverse=reverse*10+(temp%10);
			temp=temp/10;
		}
		System.out.println(reverse);
		return reverse==number;
		
	}


}
