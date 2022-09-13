package ArrayPractices;

public class BubbleSortByAscending {

	public static void main(String[] args) {
		int a[]= {45,25,54,12,5};
		int temp;
		System.out.println(a.length);
		for(int i=0;i<a.length;i++)
		{
		for(int j=i+1;j<a.length;j++) 
		{
			if (a[i]>a[j]) 
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
