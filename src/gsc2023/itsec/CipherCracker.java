package gsc2023.itsec;

public class CipherCracker {

    public static void main(String[] args) {
        String ciphertext = "owgysmwcykiwyomgee";

        for (int caesarShift = 1; caesarShift < 26; caesarShift++) {
            String potentialKey = caesarDecrypt(ciphertext, caesarShift);
            String decryptedText = vigenereDecrypt(ciphertext, potentialKey);
            
            System.out.println("potentialKey " + potentialKey);
            // System.out.println("decryptedText " + decryptedText);
            //if (decryptedText.contains("BROKEN") && decryptedText.contains("VESSEL")) {
                // System.out.println("plaintext with Caesar shift " + caesarShift + ": " + decryptedText);
            //}
        }
    }

    public static String caesarDecrypt(String ciphertext, int shift) {
        StringBuilder result = new StringBuilder();
        for (char character : ciphertext.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isUpperCase(character) ? 'A' : 'a';
                result.append((char) (base + (character - base - shift + 26) % 26));
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }

    public static String vigenereDecrypt(String ciphertext, String key) {
        StringBuilder result = new StringBuilder();
        for (int i = 0, j = 0; i < ciphertext.length(); i++) {
            char c = ciphertext.charAt(i);
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                result.append((char) (base + (c - key.charAt(j) + 26) % 26));
                j = (j + 1) % key.length();
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}

