package interfaceDemo;

public interface DefaultInterface {

    default int getMinSalary(){
        return 1000;
    }
    public void setName();
}
