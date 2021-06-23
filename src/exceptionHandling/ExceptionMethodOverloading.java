package exceptionHandling;

public class ExceptionMethodOverloading {

    public void show() throws Exception {
        System.out.println(" in show");
    }

    public static void main(String[] args) throws Exception {

    }
}

    class ChildMethodOverloading  extends ExceptionMethodOverloading {

        @Override
        public void show() throws Exception {
            try{
                int a =10;
                int b=0;
                int c =a/b;
                System.out.println(c);
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println( " In child Class");
        }

        public static void main(String[] args) throws Exception{
            ExceptionMethodOverloading obj = new ChildMethodOverloading();
            obj.show();
        }
    }



//1. If parent class declare no exception then in child class we declare only unchecked exception
//2. If parent class declare exception then in child class we declare same exception
//2. If parent class declare exception then in child class we declare child exception