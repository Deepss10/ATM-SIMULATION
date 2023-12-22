import java.util.Scanner;

public class AtmExample {

	public static void main(String[] args) {
		
		int balance= 100000,withdraw ,deposit;
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			System.out.println("AUTOMATED TELLER MACHINE");
			System.out.println("choose 1 to withdraw");
			System.out.println("choose 2 to deposit");
			System.out.println("choose 3 for check balance");
			System.out.println("choose 4 for exit");
			System.out.println("choose the operation you want to perform");
			
			int choice =sc.nextInt();
			switch(choice) {
			
			case 1:
			System.out.println("Enter the money to be withdrawn");
			withdraw= sc.nextInt();
			
			if(balance>=withdraw) {
				balance=balance-withdraw;
				System.out.println("Please collect your money");
			}
			else {
				System.out.println("insufficient balance");
			}
			System.out.println("");
			break;
			
			case 2:
				System.out.println("Enter your money to be deposit");
				deposit=sc.nextInt();
				balance=balance+deposit;
				System.out.println("Your money has been successfully deposited");
				System.out.println("");
				break;
				
			case 3:
				System.out.println("Balance is :"+balance);
				System.out.println("");
				break;
				
			case 4:
			System.out.println("Thank you");
			}
		}

	}

}
