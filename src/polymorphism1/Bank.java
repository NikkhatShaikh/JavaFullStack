package polymorphism1;

public class Bank {

    public void interest(){
        System.out.println("default intrest is 8%");
    }

    static class SBI extends Bank{
        @Override
       public void interest() {
            System.out.println(" interest is 10%");
        }

        public static void main(String[] args) {
            SBI obj = new SBI();
            obj.interest();

        }
    }

    class HDFC extends Bank{
        @Override
        public void interest() {
            System.out.println(" interest is 12%");
        }

    }
}
