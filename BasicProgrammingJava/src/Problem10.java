public class Problem10 {
    private static void cetaktabelperkalian(int n) {
        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                System.out.print(i * j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        cetaktabelperkalian(3);
    }
}
