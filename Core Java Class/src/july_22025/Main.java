package july_22025;

import java.lang.ref.WeakReference;
import java.lang.*;

public class Main {
    public static void main(String[] args) {


    WeakReference<Child> c2 = new WeakReference<Child>(new Child());
    System.gc();
        System.out.println(c2);
    }
}
