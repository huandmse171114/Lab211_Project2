
package Model;

// Contains Accounts file, Deliveries file, and Dealers filename + data

import MyTools.Utils;
import java.util.ArrayList;
import java.util.List;

public class Config {
    private static final String CONFIG_FILE = "Config.txt";
    private String accountFilename;
    private String dealersFilename;
    private String deliveriesFilename;
    
    public Config() {
        readData();
    }
    
    private void readData() {
        ArrayList<String> lines = Utils.readLinesFromFile(CONFIG_FILE);
        for (String line: lines) {
            line = line.toUpperCase();
            String[] parts = line.split(":");
            if (line.contains("ACCOUN")) accountFilename = parts[1].trim().charAt(0) + parts[1].trim().substring(1).toLowerCase();
            if (line.contains("DEALE")) dealersFilename = parts[1].trim().charAt(0) + parts[1].trim().substring(1).toLowerCase();
            if (line.contains("DELIVER")) deliveriesFilename = parts[1].trim().charAt(0) + parts[1].trim().substring(1).toLowerCase();
        }
    }

    public String getAccountFilename() {
        return accountFilename;
    }

    public String getDealersFilename() {
        return dealersFilename;
    }

    public String getDeliveriesFilename() {
        return deliveriesFilename;
    }
}

