package functionalInterfaceDemo07102025;

public class BirdImplAnanomous {

       static Bird obj1= new Bird() {
            @Override
            public void canfly() {
                System.out.println("ananomous obj can fly too");
            }
        };
      static   Bird obj2= ()->{
            System.out.println("lambda bird can fly");
        };

    public static void main(String[] args) {
        obj2.canfly();
        obj1.canfly();
    }

}
