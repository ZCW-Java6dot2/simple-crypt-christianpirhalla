import java.io.*;

public class FileReader {

    public static void readAndEncryptFile(ROT13 cipher){
        {
            BufferedReader reader;
            File fout = new File("sonnet18.enc");
            BufferedWriter writer;

            try {
                FileOutputStream fos = new FileOutputStream(fout);
                reader = new BufferedReader(new java.io.FileReader("sonnet18.txt"));
                writer = new BufferedWriter(new OutputStreamWriter(fos));

                String line = reader.readLine();
                while (line != null){
                    writer.write(cipher.crypt(line));
                    writer.newLine();
                    line = reader.readLine();
                }
                reader.close();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
