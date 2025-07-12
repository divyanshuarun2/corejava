package genericClass;

import July3_2025.InterfaceDemo;

import java.util.List;

public class Demo1 {
    public <T> boolean compare(T a, Integer b){
        if(a.equals(b)){
            return true;
        }
        return false;
    }

    public void printList(List<?> list){
        for(Object t:list){
            System.out.println(t);

        }
    }
}
