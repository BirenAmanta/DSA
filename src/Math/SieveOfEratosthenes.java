package Math;

import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		new SieveOfEratosthenes().sieveOfEratosthenes(number);
		sc.close();
	}

	private void sieveOfEratosthenes(int number) {
		// TODO Auto-generated method stub
		/******************
		 * The logic is to make an boolean array of size number +1
		 *  and fill the array with True and then we iterate over each index
		 *  of array and mark each indexes divisior as false if the divisior 
		 *  index is present in that array 
		 * 
		 * 
		 */
		boolean isPrime[]=new boolean[number+1];
		Arrays.fill(isPrime, true);
		for(int i=2;i<=number;i++)
		{
			if(isPrime[i])
			{
				System.out.print(i+" ");
				for(int j=i*i;j<=number;j=j+i)
				{
					isPrime[j]=false;
				}
			}
		}
		
	}

}
