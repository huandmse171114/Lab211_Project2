package Controller;

import Model.Account;
import Model.AccountDAO;
import Model.LogIn;

public class LogInController {
    private static LogIn logInObj = LogIn.getInstance();
    private static Account acc = logInObj.getAccount();
    private static AccountDAO accDAO = new AccountDAO();
    
    public static void showAccData() {
        System.out.println(acc.getAccName());
    }
    
    public static Account check(String accName, String accPwd) {
        return accDAO.get(accName, accPwd);
    }
    
    
    public void HuanNGU(){
        System.out.println("Huan Ngu Ngok DaM DAng");
    }
}
