package week8;

import week7.day1.Singleton;

import java.io.*;

class Ex2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Singleton singleton = Singleton.getInstance();
//        Singleton.getInstance();

        String path = "/home/amakogon/serial";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
        oos.writeObject(singleton);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
        Singleton serializedInstance = (Singleton) ois.readObject();
        System.out.println(serializedInstance);
    }
}
