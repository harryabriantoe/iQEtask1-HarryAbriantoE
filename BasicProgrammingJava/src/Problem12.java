public class Problem12 {
    private static float Mean(float[] numbers) {
        int length = numbers.length;
        float sum = 0;
        for (int i = 0; i < length; i++) {
            sum = sum + numbers[i];
        }
        return sum / length;
    }
    public static void main(String[] args) {
        float[] value = {1, 2, 3, 4};
        System.out.println(Mean(value));
    }
}
