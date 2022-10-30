package recursion;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GenerateSubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String data=sc.nextLine();
		Set<String>subset=new HashSet<>();
		new GenerateSubset().generate(data,"",0,subset);
		System.out.println(subset);
		sc.close();
	}

	private void generate(String data, String string, int i, Set<String> subset) {
		if(i==data.length())
		{
			subset.add(string);
			return;
		}
		generate(data, string, i+1, subset);
		generate(data, string+data.charAt(i), i+1, subset);
		
	}

}
