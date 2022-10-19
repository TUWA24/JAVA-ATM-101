import java.util.Arrays;
import java.util.List;

class AccountManager{
	//create a list of accounts;
	public List<Account> accounts=getAccounts();
	
	public List<Account> getAccounts(){
		//list of accounts from database
		return Arrays.asList(new Account("Tuwa","123",10000),
				new Account("Steve","1234",1000),
				new Account("Ed","12345",900));
	}
	public Account selectAccount(String accountName,String accountPassword){
		
		for (Account account:accounts){
			if(account.isMatching(accountName, accountPassword)){
				System.out.print("Welcome "+accountName+"\n"+"Your balance is: "+account.balance);
				return account;
			}
		}
		System.out.print("Not Matched");
		return null;
	}
}