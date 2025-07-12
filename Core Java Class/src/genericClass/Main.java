package genericClass;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Container<Integer> container= new Container<>();

        container.setItem(2);
        System.out.println(container.getItem());

        Container<String> stringContainer= new Container<>();
        stringContainer.setItem("skfjsdkjfn");
        System.out.println(stringContainer.getItem());
        Integer[] arr = {1,2,3,4,5,6};
        Container.printArray(arr);

        Pair<String,Integer> pair = new Pair<>();
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());

        Demo1 demo1= new Demo1();
        System.out.println(demo1.compare("3",3));

    }
}
