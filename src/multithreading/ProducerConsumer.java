package multithreading;

//Inner Thread Communication
//ProducerConsumer Problem

public class ProducerConsumer {
int num;

boolean flag = false;

public synchronized void set(int num){
    if(flag){
        try {
            wait();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    System.out.println("set:"+num);
    this.num=num;
    flag = true;
    notify(); // communicate with other thread
}


public synchronized void get(){
    if(!flag){
        try {
            wait();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    System.out.println("get:"+num);
  flag = false;
  notify();
}

}

class Producer implements Runnable{

ProducerConsumer producerConsumer;

public Producer(ProducerConsumer producerConsumer){
    this.producerConsumer=producerConsumer;
    Thread t1= new Thread(this);
    t1.start();
}

    @Override
    public void run() {
    int i =0;
    while (true){
        producerConsumer.set(i++);
        try {
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
  }
 }

 class Consumer implements Runnable{
    ProducerConsumer producerConsumer;
    public Consumer(ProducerConsumer producerConsumer){
        this.producerConsumer=producerConsumer;
        Thread t2 = new Thread(this);
        t2.start();
    }

     @Override
     public void run() {
         while (true){
             producerConsumer.get();
             try{
                 Thread.sleep(500);
             }catch (InterruptedException e){
                 e.printStackTrace();
             }
         }
     }
 }

 class Main{
     public static void main(String[] args) {
         ProducerConsumer producerConsumer = new ProducerConsumer();
         Producer producer = new Producer(producerConsumer);
         Consumer consumer = new Consumer(producerConsumer);

     }

 }