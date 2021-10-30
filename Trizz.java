package week1.day1;

public class Trizz {

	public static void main(String[] args) {
		int n=21;
		if(n%3==0 && n%5==0 )
		{
			System.out.println("TRIZZ - FIZZ");
		}
		else if(n%5==0)
		{
			System.out.println("FIZZ");
	}
		else													
			System.out.println("TRIZZ");

	}

}
