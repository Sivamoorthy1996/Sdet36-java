package ArrayPractices;

public class ShiftNumber {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int key=2;
		for(int k=0;k<key;k++)
		{
			int temp=a[0];
			for(int i=1;i<a.length;i++)
			{
				a[i-1]=a[i];
			}
			a[a.length-1]=temp;
		}
		for(int str:a)
		{
			System.out.print(str+" ");
		}
		

	}

}
