package polymorphism1;


/** polymorphism :  the ability to take one form to many forms.
 *
 * or
 * one thing have many actions.
 */


public class PolyDemo {

    /**Method overloding - a class has multiple method with same name.
     *                      having different number of argument.
     *
     * Rule1- changing the datatype 2) changing tha argument or parameter.
     *
     * increase the readability of program.
     *
     * static binding/ early binding / compile time polymorphism
     *
     */

    public int add(int a , int b){
        return a+b;
    }

    public int add(int a,int b, int c){
        return a+b+c;
    }

    public double add(double a , int b){
        return a+b;
    }

    public static void main(String[] args) {

        PolyDemo polyDemo = new PolyDemo();
        int myadd1=polyDemo.add(10,20,30);
        System.out.println(myadd1);

        int myadd2= polyDemo.add(10,20);
        System.out.println(myadd2);

       int myadd3= polyDemo.add(200,30);
        System.out.println(myadd3);


    }
}
