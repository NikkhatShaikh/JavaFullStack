package patternbydurga;

public class OneToTenPattern {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++){    // outer loop for row data
            for (int j =1;j<=10;j++){  // inner loop - for column data
                System.out.print(i+"\t"); // \t - used for tab in o/p
                //System.out.print(j);
            }
            System.out.println();
        }
    }
}
