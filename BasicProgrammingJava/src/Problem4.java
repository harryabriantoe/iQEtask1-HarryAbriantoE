public class Problem4 {
    public static void main(String[] args) {
        int bilangan = 20;
        int i;
        for (i = bilangan ; i >= 1;
             i--) {
            if (bilangan % i == 0) {
                System.out.println(i);
            }
        }
    }
}