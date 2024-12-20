package CustomeSerialisation;

import java.io.*;

class Scooty implements Serializable{
    String name;
    transient String colour;

    public Scooty(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }
//    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
//        objectOutputStream.defaultWriteObject();
//        String encodedcolour = "aba"+colour+"aba";
//        objectOutputStream.writeObject(encodedcolour);
//    }
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        String encodecolour = (String) objectInputStream.readObject();
        colour=encodecolour;

    }
}

public class CustomeSerialisationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scooty scooty= new Scooty("Activa-125","black");

        // serialization
        ObjectOutputStream objectOutputStream
                = new ObjectOutputStream(new FileOutputStream("scooty.txt"));

        objectOutputStream.writeObject(scooty);

        // de- serialization
        ObjectInputStream objectInputStream
                = new ObjectInputStream(new FileInputStream("scooty.txt"));
        Scooty scooty1 = (Scooty) objectInputStream.readObject();
        System.out.println(scooty1.name+": "+scooty1.colour);
    }

}
