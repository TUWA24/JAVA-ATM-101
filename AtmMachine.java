import java.util.Scanner;
public class AtmMachine {

	
	/* Account names          Account Password
	   Tuwa                     123
	   Steve                    1234
	   Ed                       12345
	 */
	 
			static Scanner scanner=new Scanner(System.in);
			static String accountHolderName = null;
			static String accountPass=null;
			static int option;
			static AccountManager m=new AccountManager();
			
			public static void main(String[] args){
				System.out.println("Welcome to my ATM");
				
				System.out.println("Enter account holder name");
				accountHolderName=new String(scanner.nextLine());
					
				System.out.println("Enter account password");
				accountPass=new String(scanner.nextLine());
				Account customer=m.selectAccount(accountHolderName,accountPass);
				System.out.print(customer.accountName);
				do{
					System.out.println("Welcome "+ customer.accountName);
					System.out.println("Select Option: ");
					System.out.println("1.Balance\n"
							+ "2.Withdraw\n"
							+ "3.Deposit\n"
							+ "4.Exit\n");	
					switch(option){
					case 1:
						System.out.print(customer.checkBalance());
						break;
					case 2:
						System.out.println("Enter the amount to Withdraw");
						double amount=scanner.nextInt();
						double left=customer.withdrawl(amount);
						System.out.println("Total Amount: "+left);
						break;
					case 3:
						System.out.println("Enter the amount to Deposit");
						double amount1=scanner.nextInt();
						double left1=customer.deposit(amount1);
						System.out.println("Total Amount: "+left1);
						break;
						
					case 4:
						break;
					}
					option=scanner.nextInt();
				}while(option!=5);
				
				}
			{

	}

}
