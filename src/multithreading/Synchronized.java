package multithreading;

public class Synchronized {

    int num;

    public synchronized void increase(){
        num++;
    }

    public static void main(String[] args) throws InterruptedException {
        Synchronized obj = new Synchronized();
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i=1;i<=1000;i++){
                    obj.increase();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1;i<=100;i++){
                    obj.increase();
                }

            }
        });
    t1.start();
    t2.start();


    t1.join();
    t2.join();
        System.out.println(obj.num);



    }
}