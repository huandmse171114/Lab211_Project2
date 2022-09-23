package Model;

// Equals with AccountChecker in example

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AccountDAO implements DAO<Account> {
    private ArrayList<Account> accList;
    private Config cF = new Config();
    private final String ACC_FILENAME;
    public AccountDAO() {
        this.ACC_FILENAME = cF.getAccountFilename();
        accList = readFromFile();
    }
    
    @Override
    public ArrayList<Account> getList() {
        return accList;
    }

    @Override
    public boolean exist(Account acc) {
        boolean isExist = false;
        for (Account acc1 : accList) {
            if (acc1.equals(acc)) {
                isExist = true;
            }
        }
        return isExist;
    }

    @Override
    public void add(Account acc) {
        accList.add(acc);
    }

    @Override
    public void delete(Account acc) {
        accList.remove(acc);
    }

    public void set(Account acc) {
        for (int i = 0; i < accList.size(); i++) {
            if (accList.get(i).equals(acc)) {
                accList.set(i, acc);
                break;
            }
        }
    }

    public Account get(String username, String pwd) {
        for (Account acc : accList) {
            if (acc.getAccName().equals(username) && acc.getPwd().equals(pwd)) {
                return acc;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Account> readFromFile() {
        ArrayList<Account> fList = new ArrayList();
        try {
            FileInputStream fileIn = new FileInputStream(cF.getAccountFilename());
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            Account obj;
            int length = objectIn.readInt();
            for (int i = 0; i < length; i++) {
                obj = (Account) objectIn.readObject();
                fList.add(obj);
            }
            objectIn.close();

        } catch (IOException | ClassNotFoundException ex) {
        }
        return fList;
    }

    @Override
    public void writeToFile() {
        try {
            FileOutputStream fileOut = new FileOutputStream(ACC_FILENAME);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeInt(accList.size());
            for (int i = 0; i < accList.size(); i++) {
                objectOut.writeObject(accList.get(i));
            }
            objectOut.close();
        } catch (IOException ex) {
        }
    }

 
    
}
