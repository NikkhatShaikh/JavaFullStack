package multithreading;

public class ThreadDemo {

    public static void main(String[] args) {
        Hi obj1= new Hi();
        Thread t1=new Thread(obj1);  // create object of thread- (thread is a class - defined in java by programmer)
       // t1.run();  - its run like a normal program

        t1.start(); // its run separatly in thread - thread is in first state i.e  - new ();

        Hello t2=new Hello();  // by extended class we don't need to create object of thread and we can call it directly.
        t2.start();

    }

}

class Hi implements Runnable {  // if we use implement syntax is = implements Runnable - and we have to create obj for that
    @Override
    public void run() {

        for (int i = 0; i <= 5; i++) {
            System.out.println("hi");

            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class Hello extends Thread {
    @Override
    public void run() {
        for(int j =0;j<=5;j++){
            System.out.println(" Hello ");
            try{
                Thread.sleep(500);
            }catch (Exception e){
                System.out.println();
            }
        }
    }
}