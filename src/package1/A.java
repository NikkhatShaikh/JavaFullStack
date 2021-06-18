package package1;

public class A {
    public int i=10;
    private  int j ;
    protected  int k ;
    int l = 500;

    public static void main(String[] args) {
        A obj = new A();
        // obj.i=200;
       // obj.j=10;
       // obj.k=25;
       // obj.l=30;
        System.out.println(obj.i);
        System.out.println(obj.j);
        System.out.println(obj.k);  // it gives default values of int data type
        System.out.println(obj.l);
    }


}
