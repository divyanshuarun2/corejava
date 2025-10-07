package functionalInterfaceDemo07102025;

public interface Bird {
    void canfly();
}
/*treat this as functional interface or general interface.
to implement this interface we have 3 diff ways
1. use implements keyword
2. ananomus class
e.g., psvm(){ .....
           Bird obj = new Bird(){
           @Override
           function defination 1
           @Override
           function defination 2
           @Override
           function defination 3
           };
      }

      3. functional Interface
 */
