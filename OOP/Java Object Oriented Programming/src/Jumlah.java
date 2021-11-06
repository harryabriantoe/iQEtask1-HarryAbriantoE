public class Jumlah {
    int Penjumlahan;
    int Bilangan1;
    int Bilangan2;

    public Jumlah(int bilangan1, int bilangan2) {
        Bilangan1 = bilangan1;
        Bilangan2 = bilangan2;
    }

    public Jumlah() {
    }

    public int Jumlah() {
        Penjumlahan = Bilangan1 + Bilangan2;
        return Penjumlahan;
    }
}
