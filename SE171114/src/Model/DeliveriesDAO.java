/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class DeliveriesDAO implements DAO<Deliveries> {
    private ArrayList<Deliveries> deliverList;
    private final Config cF = new Config();
    private final String DELIVER_FILENAME;
    
    public DeliveriesDAO() {
        this.DELIVER_FILENAME = cF.getDeliveriesFilename();
        deliverList = readFromFile();
    }
    
    @Override
    public boolean exist(Deliveries deliver) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Deliveries deliver) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Deliveries delivery) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void set(Deliveries deliver) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Deliveries get(String deliverID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Deliveries> readFromFile() {
        ArrayList<Deliveries> fList = new ArrayList();
        try {
            FileInputStream fileIn = new FileInputStream(DELIVER_FILENAME);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            Deliveries obj;
            int length = objectIn.readInt();
            for (int i = 0; i < length; i++) {
                obj = (Deliveries) objectIn.readObject();
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
            FileOutputStream fileOut = new FileOutputStream(DELIVER_FILENAME);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeInt(deliverList.size());
            for (int i = 0; i < deliverList.size(); i++) {
                objectOut.writeObject(deliverList.get(i));
            }
            objectOut.close();
        } catch (IOException ex) {
        }
    }

    @Override
    public ArrayList<Deliveries> getList() {
        return deliverList;
    }
    
}
