package genericClass;
//
public class Container <T> {

    private T item;

    public void setItem(T item){
        this.item=item;
    }

    public T getItem(){
        return this.item;
    }
    public static <T> void printArray(T[]array){
        for(T item: array){
            System.out.println(item);
        }
    }


}
