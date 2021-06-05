package polymorphism;


/** polymorphism - ability to take one form to many form
 * or one thing have many action.
 * Ex- 1)methodovefrloading 2)methodOverriding
 **/

public class PolyDemo {
    /**
     * methodoverloading - a class has multiple method with same name
     * having different number of argument
     * Rule 1 - changing the datatype 2) changing the argument/ parameter
     * static binding - early binding - complete time polymorphism
     * advntages -> it increase the redability of program
     */

    public int add(int i, int j) {
        return i + j;
    }

    public int add(int i, int j, int k) {
        return i + j + k;
    }

    public double add(double i, int j) {
        return i + j;
    }

    public static void main(String[] args) {
        PolyDemo obj= new PolyDemo();
        System.out.println(obj.add(10,20));
        System.out.println(obj.add(10,20,30));
        System.out.println(obj.add(300.10,20));

    }
}