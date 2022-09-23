package Model;

import java.io.Serializable;

public class Dealer implements Serializable, Comparable<Dealer> {
//    Attribute format variables
    private static String ID_FORMAT = "D\\d{3}";
    private static String PHONE_FORMAT =  "\\d{9}|\\d{11}";
    
    private String ID;
    private String name;
    private String addr;
    private String phone;
    private boolean continuing;

    public Dealer() {
    }

    public Dealer(String ID, String name, String addr, String phone, boolean continuing) {
        this.ID = ID;
        this.name = name;
        this.addr = addr;
        this.phone = phone;
        this.continuing = continuing;
    }

    public boolean equals(Dealer o) {
        Dealer object = (Dealer) o;
        return this.getID().equals(object.getID());
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isContinuing() {
        return continuing;
    }

    public void setContinuing(boolean continuing) {
        this.continuing = continuing;
    }

    @Override
    public int compareTo(Dealer t) {
        return 0;
    }

    public static String getID_FORMAT() {
        return ID_FORMAT;
    }

    public static String getPHONE_FORMAT() {
        return PHONE_FORMAT;
    }
}
