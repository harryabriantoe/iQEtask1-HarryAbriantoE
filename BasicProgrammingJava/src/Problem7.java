public class Problem7 {
    private static int pangkat(int x, int n) {
        double c = Math.pow(x, n);
        return (int) c;
    }
    public static void main(String[] args) {
        System.out.println(pangkat(2, 3));
        System.out.println(pangkat(5,3));
        System.out.println(pangkat(10,2));
        System.out.println(pangkat(2,5));
        System.out.println(pangkat(7,3));
    }
}
