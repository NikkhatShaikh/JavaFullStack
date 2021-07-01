package patternbydurga;

public class StarPattern1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {   // outer loop for ROW DATA
            for (int j =1;j<=10;j++){     // inner loop for column
                System.out.print("*\t");  // \t - used for tab in o/p
            }
            System.out.println();
        }

    }
}
