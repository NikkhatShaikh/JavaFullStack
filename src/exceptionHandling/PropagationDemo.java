package exceptionHandling;

import java.sql.SQLException;

public class PropagationDemo {
    public void a() throws SQLException,ArithmeticException{

        int i = 10;
        int j = i/0;

        throw new SQLException(" SQL Exception"); //throw -used in method signature
    }

    void b() throws SQLException{  // used with method - not in method signature
        a();
    }

    void c () throws SQLException{
        try {
            b();
        }catch (ArithmeticException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws SQLException {
        PropagationDemo propagationDemo = new PropagationDemo();

        propagationDemo.c();
    }
}
