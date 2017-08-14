package io.t10;

import java.io.*;

public class Main {

    private static final String PATH = "file.txt";

    public static void main(String[] args) throws ClassNotFoundException {
        serialize();
//        deserialize();
    }

    private static void serialize() {
        SerializableClass serializableClass =
                new SerializableClass(SerializableClass.class.getName(), 0);
        try (ObjectOutputStream stream = new ObjectOutputStream(
                new ObjectOutputStream(new FileOutputStream(PATH))
        )) {
            stream.writeObject(serializableClass);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void deserialize() throws ClassNotFoundException {
        try (ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream(PATH))){
            SerializableClass serializableClass=(SerializableClass) inputStream.readObject();
            System.out.printf("Title: %s %n Size: %d ", serializableClass.title, serializableClass.size);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class SerializableClass implements Serializable {
        private String title;
        private int size;

        public SerializableClass(String title, int size) {
            this.title = title;
            this.size = size;
        }
    }
}
