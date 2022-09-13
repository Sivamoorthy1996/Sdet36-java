package ArrayPractices;

import java.util.LinkedHashSet;

public class RemoveDuplicateWord {
	public static void main(String[] args) {

		String s="Welcome to bengaluru and Welcome to testyantra";

		String[] s1=s.split(" ");

		LinkedHashSet<String> set = new LinkedHashSet<String>();

		for (int i = 0; i < s1.length; i++) 
		{
			set.add(s1[i]);
		}

		System.out.println(set);
	}

}
