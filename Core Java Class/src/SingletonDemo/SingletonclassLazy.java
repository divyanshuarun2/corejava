package SingletonDemo;

public class SingletonclassLazy {
    private static SingletonclassLazy obj;

    private SingletonclassLazy(){}

    public static SingletonclassLazy getInstance(){
        if(obj==null){
            //if 2 threads come together, then it might create 2 class as same time
            obj= new SingletonclassLazy();
        }
        return obj;
    }
}
