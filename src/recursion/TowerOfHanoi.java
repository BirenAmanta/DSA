package recursion;

import java.util.Scanner;

public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int disk=sc.nextInt();
		new TowerOfHanoi().moveDisk(disk,'A','B','C');
		sc.close();
	}

	private void moveDisk(int disk, char A, char aux, char C) {
		// TODO Auto-generated method stub
		if(disk==0)
		{
			return;
		}
		moveDisk(disk-1, A,C,aux);
		System.out.println("Moved disk "+ disk+" from "+A+" to "+C);
		moveDisk(disk-1, aux,A,C);

	}

}
