public class Problem9 {
    private static void drawXYZ(int n) {
        double jumlah = Math.pow(n, 2);
        for(int i = 1; i <= jumlah; i++){
            if(i % 3 == 0){
                System.out.print("X ");
            }
            else if(i % 2 == 0){
                System.out.print("Z ");
            }
            else if(i % 2 != 0){
                System.out.print("Y ");
            }
            if(i % n == 0){
               System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        drawXYZ(1);
        drawXYZ(3);
        drawXYZ(5);
    }
}
