package July3_2025;

public class OuterClass {
    private static int x=10;
    static class InnerClass{
        public void print(int y){
            y=y+x;
            System.out.println(y+": this is the updated value");
        }

    }
}
