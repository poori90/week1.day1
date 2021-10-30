package week1.day1;

public class LearnObject1 {
	String phone1;
	String phone2;
	public void makeCalls() {
		System.out.println("For making calls use Dailpad");

	}
	private void doMessage() {
	System.out.println("For messaging use messenger");

	}
	public static void main(String[] args) {
		System.out.println("Defining Apple Properties");
		LearnObject1 Apple = new LearnObject1();
		Apple.phone1="Apple";
		Apple.makeCalls();
		Apple.doMessage();
		System.out.println("******************************************************");
		System.out.println("Defining Samsung Properties");
		LearnObject1 Samsung = new LearnObject1();
		Samsung.phone2="Samsung";
		Samsung.makeCalls();
		Samsung.doMessage();
		
	}

}
