package package1;

public class B {
    public static void main(String[] args) {
        A obj= new A();
        obj.i=20;
        obj.k=30;
        obj.l=40;  // j is not accessible here bcoz its private accessed only within package

        System.out.println(obj.i);
        System.out.println(obj.k);
        System.out.println(obj.l);

    }
}
