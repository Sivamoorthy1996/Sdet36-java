package ArrayPractices;

public class FirstUpperCase {
	public static void main(String[] args)
	{
	String s="welcome to india";
	String[] sp = s.split(" ");
	for (int i = 0; i < sp.length; i++)
	{
	String word = sp[i];
	word=word.substring(0,1).toUpperCase()+word.substring(1);
	System.out.print(word+" ");
	}
	}


}
