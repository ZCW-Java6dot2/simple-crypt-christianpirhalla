import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MostUsedLeastUsedSwapCipherTest {
    
    @Test
    public void cryptTest1() {
        // Given
        MostUsedLeastUsedSwapCipher cipher = new MostUsedLeastUsedSwapCipher();

        String phraseToTranslate = "The quick brown fox jumps over the lazy dog";
        String expected = "Qhz trxck brown foi armps opzr qhz ljey dog";
        System.out.println(phraseToTranslate);


        // When
        String actual = cipher.crypt(phraseToTranslate);
        System.out.println(actual);
        // Then
        assertTrue(actual.equals(expected));
    }
    @Test
    public void cryptTest2() {
        // Given
        MostUsedLeastUsedSwapCipher cipher = new MostUsedLeastUsedSwapCipher();

        String Q1 = "Why did the chicken cross the road?";
        System.out.println(Q1);

        // When
        String actual = cipher.crypt(cipher.crypt(Q1));
        // Then
        assertTrue(actual.equals(Q1));
    }

}
