public class Problem6 {
    private static boolean palindrome(String value) {
        int lastIdx = value.length();
        int reverseIdx = value.length() - 1;
        for(int i = 0; i < lastIdx; i++){
            if(value.charAt(i) != value.charAt(reverseIdx)){
                return false;
            }
            reverseIdx--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(palindrome("civic"));
        System.out.println(palindrome("katak"));
        System.out.println(palindrome("kasur rusak"));
        System.out.println(palindrome("kupu-kupu"));
        System.out.println(palindrome("lion"));
        System.out.println(palindrome("ketok"));
    }
}
