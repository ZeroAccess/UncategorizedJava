import java.io.FileWriter;

/**
 * Created by robertsg on 4/14/2015.
 */
public class WriteAFile {

    public static void main (String[] args) {
        try{
            FileWriter writer = new FileWriter("Foo.txt");
            writer.write("hello foo!");
            writer.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
