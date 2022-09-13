package ArrayPractices;

public class ShiftString {

	public static void main(String[] args) {
		String s="who are you";
		String[] a = s.split(" ");
		int key=2;
		for(int k=0;k<key;k++)
		{
			String temp=a[0];
			for(int i=1;i<a.length;i++)
			{
				a[i-1]=a[i];
			}
			a[a.length-1]=temp;
		}
		for(String str:a)
		{
			System.out.print(str+" ");
		}
		

	}

}
