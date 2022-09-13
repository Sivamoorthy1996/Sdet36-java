package ArrayPractices;

import java.util.LinkedHashSet;

public class PrintTheDuplicate {

	public static void main(String[] args) {
		String s1="sivasubramaniam";

		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s1.length(); i++) {
			set.add(s1.charAt(i));

		}
		for( Character it:set)
		{
			int count=0;
			for(int i=0;i<s1.length();i++) 
			{
				if(s1.charAt(i)==it)
				{
					count++;
				}
			}

			if(count>1)
			{
				System.out.println(it+ " "+ count);
			}
		}
	}

}
