
public class Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount Smith = new BankAccount("Smith");
		BankAccount Cox = new BankAccount("Cox");
		BankAccount Matthew = new BankAccount("Matthew", 100);
		BankAccount Jones = new BankAccount("Jones", 1011);
		System.out.println("Initial Accounts:");
		System.out.println(Matthew.toString());
		System.out.println(Smith.toString());
		System.out.println(Cox.toString());
		System.out.println(Jones.toString());
		Matthew.deposit(42);
		Cox.deposit(10.42);
		Jones.withdraw(432);
		Jones.transfer(Matthew, 252.32);
		Cox.transfer(Matthew, 75);
		Smith.withdraw(15);
		System.out.println("Final Accounts:");
		System.out.println(Smith.toString() + Cox.toString() + Matthew.toString() + Jones.toString());
		System.out.println(Matthew.toString());
		System.out.println(Smith.toString());
		System.out.println(Cox.toString());
		System.out.println(Jones.toString());
		System.out.println("Total Bank Balance: " + (Smith.getBalance() + Cox.getBalance() + Matthew.getBalance() + Jones.getBalance()));

	}

}
