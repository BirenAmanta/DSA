package recursion;

import java.util.Scanner;

public class PalindromCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String data=sc.nextLine();
		boolean check=new PalindromCheck().check(data,0,data.length()-1);
		System.out.println(check);
		sc.close();
	}

	private boolean check(String str,int start,int end) {
		// TODO Auto-generated method stub
		if(start>=end)return true;
		return str.charAt(start)==str.charAt(end) && check(str,start+1,end-1);
	}

}
