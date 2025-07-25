package interfaceDemo;

public class Main implements DefaultInterface {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.getMinSalary());
    }

    @Override
    public int getMinSalary() {
        return 10050;
    }

    @Override
    public void setName() {

    }
}
