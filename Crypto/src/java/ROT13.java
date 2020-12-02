import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {
    String alpha1;
    String alpha2;

    ROT13(Character cs, Character cf) {
        alpha1 = alphabetBuilder(cs);
        alpha2 = alphabetBuilder(cf);
    }

    ROT13() {
        alpha1 = alphabetBuilder('a');
        alpha2 = alphabetBuilder('n');
    }

    public String alphabetBuilder(Character ch){
        StringBuilder alphaBuilder = new StringBuilder();
        for (char start = Character.toLowerCase(ch); alphaBuilder.length() < 26; start++ ){
            if (start > 'z') { start = 'a';}
            alphaBuilder.append(start);
        }
        return alphaBuilder.toString();
    }

    public String crypt(String text) throws UnsupportedOperationException {
        StringBuilder encryptedStringBuilder = new StringBuilder();
        for (int i = 0; i < text.length(); i++){
            char newChar;
            if (!Character.isLetter(text.charAt(i))) {newChar = text.charAt(i);}
            else {
                int equivalentIndex = alpha1.indexOf(Character.toLowerCase(text.charAt(i)));
                newChar = alpha2.charAt(equivalentIndex);
            }

            if (Character.isUpperCase(text.charAt(i))){
                encryptedStringBuilder.append(Character.toUpperCase(newChar));
            } else
            {encryptedStringBuilder.append(newChar);}

        }
        return encryptedStringBuilder.toString();
    }

    public String encrypt(String text) {
        return crypt(text);
    }

    public String decrypt(String text) {
        return crypt(text);
    }

    public static String rotate(String s, Character c) {
        return s.substring(Character.toLowerCase(c) - 'a') + s.substring(0, Character.toLowerCase(c) - 'a');
        }


}
