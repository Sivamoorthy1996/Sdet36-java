package ArrayPractices;

import java.util.LinkedHashSet;

public class RepeatedWord {

	public static void main(String[] args) {
		String s="Welcome to bengaluru and Welcome to testyantra";

		String[] s1=s.split(" ");

		LinkedHashSet<String> lhs=new LinkedHashSet<String>();

		for (int i = 0; i < s1.length; i++) 
		{
			lhs.add(s1[i]);
		}

			for (String s2 : lhs)
			{
				int count=0;

				for (int i = 0; i < s1.length; i++) 
				{
					if(s2.equals(s1[i]))
					{
						count++;
					}
				}
				System.out.println(s2+" "+count);
			}
		}

}
