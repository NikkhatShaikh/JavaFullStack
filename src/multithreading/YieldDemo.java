package multithreading;

//Yield -> Yield method is static method and native and it stop the current thread
//execution and give chance to other thread of higher priority or same priority


public class YieldDemo extends Thread{
    @Override
    public void run() {
        for(int i=0;i<=3;i++){
            Thread.yield();
            System.out.println("Thread Running"+i);
        }
        System.out.println("Thread Exit"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        YieldDemo yieldDemo = new YieldDemo();
        yieldDemo.start();

        for (int i=1;i<=2;i++){
            System.out.println("Main Thread LOOp"+i);

        }
    }
}


