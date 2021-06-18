package KeywordsInJava;

/** this Keyword=> is refers current class instant variable
 *
 *   it invoke the current class methods.
 *   it invoke the current class constructor
 */


public class ThisDemo {
    int id ;
    String name;       // instant variable
    String address;

    public ThisDemo(int id,String name,String address ){   // local variable
        this.id=id;
        this.name=name;
        this.address = address;
    }

    public ThisDemo(){
        System.out.println(" default constructor");
    }

    public void show(){
        System.out.println("id is "+id+"Name is "+name+"address is"+address);
    }
    public  void display(){
        this.show();
               }

    public static void main(String[] args) {
        ThisDemo obj = new ThisDemo(1,"nikkhat","Pune");
        obj.show();
        //ThisDemo obj1 = new ThisDemo();// obj1 is created for calling default costructor
    }
}
