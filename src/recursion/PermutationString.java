package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PermutationString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String data=sc.nextLine();
		List<String>result=new ArrayList<>();
		new PermutationString().permutation(data,"",result);
		System.out.println(result);
		sc.close();

	}

	private void permutation(String data,String current, List<String> result) {
		// TODO Auto-generated method stub
		if(data.length()==0)
		{
			result.add(current);
			return;
		}
		for(int i=0;i<data.length();i++)
		{
				permutation(data.substring(0,i)+data.substring(i+1), current+data.charAt(i), result);
		}
	}

}
