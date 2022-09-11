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
		/*****************************
		 * 
		 * The idea behind this to count no of 5s in the  factorial
		 * as we know only 2*5 produce 0's in the product or  there 
		 * factors so if we count 2s factors or 5 factor of a number
		 * we can easily find the leading zeros but we wont take 2 
		 * as count reason is there are  large no of factors of 2 so 
		 * we took 5 instead of 2.
		 * 
		 * 
		 * Ex:-> let number is 10
		 * 
		 * factorial of 10 -> 1*2*3*4*5*6*7*8*9*10 = 3628800
		 * 		There are 2 zeros in the factorial
		 * 		
		 * 		and we can see in the left size there is 
		 * 				2s factor= 2 , 4 ,6 , 8 ,10
		 * 				5s factor= 5 ,10
		 * 			
		 * 			And there is exactly 2 trailing zeros in the factorial
		 * 			
		 * 			so if we divide the given number to 5 factors we can get
		 * 			  no of zeros
		 * 				
		 * 			No of zeros = [no/5]+[no/(5*5)]+[no/(5*5*5)].....
		 * 						Until 5's factor greater then the number itself
		 * 
		 * 
		 *****************************/
		int result=0;
		for(int i=5;i<=number;i=i*5)
		{
			result=result+number/i;
		}
		return result;
	}

}
