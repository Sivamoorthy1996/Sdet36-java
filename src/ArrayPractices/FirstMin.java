package ArrayPractices;

public class FirstMin {

	public static void main(String[] args) {
		int a[]= {4,7,5,6};
		int firstMin=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<firstMin)
			{
				firstMin=a[i];
			}
		}
		System.out.println(firstMin);
	}

}
