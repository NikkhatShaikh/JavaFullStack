package multithreading;

public class ThreadMethod {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        Thread t1 = new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        });
        t1.setName("Thread1");
        t1.start();

        Thread t2 = new Thread (()->{
            System.out.println(Thread.currentThread().getName());
        });
        t2.setName("Thread2");
        t2.start();
        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());
    }
}
