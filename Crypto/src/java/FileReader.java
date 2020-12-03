import java.io.*;

public class FileReader {

    public static void readAndEncryptFile(ROT13 cipher, String originalFilePath, String newFilePath){
        {
            BufferedReader reader;
            File fout = new File(newFilePath);
            BufferedWriter writer;

            try {
                FileOutputStream fos = new FileOutputStream(fout);
                reader = new BufferedReader(new java.io.FileReader(originalFilePath));
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
