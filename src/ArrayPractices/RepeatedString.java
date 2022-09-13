package ArrayPractices;

import java.util.LinkedHashSet;

public class RepeatedString {

	public static void main(String[] args) {
		String s1="sivasubramaniam";
		char[] ar = s1.toCharArray();
	    LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < ar.length; i++) {
			set.add(ar[i]);
			
		}
		for( Character it:set)
		{
			int count=0;
			for(int i=0;i<ar.length;i++) 
			{
				if(ar[i]==it)
				{
					count++;
				}
			}
			System.out.println(it+":"+count);
		}
	}

}
