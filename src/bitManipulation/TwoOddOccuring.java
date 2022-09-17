package bitManipulation;

import java.util.Scanner;

public class TwoOddOccuring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number[]=new int[sc.nextInt()];
		sc.nextLine();
		int size=0;
		while(size++<number.length)
		{
			number[size-1]=sc.nextInt();
		}
		new TwoOddOccuring().count(number);
		sc.close();
	}

	private void count(int number[]) {
		// TODO Auto-generated method stub
		int xor=0,first=0,second=0;
		for(int i:number)
		{
			xor=xor^i;
		}
		int rightMost=xor&~(xor-1);
		System.out.println(rightMost);
		for(int i:number)
		{
			if((i&rightMost)!=0)
			{
				first=first^i;				
			}
			else
			{
				second=second^i;
			}
		}
		System.out.println("first="+first+",second="+second);
	}
}
