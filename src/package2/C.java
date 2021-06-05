package package2;
import package1.A;

public class C extends A{
    public static void main(String[] args) {
        C obj = new C();
        obj.i=1000;
        obj.k=200;
        System.out.println(obj.i);
        System.out.println(obj.k);
    }
}
