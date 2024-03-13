import java.io.*;
import java.util.Scanner;

public class User implements Serializable {
    private int ID;
    private String name;
    private int age;

    public User(int ID, String name, int age) {
        this.ID = ID;
        this.name = name;
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {

        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("user.dat"));
            User list = new User(23, "Hoa", 19);
            os.writeObject(list);
            os.close();

            ObjectInputStream in = new ObjectInputStream(new FileInputStream("user.dat"));
            User a = (User) in.readObject();
            System.out.println(a);

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
