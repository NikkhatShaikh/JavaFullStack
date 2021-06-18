package inheritance1;

public class Father extends Grandfather{ // child / sub / derived class

   // public void display(){
       // System.out.println(" id "+id+" name "+Name);
   // }

    public static void main(String[] args) {
        Father father = new Father();

        father.id= 02;
        father.Name = " Nikkhat";
        father.display();

    }

}
