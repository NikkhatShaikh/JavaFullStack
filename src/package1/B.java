package package1;

public class B {
    public static void main(String[] args) {
        A obj = new A();
        obj.i=300;
        obj.k=400;  // here j is not accessed because j in class a is private which is not accessed by out of class
        obj.l=500;
        System.out.println(obj.i);
        System.out.println(obj.k);
        System.out.println(obj.l);
    }
}
