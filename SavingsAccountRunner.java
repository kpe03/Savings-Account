
import java.util.Scanner;

public class SavingsAccountRunner {
	
	/*This class collects the data from the user and insantiates an object from the SavingsAccount class*/
	
	public static void main(String[] args) {
		
		/*Boolean loopContinue ensures that the loop when choosing an option ends right when an option is chosen*/
		boolean loopContinue = true;
		int id;
		double initialBalance, annualIntRate;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Welcome to your Savings Account App!"
				+ "\nEnter your account number: ");
		id = input.nextInt();
		
		System.out.print("\nEnter your initial balance: ");
		initialBalance = input.nextDouble();
		
		System.out.print("\nEnter your annual interest rate: ");
		annualIntRate = input.nextDouble();
		
		//Create new object
		SavingsAccount yourAccount = new SavingsAccount(id, initialBalance, 
				annualIntRate);
		
		//Loop for the four options
		do {
			System.out.print("\n=============================="
					+ "\n=        OPTIONS BELOW       ="
					+ "\n=============================="
					+ "\n1. Deposit\n2. View Weekly Interest Rate"
					+ "\n3. View Account Details\n4. Exit"
					+ "\nEnter your selection \n");
			
			
			int menuOption = input.nextInt();
			
			//Check for invalid input
			while (menuOption < 1 || menuOption > 4) {
				System.out.print("\nINVALID SELECTION. TRY AGAIN!");
				menuOption = input.nextInt();
			}
			
			if (menuOption == 1) {
				System.out.println("Enter your deposit amount: ");
				double deposit = input.nextDouble();
				
				System.out.println("New Balance: ");
				System.out.println(yourAccount.deposit(deposit));
			}
			
			else if(menuOption == 2) {
				System.out.printf("Your weekly Interest Amount is $ %1.2f",
						yourAccount.getWeeklyIntRate());
			}
			
			else if(menuOption == 3) {
				System.out.print("\nAccount ID: " + id + "\n" + "\nAccount Creation "
						+ "Date/Time: ");
				yourAccount.getDateEstablished();
				System.out.print("\nBalance: " + yourAccount.getBalance()
						+ "\n" + "\n");
				System.out.printf("Weekly Interest Amount: %1.2f", yourAccount.getWeeklyIntRate());
				System.out.println("\n");
			}
			
			else {
				System.out.print("\nThank you, goodbye! :)");
				loopContinue = false;
			}
			
		} while (loopContinue);
		
		

	}

}
