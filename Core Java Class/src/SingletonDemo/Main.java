package SingletonDemo;

public class Main {
    public static void main(String[] args) {
   SingletonClassEager obj = SingletonClassEager.getInstance();
        System.out.println(obj.hashCode());

        SingletonclassLazy obj1 = SingletonclassLazy.getInstance();
        SingletonclassLazy obj2 = SingletonclassLazy.getInstance();
        System.out.println(obj1==obj2);

        BillPughSolution ob1 = BillPughSolution.getInstance();
        BillPughSolution ob2 = BillPughSolution.getInstance();
        System.out.println(ob1.hashCode());
        System.out.println(ob2.hashCode());



    }
}
