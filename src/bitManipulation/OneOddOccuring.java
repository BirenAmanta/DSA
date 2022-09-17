package bitManipulation;

import java.util.Scanner;

public class OneOddOccuring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number[]=new int[sc.nextInt()];
		sc.nextLine();
		int size=0;
		while(size++<number.length)
		{
			number[size-1]=sc.nextInt();
		}
		int count=new OneOddOccuring().count(number);
		System.out.println(count);
		sc.close();
	}

	private int count(int number[]) {
		// TODO Auto-generated method stub
		int result=0;
		for(int i:number)
		{
			result=result^i;
		}
		return result;
	}
}
