package staticKeyword;

// class within class

public class Outer {

    int id = 01;
    String name= "Shaikh";

    static class inner {
        int id = 02;
        String name = "ravi";
    }
}

class MainStatic{
    public static void main(String[] args) {
        Outer obj = new Outer();   // obj of outer class
        System.out.println(obj.id);
        System.out.println(obj.name);

        Outer.inner obj1 = new Outer.inner(); // obj of inner class
        System.out.println(obj1.id);
       System.out.println(obj1.name);


       StaticKeywordDemo.show();



    }
}

