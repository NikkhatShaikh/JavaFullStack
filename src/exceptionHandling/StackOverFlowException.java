package exceptionHandling;

public class StackOverFlowException {

     private void rec(int num){
         System.out.println(" num " + num);

         if(num==0){
             return;
         }else {
             rec(num);
         }
     }


    public static void main(String[] args) {
         StackOverFlowException obj = new StackOverFlowException();
         obj.rec(10);

    }
}
