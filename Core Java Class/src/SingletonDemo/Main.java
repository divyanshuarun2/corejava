package SingletonDemo;

public class Main {
    public static void main(String[] args) {
   SingletonClassEager obj = SingletonClassEager.getInstance();
        System.out.println(obj.hashCode());

        SingletonclassLazy obj1 = SingletonclassLazy.getInstance();
        SingletonclassLazy obj2 = SingletonclassLazy.getInstance();
        System.out.println(obj1==obj2);



    }
}
