
public class ATMTester {
	public static void main (String[] args) {
		ATM chase = new ATM();
		chase.deposit("Winfrey", 10.0);
		chase.deposit("Bezos", 5.0);
		chase.deposit("Bezos", 2.0);
		chase.deposit("MrTheiss",13.0);
		chase.withdraw("Bezos", 2.0);
		chase.withdraw("MrTheiss", 15.0);
		System.out.println(chase.checkBalance("Bezos"));
		System.out.println(chase.checkBalance("Winfrey"));
		System.out.println(chase.checkBalance("YoMama"));
		System.out.println(chase.checkBalance("MrTheiss"));
	
	}
}
