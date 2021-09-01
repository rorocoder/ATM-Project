
public class ATMTester {
	public static void main (String [] args) {
		ATM chase = new ATM();
		chase.deposit("Winfrey", 10);
		chase.deposit("Bezos", 5);
		chase.deposit("Bezos", 2);
		chase.deposit("MrTheiss",13);
		System.out.println(chase.toString());
		chase.withdraw("Bezos", 2);
		System.out.println(chase.toString());
		chase.withdraw("MrTheiss", 15);
		System.out.println(chase.checkBalance("Bezos"));
		System.out.println(chase.checkBalance("Winfrey"));
		System.out.println(chase.checkBalance("YoMama"));
		System.out.println(chase.checkBalance("MrTheiss"));
		System.out.println(chase.toString());
	}
}
