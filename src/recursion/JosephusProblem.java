package recursion;

import java.util.Scanner;

public class JosephusProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int person=sc.nextInt();
		int index=sc.nextInt();
		int left=new JosephusProblem().kill(person,index);
		System.out.println(left+" no person left");
		sc.close();
	}

	private int kill(int person, int index) {
		// TODO Auto-generated method stub
		if(person==1)
		return 0;
		return (kill(person-1,index)+index)%person;
	}

}
