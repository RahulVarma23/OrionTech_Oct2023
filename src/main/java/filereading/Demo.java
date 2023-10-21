package filereading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo {

    public static void main(String[] args) {
        String filePath = "./src/main/resources/testFiles/Testing.txt";
        BufferedReader br=null;
        FileReader fileReader=null;

        int lineCount=0;

        try{
            File file = new File(filePath);
            fileReader = new FileReader(file);
            br = new BufferedReader(fileReader);
            String line;

            while( (line=br.readLine()) !=null) {
                System.out.println(line);
                lineCount++;
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }finally {
            try {
                br.close();
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(lineCount);
    }
}
