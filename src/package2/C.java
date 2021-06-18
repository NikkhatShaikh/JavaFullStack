package package2;

import package1.A;
// for access properties from another package class  firstly import that class package
public class C extends A {
    public static void main(String[] args) {
        C obj = new C();

obj.i=10;
obj.k=20;
        System.out.println(obj.i);
        System.out.println(obj.k);
}
}




