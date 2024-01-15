import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectClassStream {
    public static void main(String[] args) {
        try {
            FileOutputStream file = new FileOutputStream("write.txt");
            ObjectOutputStream output = new ObjectOutputStream(file);
            
            output.writeBoolean(false);
            output.writeUTF("Java is an OOP");
            output.writeFloat(23.67478f);
            output.flush();
            
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("write.txt"));
            System.out.println(input.readBoolean() + " " + input.readUTF() + " " + input.readFloat());

            // System.out.println("Read Value---> ");
            // byte[] buffer = new byte[30];

            // input.read(buffer, 0, 30);
            // System.out.println("Use of read ----> ");
            // for (int i = 0; i < 29; i++)
            // {
            //     System.out.println((char)buffer[i]);
            // }
        } catch (Exception e) {
            
        }
    }
}
