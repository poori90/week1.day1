package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int f=0, s=1, r=8, sums ;
		System.out.println(f +""+s);
		for (int i = 2; i <=r; i++) {
			sums=f+s;
			System.out.println(""+sums);
			f=s;
			s=sums;
		}
	}

}
