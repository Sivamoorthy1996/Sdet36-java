package ArrayPractices;

public class FirstAndSecondMax {

	public static void main(String[] args) {
		int a[]= {4,7,5,6,2};
		int firstMax=a[0];
		int secondMax=a[0];
		for(int i=0;i<a.length;i++) {
			if(firstMax<a[i])
			{   secondMax=firstMax;
				firstMax=a[i];
			}
			else if (secondMax<a[i])
			{
				secondMax=a[i];
			}
		}
		System.out.println(firstMax);
		System.out.println(secondMax);

	}

}
