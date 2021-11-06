public class Problem11 {
    private static String UbahHuruf(String s) {
        char[] abjNomal = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] abjEncript = {'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P'};

        String encript = "";

        for(int i = 0; i < s.length(); i++){
            if (s.charAt(i) != ' '){
                int normalIdx = new String(abjEncript).indexOf(s.charAt(i));
                encript = encript + abjNomal[normalIdx];
            }
            else {
                encript = encript + s.charAt(i);
            }
        }
        return encript;
    }
    public static void main(String[] args) {
        System.out.println(UbahHuruf("SEPULSA OKE"));
        System.out.println(UbahHuruf("ALTERRA ACADEMY"));
        System.out.println(UbahHuruf("INDONESIA"));
        System.out.println(UbahHuruf("GOLANG"));
        System.out.println(UbahHuruf("PROGRAMMER"));
    }
}
