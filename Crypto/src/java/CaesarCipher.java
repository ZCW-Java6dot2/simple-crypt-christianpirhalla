public class CaesarCipher extends ROT13{
    public CaesarCipher(int shift){
        alpha1 = alphabetBuilder('a');
        alpha2 = rotate(alpha1, shift);
        System.out.println(alpha1);
        System.out.println(alpha2);
    }

    public CaesarCipher(){
        this(13);
    }


    public static String rotate(String s, int c) {
        return s.substring(c) + s.substring(0, c);
    }
}
