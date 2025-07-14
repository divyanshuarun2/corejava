package SingletonDemo;

public class ThreadSafeSingletonClass {
    private static ThreadSafeSingletonClass obj;

    private ThreadSafeSingletonClass(){}

    public static synchronized ThreadSafeSingletonClass getInstance(){
        if(obj==null){
            obj= new ThreadSafeSingletonClass();
        }
        return obj;
    }
}
