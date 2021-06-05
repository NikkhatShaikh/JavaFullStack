package inheritance;

public class Father extends GrandFather {  // derived class/child class/sub class
    // public void display(){              // if child class method is available then its call this method
     //    System.out.println("id="+id + " "+"name=" +name);   // if method is not available its called parent class method
    // }

    public static void main(String[] args) {
        Father father = new Father();
        father.id =2;
        father.name = "Gulab shaikh";
        father.display();
    }

}
