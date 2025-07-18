package SingletonDemo;

public class DoubleCheckedLocking {
    private static volatile DoubleCheckedLocking obj;

    private DoubleCheckedLocking(){}

    public static DoubleCheckedLocking getInstance(){
        if(obj==null){

            synchronized (DoubleCheckedLocking.class){
                if(obj==null){
                    obj= new DoubleCheckedLocking();
                }
            }

        }
        return obj;
    }


}
