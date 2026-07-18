package lambda;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        // anannomous obj
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("inside Runnable 1");
            }
        };
        new Thread(runnable).start();

        //Java * lambda 8 syntax ()->{}
        Runnable runnableLambda=()->{
            System.out.println("Inside Runnable 2");};
        new Thread(runnableLambda).start();

        //again using lambda and storing in a refrence
        Runnable runnableLambda1=()-> System.out.println("Inside Runnable 3");
        new Thread(runnableLambda1).start();

        //using lambda as a method parameter directly
        new Thread(()-> System.out.println("Inside Runnable 4")).start();
    }
    }


