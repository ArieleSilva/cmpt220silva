/* Ariele Silva
 * Cmpt 220
 * Prof. Rivas
 * Lab 2
 */
public class Plate {
    static String[] INVALID = { "FOR", "AXE", "JAM", "JAB", "ZIP", "ARE", "YOU","JUG", "JAW", "JOY" };
    static String letters(int amount) {
        String letters = "";
        int p = 'Z' - 'A' + 1;
        for (int i = 0; i < amount; i++) {
            char c = (char) ('A' + Math.random() * p);
            letters += c;
        }
        return letters;
    }
 
    static String digits(int amount) {
        String digits = "";
        int p = '9' - '0' + 1;
        for (int i = 0; i < amount; i++) {
            char c = (char) ('0' + Math.random() * p);
            digits += c;
        }
        return digits;
    }
 
    static String LicensePlate() {
        String licensePlate;
        String letters;
        do {
            letters = letters(3);
        } 
        while (illegalWord(letters));
        String digits = digits(4);
        licensePlate = letters + "-" + digits;
        return licensePlate;
    }
    private static boolean illegalWord(String letters) {
        for (int i = 0; i < INVALID.length; i++) {
            if (letters.equals(INVALID[i])) {
                return true;
            }
        }
        return false;
    }
 
    public static void main(String args[]) {
        System.out.println(LicensePlate());
    }
}
//silvs code