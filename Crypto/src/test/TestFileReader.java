import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestFileReader {

    @Test
    public void testFileReader() throws IOException {
        //Given
        String original = new String(Files.readAllBytes(Paths.get("sonnet18.txt")));

        //When
        FileReader.readAndEncryptFile(new ROT13(), "sonnet18.txt", "sonnet18.enc");
        FileReader.readAndEncryptFile(new ROT13(), "sonnet18.enc", "sonnet18doubleencrypt.txt");
        String actual = new String(Files.readAllBytes(Paths.get("sonnet18doubleencrypt.txt")));

        //Then
        Assert.assertEquals(original, actual);

    }
}
