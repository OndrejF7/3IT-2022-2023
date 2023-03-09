package sk.sosholic.druhypolrok.citaniezapisu;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class CitanieTextu {
    public static void main(String[] args) {
    try {
        FileReader fileReader = new FileReader("text.txt");
        int a = fileReader.read();
        System.out.println("cislo je: " + a);
        char b = (char) a;
        System.out.println("char je: " + b);
        int nejakyInt = 0;
        while (nejakyInt != -1) {
            nejakyInt = fileReader.read();
            System.out.print((char) nejakyInt);
        }
        fileReader.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
}
