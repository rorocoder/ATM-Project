
public class ATMTester {
<<<<<<< Updated upstream
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
=======
	public static void main(String[] args) {
		ATM bank = new ATM();
		
		bank.deposit("Winfrey", 25159684372.43);
		bank.deposit("Bezos", 193495330293.43);
		bank.deposit("Bezos", 20394353.35);
		bank.withdraw("Bezos", 3593293.66);
		bank.deposit("MrTheiss",64033.55);
		bank.withdraw("MrTheiss", 443964.46);
		bank.checkBalance("Bezos");
		bank.checkBalance("Winfrey");
		bank.checkBalance("YoMama");
		bank.checkBalance("MrTheiss");
	}

>>>>>>> Stashed changes
}
