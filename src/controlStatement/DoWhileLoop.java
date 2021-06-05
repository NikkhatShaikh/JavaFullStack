package controlStatement;

public class DoWhileLoop {
    public static void main(String[] args) {
        int i= 0;
        do {
            System.out.println(i);
            i++;   // dont forget this condition otherwise loop never ends
        }
        while (i<5);
    }
}
