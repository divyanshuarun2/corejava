package multiThreading;

public class ExtendThread extends Thread{
    public void run(){
        System.out.println("Thread name: "+Thread.currentThread().getName());
    }
}
