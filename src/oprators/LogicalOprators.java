package oprators;

public class LogicalOprators {

    public static void main(String[] args) {
        int x=10,y=30;
        System.out.println(x>9&&y>30); // true - when both conditions are true

        System.out.println(x>11||y>25); // returns true because one of the conditions are true
                                       // (5 is greater than 3, but 5 is not less than 4)
        System.out.println(!(x<10));  // get reverse to the result
    }
}
