
package Model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author this pc
 */
public class DealerDAO implements DAO<Dealer> {
    private ArrayList<Dealer> dealerList;
    private final Config cF = new Config();
    private final String DEALER_FILENAME;
    
    public DealerDAO () {
        this.DEALER_FILENAME = cF.getDealersFilename();
        dealerList = readFromFile();
    }

    @Override
    public void add(Dealer dealer) {
        dealerList.add(dealer);
    }

    @Override
    public void delete(Dealer dealer) {
        dealerList.remove(dealer);
    }

    public void set(Dealer dealer) {
        for (int i = 0; i < dealerList.size(); i++) {
            if (dealerList.get(i).equals(dealer)) {
                dealerList.set(i, dealer);
                break;
            }
        }
    }

    public Dealer get(String dealerID) {
        for (Dealer dealer: dealerList) {
            if (dealer.getID().equals(dealerID)) {
                return dealer;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Dealer> readFromFile() {
        ArrayList<Dealer> fList = new ArrayList();
        try {
            FileInputStream fileIn = new FileInputStream(DEALER_FILENAME);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            Dealer obj;
            int length = objectIn.readInt();
            for (int i = 0; i < length; i++) {
                obj = (Dealer) objectIn.readObject();
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
            FileOutputStream fileOut = new FileOutputStream(DEALER_FILENAME);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeInt(dealerList.size());
            for (int i = 0; i < dealerList.size(); i++) {
                objectOut.writeObject(dealerList.get(i));
            }
            objectOut.close();
        } catch (IOException ex) {
        }
    }

    @Override
    public ArrayList<Dealer> getList() {
        return dealerList;
    }

    @Override
    public boolean exist(Dealer dealer) {
        boolean isExist = false;
        for (Dealer dealer1 : dealerList) {
            if (dealer1.equals(dealer)) {
                isExist = true;
            }
        }
        return isExist;
    }
    
    
}
