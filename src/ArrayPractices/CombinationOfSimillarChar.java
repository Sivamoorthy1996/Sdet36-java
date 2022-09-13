package ArrayPractices;

public class CombinationOfSimillarChar {

	public static void main(String[] args) {
		String s1="abcdaabaabc";
		char[] ar = s1.toCharArray();

		for (int i = 0; i < ar.length; i++) {

			for (int j = i+1; j < ar.length; j++) {
				if(ar[i]>ar[j])
				{
					char temp = ar[i];
					ar[i]=ar[j];
					ar[j]=temp;

				}

			}
			System.out.print(ar[i]);

		}

	}

}
