package yieldSleep;

class MyThread extends Thread{

    @Override
    public void run() {
try {
    for (int i = 0; i < 10; i++) {

//        Thread.sleep(1000);

        System.out.println("from run");
    }
}
catch (Exception E){
    System.out.println("INTERRUPTED");
}
    }
}

public class PauseExecutionThread {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread= new MyThread();

        myThread.start();
        System.out.println(myThread.getPriority());

        myThread.setPriority(10);
        System.out.println(myThread.getPriority());

        for (int i = 0; i < 10; i++) {
            System.out.println("from main()");
        }

    }



}
