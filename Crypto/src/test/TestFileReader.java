import org.junit.Test;

public class TestFileReader {

    @Test
    public void testFileReader(){
        FileReader.readAndEncryptFile(new ROT13());
    }
}
