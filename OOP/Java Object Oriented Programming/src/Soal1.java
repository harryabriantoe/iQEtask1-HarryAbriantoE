public class Soal1 {
    public static void main(String[] args) {
        Persegi objPersegi = new Persegi(4);
        Segitiga objSegitiga = new Segitiga(3,4);
        PersegiPanjang objPersegiPanjang = new PersegiPanjang(7,8);

        System.out.println("Luas");
        System.out.printf("Persegi: %d\n", objPersegi.Luas_Persegi());
        System.out.printf("Segitiga: %f\n", objSegitiga.Luas_Segitiga());
        System.out.printf("Persegi Panjang: %d\n",objPersegiPanjang.Luas_PersegiPanjang());

        System.out.println();
        System.out.println("Keliling");
        System.out.printf("Persegi: %d\n", objPersegi.Keliling_Persegi());
        System.out.printf("Segitiga: %f\n", objSegitiga.Keliling_Segitiga());
        System.out.printf("Persegi Panjang: %d\n",objPersegiPanjang.Keliling_PersegiPanjang());
    }
}