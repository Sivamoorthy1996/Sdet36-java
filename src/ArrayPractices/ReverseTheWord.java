package ArrayPractices;

public class ReverseTheWord {

	public static void main(String[] args) {
		String s="Welcome to bengaluru and Welcome to testyantra";
		 String[] s1 = s.split(" ");

        for (int i =s1.length-1; i>=0; i--) 
        {
		 System.out.print(s1[i]+" ");	
		}

	}

}
