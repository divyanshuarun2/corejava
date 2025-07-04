package multiThreading;

public class Main {
    public static void main(String[] args) {
//        Mythread runnableObj = new Mythread();
//        Thread t1= new Thread(runnableObj);
//        t1.setName("custom thread t1");
//        t1.start();
        ExtendThread threadObj = new ExtendThread();
        threadObj.setName("extended thread");
        threadObj.start();


        System.out.println("Thread name: "+Thread.currentThread().getName());
    }
}
