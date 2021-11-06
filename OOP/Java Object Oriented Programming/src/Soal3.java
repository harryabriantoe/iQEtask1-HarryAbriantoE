public class Soal3 {
    public static void main(String[] args) {
        Jumlah objJumlah = new Jumlah(3,4);
        Kurang objKurang = new Kurang(15,4);
        Kali objKali = new Kali(10,10);
        Bagi objBagi = new Bagi(12,3);

        System.out.printf("Penjumlahan: %d\n",objJumlah.Jumlah());
        System.out.printf("Pengurangan: %d\n",objKurang.Kurang());
        System.out.printf("Perkalian: %d\n",objKali.Kali());
        System.out.printf("Pembagian: %d\n",objBagi.Bagi());
    }
}
