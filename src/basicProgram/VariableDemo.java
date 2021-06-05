package basicProgram;

public class VariableDemo {

    int i = 10;                    // instance  variable declared in class
     static int k = 20;            // Static Variable declared as static variable
     public void testVariable(){
         int j = 9;                 // loacal variable declared withid method body
         System.out.println("in test");
     }

     class Test{

     }

    public static void main(String[] args) {
        VariableDemo obj = new VariableDemo();
        obj.testVariable();
        System.out.println(obj.i+ obj.k);   // instant variable access by obj name.variable name
         System.out.println();

     }
}
