package starPatterns;

public class StarPiramidPattern {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j =5;j>=i;j--){
                System.out.print("_");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" *"); //  here add empty space before star fo making peramid
            }
            System.out.println();
        }
    }
}
