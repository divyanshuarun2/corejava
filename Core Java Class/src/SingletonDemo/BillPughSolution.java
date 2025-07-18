package SingletonDemo;

public class BillPughSolution {
    private BillPughSolution(){};


    // making private so that same packed class dont access this
    private static class InnerClass{
        static final BillPughSolution OBJ= new BillPughSolution();
    }


    public static BillPughSolution getInstance(){
        return InnerClass.OBJ;
    }
}
