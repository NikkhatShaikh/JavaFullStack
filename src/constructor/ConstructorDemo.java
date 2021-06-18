package constructor;
/**
 * Constructor ==> is a special type of function
 * which executed when you create object of your class.
 *
 * RULE==>
 * 1= constructor name is same as class name.
 * 2= there is no return type to constructor
 * 3= we can not use abstract, final, static,synchronized keyword
 *
 * types -
 * 1) parameterized
 * 2) Default
 *
 * purpose=> it is initialized variables to their default values
 *
 */
public class ConstructorDemo {

    int id=6;
    String name = "nikkhat";

    public void show(){
        System.out.println("name=> "+name+"id==> "+id);
    }

    public ConstructorDemo(int i){

    }
    public  ConstructorDemo(int i, int j){ // constructor overloading

    }


    public static void main(String[] args) {
        ConstructorDemo obj = new ConstructorDemo(10,20);
        obj.show();
    }
}
