
package MyTools;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author this pc
 */
public class Utils {
    private static final Scanner sc = new Scanner(System.in);
    
    public static boolean validStr(String str, String regEx) {
        return false;
    }
    
    public static boolean validPassword(String str, int minLen) {
        if (str.length() < minLen) return false;
        return str.matches(".*[a-zA-Z]+.*") && //At least 1 character
                str.matches(".*[\\d]+.*") && //At least 1 digit
                str.matches(".*[\\W]+.*"); //At least 1 special character
    }
    
    public static Date parseDate(String dateStr, String dateFormat) {
        SimpleDateFormat dF = (SimpleDateFormat)SimpleDateFormat.getInstance();
        dF.applyPattern(dateFormat);
        try{
            long t = dF.parse(dateStr).getTime();
            return new Date(t);
        }catch(ParseException e) {
            System.out.println(e);
        }
        return null;
    }
    
    public static String dataToStr(Date date, String dateFormat) {
        SimpleDateFormat dF = (SimpleDateFormat)SimpleDateFormat.getInstance();
        dF.applyPattern(dateFormat);
        return dF.format(date);
    }
    
    public static boolean parseBool(String boolStr) {
        char c = boolStr.trim().toUpperCase().charAt(0);
        return (c == '1' || c == 'Y' || c == 'T');
    }
    
    public static String readNonBlank(String message) {
        String input = "";
        do {
            System.out.println(message + ": ");
            input = sc.nextLine();
        }while (input.isEmpty());
        return input;
    }
    
    public static String readPattern(String message, String pattern) {
        String input = "";
        boolean valid;
        do {
            System.out.println(message + ": ");
            input = sc.nextLine();
            valid = validStr(input,pattern);
        }while (!valid);
        return input;
    }
    
    public static boolean readBool(String message) {
        String input;
        System.out.println(message + ": ");
        input = sc.nextLine();
        if (input.isEmpty()) return false;
        char c = Character.toUpperCase(input.charAt(0));
        return (c == '1' || c == 'Y' || c == 'T');
    }
    
    public static ArrayList<String> readLinesFromFile (String filename) {
        ArrayList<String> list = new ArrayList();
        try {
            File file = new File(filename);
            Scanner readFile = new Scanner(file);

            while (readFile.hasNextLine())
                list.add(readFile.nextLine());
            readFile.close();
            return list;
        } catch (Exception e) {
        }
        return null;
    }
}
