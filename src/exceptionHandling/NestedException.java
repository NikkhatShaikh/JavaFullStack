package exceptionHandling;

public class NestedException {

    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        try {

        try {
            i = 10;
            j = i / 0;
            System.out.println(j);
        } catch (ArithmeticException e) {
            System.out.println(" Divided by zero");
        }

        String str = null;
            System.out.println(str.length());

        int [] arr = new int [3];
        arr[3]=10;
            System.out.println(" Hello");
            System.out.println("Hello");


    } catch (ArithmeticException e){
            System.out.println(" Divide by 0 not possible"+e);
        } catch (NullPointerException e){
            System.out.println("e"+e);
        } catch (Exception e){
            System.out.println("e "+e);
        }

        System.out.println("hi");
        System.out.println("hi");
        System.out.println("hi");

        }

}
