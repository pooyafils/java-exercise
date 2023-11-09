package serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CustomSerializableObject implements Serializable {
    private int data;
    private String name;

    public CustomSerializableObject(int data, String name) {
        this.data = data;
        this.name = name;
    }


    private void writeObject(ObjectOutputStream oos) throws IOException {
        String encryptedName =name;
        oos.writeInt(data);
        oos.writeObject(encryptedName);
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        data = ois.readInt();
        String encryptedName = (String) ois.readObject();
        name = encryptedName;
    }


    @Override
    public String toString() {
        return "CustomSerializableObject{" +
                "data=" + data +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        CustomSerializableObject originalObject = new CustomSerializableObject(429, "Name");

        try (ObjectOutputStream out = new ObjectOutputStream(System.out)) {
            out.writeObject(originalObject);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}