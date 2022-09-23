
package Model;

/**
 *
 * @author this pc
 */

// Contains the acc that User give when login
public class LogIn {
    private Account acc = null;
    private static LogIn instance = new LogIn();
    
    private LogIn() {}
    
    public static LogIn getInstance() {
        return instance;
    }
    
    public Account getAccount() {
        return acc;
    }
    
    public void setAccount(Account acc) {
        this.acc = acc;
    }
}
