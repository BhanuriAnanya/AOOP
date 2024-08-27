
public class LoginManager {
    
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
