package Controller;

import Model.Deliveries;
import Model.DeliveriesDAO;
import java.util.ArrayList;

public class DeliveriesMngController {
    private static DeliveriesDAO deliveriesDaoObj = new DeliveriesDAO();
    
    public static ArrayList<Deliveries> getDeliveriesList() {
       return deliveriesDaoObj.getList(); 
    }
}
