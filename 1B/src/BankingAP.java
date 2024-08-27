
public class BankingAP {
	 public static void main(String[] args) {
	        LoginManager loginManager = LoginManager.getInstance();

	        
	        BankingOperations operations = new BankingOperations();
	        operations.viewBalance();
	        operations.deposit(4000);
	        operations.withdraw(5000);
	        
	        loginManager.login();

	        
	        operations.viewBalance();
	        operations.deposit(6000);
	        operations.withdraw(7000);

	        // User logs out
	        loginManager.logout();
	        
	        // User tries to perform banking operations after logging out
	        operations.viewBalance();
	    }
	}

