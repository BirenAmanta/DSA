package recursion;

import java.util.Scanner;

public class SubsetSumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		sc.nextLine();
		int arr[]=new int[size];
		int i=0;
		while(i<size)
		{
			arr[i++]=sc.nextInt();
		}
		sc.nextLine();
		int sum=sc.nextInt();
		int res=new SubsetSumArray().sumArray(arr,0,0,sum);
		System.out.println(String.format("Total subset sum available is = %s",res));
		sc.close();
	}

	private int sumArray(int[] arr,int i,int current ,int sum) {
		// TODO Auto-generated method stub
		if(i==arr.length)
		{
			if (current==sum)return 1;
			return 0;
		}
		return sumArray(arr, i+1, current, sum)+sumArray(arr, i+1, current+arr[i], sum);
	}

}
