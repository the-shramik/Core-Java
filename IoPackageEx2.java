import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IoPackageEx2{
    public static void main(String[] args){

        try(FileReader fr=new FileReader("xyz.txt");FileWriter fw=new FileWriter("guru.txt")){
            int c;

            while((c=fr.read())!=-1){
                System.out.println((char)c);
                fw.write(c);
            }
           
        }
        catch(IOException ie){
            ie.printStackTrace();
        }
    }
}