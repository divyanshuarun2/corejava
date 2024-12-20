package thread;

class MyThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello from run");
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        MyThread runnableThread= new MyThread();

        Thread thread = new Thread(runnableThread);
        thread.start();


        for (int i = 0; i < 10; i++) {
            System.out.println("Hello from main");
        }
    }
}
