package ArrayPractices;

public class FirstMax {

	public static void main(String[] args) {
		int a[]= {4,7,5,6};
		int firstMax=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>firstMax)
			{
				firstMax=a[i];
			}
		}
		System.out.println(firstMax);
	}

}
