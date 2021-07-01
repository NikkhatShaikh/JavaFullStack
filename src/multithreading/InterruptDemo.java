package multithreading;

public class InterruptDemo extends Thread{
    @Override
    public void run() {
        try{
            for (int i=1;i<=3;i++){
                System.out.println("in run:"+i);
                sleep(500);
            }
        }catch (InterruptedException e ){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        InterruptDemo obj = new InterruptDemo();
        obj.start();
        obj.interrupt();
        System.out.println(obj.isInterrupted());
    }
}
