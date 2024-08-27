
public class Loggerdemo {
	public static void main(String[] args) {
	       
        Application app1 = new Application();
        Application app2 = new Application();
        app1.performAction("Start process");
        app2.performAction("End process");
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        System.out.println("Are both logger instances the same? " + (logger1 == logger2));
    }
}


