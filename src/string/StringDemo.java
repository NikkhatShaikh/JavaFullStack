package string;

import java.util.Locale;

public class StringDemo {
    public static void main(String[] args) {
        String city = new String("Nagpur"); // 2 object created
        String city1 = new String("Nagpur"); //1 object created

        String city2= "pune"; // 1 object created
        String city3= "pune"; // 0 object created
        String city4="kolhapur"; // 0 object created
        String city5= "Pune";  // 0 object created
        city5.concat("is biggest city"); // string is immutable
        System.out.println(city5);

        String city6 = new String("pune"); // 1 object is created

        String str = " Good Morning";
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.compareTo("Good Evening"));
    }
}
