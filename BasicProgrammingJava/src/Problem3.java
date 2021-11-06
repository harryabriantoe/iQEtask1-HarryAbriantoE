public class Problem3 {
    public static void main(String[] args) {
        int bilangan = 20;
        int i;
        for (i = 1; i <= bilangan;
             i++) {
            if (bilangan % i == 0) {
                System.out.println(i);
            }
        }
    }
}