import org.junit.Test;

import static org.junit.Assert.*;

public class CaesarCipherTest {


    @Test
    public void rotateStringTest0() {
        // Given
        String s1 = "ABCDEF";
        String s2 = "ABCDEF";

        // When
        CaesarCipher cipher = new CaesarCipher();
        String actual = cipher.rotate(s1, 0);

        // Then
        assertTrue(actual.equals(s2));
    }

    @Test
    public void rotateStringTest1() {
        // Given
        String s1 = "ABCDEF";
        String s2 = "DEFABC";

        // When
        CaesarCipher cipher = new CaesarCipher();
        String actual = cipher.rotate(s1, 3);
        System.out.println(actual);

        // Then
        assertTrue(actual.equals(s2));
    }

    @Test
    public void rotateStringTest2() {
        // Given
        String s1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String s2 = "NOPQRSTUVWXYZABCDEFGHIJKLM";

        // When
        CaesarCipher cipher = new CaesarCipher();
        String actual = cipher.rotate(s1, 13);
        System.out.println(s1);
        System.out.println(actual);
        // Then
        assertTrue(actual.equals(s2));
    }

    @Test
    public void cryptTest1() {
        // Given
        CaesarCipher cipher = new CaesarCipher(13);

        String Q1 = "Why did the chicken cross the road?";
        String A1 = "Jul qvq gur puvpxra pebff gur ebnq?";

        String Q2 = "Gb trg gb gur bgure fvqr!";
        String A2 = "To get to the other side!";

        // When
        String actual = cipher.encrypt(Q1);
        System.out.println(Q1);
        System.out.println(A1);
        // Then
        assertTrue(actual.equals(A1));

        // When
        String actual2 = cipher.decrypt(Q2);
        System.out.println(Q2);
        System.out.println(A2);
        // Then
        assertTrue(actual2.equals(A2));
    }
    @Test
    public void cryptTest2() {
        // Given
        CaesarCipher cipher = new CaesarCipher(13);

        String Q1 = "Why did the chicken cross the road?";
        System.out.println(Q1);

        // When
        String actual = cipher.crypt(cipher.crypt(Q1));
        System.out.println(actual);
        // Then
        assertTrue(actual.equals(Q1));
    }

    @Test
    public void cryptTest3() {
        // Given
        CaesarCipher cipher = new CaesarCipher(23);

        String phraseToTranslate = "The quick brown fox jumps over the lazy dog";
        String expected = "Qhz trxck brown foi armps opzr qhz ljey dog";
        System.out.println(phraseToTranslate);


        // When
        String actual = cipher.crypt(phraseToTranslate);
        System.out.println(actual);
        // Then
        assertTrue(actual.equals(expected));
    }

}