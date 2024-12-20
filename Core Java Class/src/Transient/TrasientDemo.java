package Transient;

import java.io.*;

class Scooty implements Serializable{
    String name;
    // now adding the keyword, colour field is not serialized
    String colour;

    public Scooty(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }
}

public class TrasientDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scooty scooty = new Scooty("yamaha","black");

        // serialization
        ObjectOutputStream objectOutputStream
                = new ObjectOutputStream(new FileOutputStream("bike.txt"));

        objectOutputStream.writeObject(scooty);

        // de- serialization
        ObjectInputStream objectInputStream
                = new ObjectInputStream(new FileInputStream("bike.txt"));
        Scooty scooty1 = (Scooty) objectInputStream.readObject();
        System.out.println(scooty1.name+": "+ scooty1.colour);
    }
}
