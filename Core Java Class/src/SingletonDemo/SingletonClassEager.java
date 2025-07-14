package SingletonDemo;

public class SingletonClassEager {
    private static SingletonClassEager object = new SingletonClassEager();
    private SingletonClassEager(){}

    public static SingletonClassEager getInstance(){
        return object;
    }
}
