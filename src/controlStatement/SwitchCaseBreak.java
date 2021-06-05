package controlStatement;

public class SwitchCaseBreak {
    public static void main(String[] args) {
                                //int day = 8;  // used default case
         int day =5;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Entered Case is not matched");
        }
    }
}
