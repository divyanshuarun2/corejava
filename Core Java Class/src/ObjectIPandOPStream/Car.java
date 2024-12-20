package ObjectIPandOPStream;

import java.io.Serializable;

public class Car implements Serializable {
    String name;
    String colour;

    public Car(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }
}
