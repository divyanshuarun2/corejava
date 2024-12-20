package lambda;

interface MyLambda{
    void sayHello();
    void sayHi();
}
//class A implements MyLambda{
//
//    @Override
//    public void sayHello() {
//        System.out.println("hi");
//    }
//}

public class LambdaDemo {
    public static void main(String[] args) {
        MyLambda myLambda = new MyLambda() {
            @Override
            public void sayHello() {
                System.out.println("hello from direct object");
            }

            @Override
            public void sayHi() {
                System.out.println("hii only from direct object");
            }
        };



    }
}
