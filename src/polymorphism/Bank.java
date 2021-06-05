package polymorphism;

public class Bank {
    public void intrest(){
        System.out.println("Default intrest is 8%");
    }
}
class SBI extends Bank{
{
   // public void intrest(){
   //     System.out.println(" intrest is 10%");
}

    public static void main(String[] args) {
        SBI obj =new SBI();
        obj.intrest();
    }
}
