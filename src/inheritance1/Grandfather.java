package inheritance1;

public class Grandfather { //parent class / super class / base class

    int id =01 ;   // instance variable
    String Name="Nikkhat";

    public void display(){
        System.out.println("id "+id+" Name "+Name);
    }

    public static void main(String[] args) {
        Grandfather grandfather = new Grandfather();
       // grandfather.id= 01;
       // grandfather.Name = " Nikkhat";
        // we can pass value to variable by two types


        grandfather.display();
    }

}
