import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Created by robertsg on 4/16/2015.
 */
public class ReadAFile {

    public static void main (String[] args) {
        try {
            File myFile = new File("C:\\Users\\robertsg\\IdeaProjects\\ReadAFile\\src\\MyText.txt");
            FileReader fileReader = new FileReader(myFile);

            BufferedReader reader = new BufferedReader(fileReader);

            String line = null;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            fileReader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
