package staticKeyword;

public class StaticKeywordDemo {
    int id;
    String Name;
     static String SchoolName;

     static {
         System.out.println("in static block");
         SchoolName="XYZ";
     }
     public static void show(){
         System.out.println(" in show method");
     }
     public StaticKeywordDemo(){
         System.out.println(" in constructor");
     }

    public static void main(String[] args) {
        StaticKeywordDemo obj = new StaticKeywordDemo();
        obj.id=1;
        obj.Name= " Shaikh";

        StaticKeywordDemo.show(); // here we can only use show() method
                                  // without creating obj we directly call static variable/ method
        StaticKeywordDemo obj1= new StaticKeywordDemo();
        obj1.id=2;
        obj1.Name="Nikkhat";

        StaticKeywordDemo obj2= new StaticKeywordDemo();
        obj2.id=3;
        obj2.Name="Gulab";
        System.out.println("id=>"+obj.id+ " Name=>"+obj.Name+" SchoolName=>"+SchoolName);
        System.out.println("id =>"+obj1.id+" name "+obj1.Name+"Schoolname "+SchoolName);

    }
}



