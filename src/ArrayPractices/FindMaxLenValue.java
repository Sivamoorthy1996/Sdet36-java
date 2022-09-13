package ArrayPractices;

public class FindMaxLenValue {

	public static void main(String[] args) {
		String s[]= {"hi","hello","one","sivamoorthy","killer"};
		int max=s[0].length();
		int min=s[0].length();
		for(int i=1;i<s.length;i++)
		{
			if(max<s[i].length())
			{
				max=s[i].length();
			}
			else if (min>s[i].length()) {
				min=s[i].length();
				
			}
			
		}
		for(int i=0;i<s.length;i++) {
			if(s[i].length()==max)
			{
				System.out.println(s[i]);
			}
			if(s[i].length()==min)
			{
				System.out.println(s[i]);
			}
			
		}

	}

}
