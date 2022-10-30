package recursion;

import java.util.Scanner;

public class RopeCutting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int res=new RopeCutting().cuttingRope(n,a,b,c);
		System.out.println(String.format("maximum cut of rope %s is = %s",n,res));
		sc.close();
	}

	private int cuttingRope(int n, int a, int b, int c) {
		// TODO Auto-generated method stub
		if(n==0)return 0;
		if(n<0)return-1;
		int res=Math.max(cuttingRope(n-a,a,b,c),
				Math.max(cuttingRope(n-b,a,b,c),
						cuttingRope(n-c,a,b,c)));
		if(res==-1)
		{
			return -1;
		}
		return res+1;
	}

}
