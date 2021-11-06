public class Problem5 {
    private static boolean primeNumber(int number) {
        int checker = 1;
        int i;
        for (i = 2; i<=number; i++)
        {
            if (number % i == 0)
            {
                checker++;
            }
        }
        if (checker == 2)
        {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args){
        System.out.println(primeNumber(11));
        System.out.println(primeNumber(13));
        System.out.println(primeNumber(17));
        System.out.println(primeNumber(20));
        System.out.println(primeNumber(35));
    }
}
