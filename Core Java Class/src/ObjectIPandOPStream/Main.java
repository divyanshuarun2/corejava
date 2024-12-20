package ObjectIPandOPStream;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Car car = new Car("ferrari","red");

        //serialisation
        FileOutputStream fileOutputStream
                =new FileOutputStream("abc.txt");
        ObjectOutputStream objectOutputStream=
                new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(car);
        fileOutputStream.flush();
        fileOutputStream.close();

        //deserialization process
        FileInputStream fileInputStream= new FileInputStream("abc.txt");
        ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream);
        Car car1 = (Car) objectInputStream.readObject();
        System.out.println(car1.colour+":"+ car1.name);


    }
}