package package1;

public class A {
    public int i=10;
    private int j ;
    protected int k;
    int l =567;

    public static void main(String[] args) {
        A obj = new A();
        obj.i=546;
        obj.j=90;
        obj.k=30;
        obj.l=10;
        System.out.println(obj.i);
        System.out.println(obj.j);
        System.out.println(obj.k);
        System.out.println(obj.l);
    }
}
