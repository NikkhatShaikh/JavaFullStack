package multithreading;

import package2.C;

public class ProducerConsumerDemo {
    int num;
    boolean flag = true;

    public synchronized void set(int num){
        if(flag){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }
        System.out.println("Set:"+num);
        this.num=num;
      flag = false;
      notify();
    }

    public synchronized void get(){
        if(!flag){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Get:"+num);
        flag= true;
        notify();
    }
}

 class Producer1 implements Runnable {
     ProducerConsumerDemo producerConsumerDemo;
     public Producer1(ProducerConsumerDemo producerConsumerDemo){
         this.producerConsumerDemo=producerConsumerDemo;
         Thread t1= new Thread(this);
         t1.start();

     }

     @Override
     public void run() {
         int i=0;
         while (true){
            producerConsumerDemo.set(i++);
             try{
              Thread.sleep(500);
             }catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }

     }
 }



 class Consumer1 implements Runnable{
    ProducerConsumerDemo producerConsumerDemo;
    public Consumer1(ProducerConsumerDemo producerConsumerDemo){
        this.producerConsumerDemo=producerConsumerDemo;
        Thread t2 = new Thread(this);
        t2.start();
    }

     @Override
     public void run() {
         while (true){
             producerConsumerDemo.get();
             try{
                 Thread.sleep(500);
             }catch (InterruptedException e){
                 e.printStackTrace();
             }

         }

     }
 }

 class MainDemo{
     public static void main(String[] args) {
         ProducerConsumerDemo producerConsumerDemo = new ProducerConsumerDemo();
         Producer1 producer1= new Producer1(producerConsumerDemo);
         Consumer1 consumer1=new Consumer1(producerConsumerDemo);

     }

 }