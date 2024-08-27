
class LoginManager {
    
    private static LoginManager instance;
    
    
    private boolean isLoggedIn = false;
    
   
    private LoginManager() {}

   
    public static LoginManager getInstance() {
        if (instance == null) {
            instance = new LoginManager();
        }
        return instance;
    }
    
    
    public void login() {
        if (!isLoggedIn) {
            isLoggedIn = true;
            System.out.println("User logged in successfully.");
        } else {
            System.out.println("User is already logged in.");
        }
    }
    
    
    public void logout() {
        if (isLoggedIn) {
            isLoggedIn = false;
            System.out.println("User logged out successfully.");
        } else {
            System.out.println("User is not logged in.");
        }
    }
    
    
    public boolean isLoggedIn() {
        return isLoggedIn;
    }
}


class BankingOperations {
    private LoginManager loginManager = LoginManager.getInstance();
    
  
    public void viewBalance() {
        if (loginManager.isLoggedIn()) {
            System.out.println("Your balance is $10,000.");
        } else {
            System.out.println("Please log in to view balance.");
        }
    }
    
    
    public void deposit(double amount) {
        if (loginManager.isLoggedIn()) {
            System.out.println("Deposited $" + amount + " successfully.");
        } else {
            System.out.println("Please log in to deposit money.");
        }
    }
    
   
    public void withdraw(double amount) {
        if (loginManager.isLoggedIn()) {
            System.out.println("Withdrew $" + amount + " successfully.");
        } else {
            System.out.println("Please log in to withdraw money.");
        }
    }
}


