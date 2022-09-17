package bitManipulation;

import java.util.Scanner;

public class PowerSetUsingBits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String word=sc.nextLine();
		new PowerSetUsingBits().getPowerSet(word);
		sc.close();
	}

	private void getPowerSet(String word) {
		// TODO Auto-generated method stub
		int totalSet=(int)Math.pow(2,word.length());
		for(int i=0;i<totalSet;i++)
		{
			String set="";
			int temp=i;
			int count=0;
			while(temp>0)
			{
				if((temp&1)==1)
				{
					set=set+word.charAt(count);
				}
				temp=temp>>1;
				count++;
			}
			System.out.println(set);
		}
		
	}



}
