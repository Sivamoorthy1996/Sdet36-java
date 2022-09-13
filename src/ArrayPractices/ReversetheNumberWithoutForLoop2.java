package ArrayPractices;

public class ReversetheNumberWithoutForLoop2 {
 static int n=12345;
 static int sum=10;
	public static void main(String[] args) {
		System.out.println("Start");
		SumNumber();
		System.out.println(sum);
		System.out.println("end");
	}
	public static void SumNumber() {
		if(n>0) {
			int rev=n%10;
			sum=sum*rev+rev;
			n=n/10;
		}
	}
	

}
