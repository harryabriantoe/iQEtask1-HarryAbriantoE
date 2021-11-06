public class Kurang extends Jumlah {
    int Pengurangan;

    public Kurang(int bilangan1, int bilangan2) {
        Bilangan1 = bilangan1;
        Bilangan2 = bilangan2;
    }
    public int Kurang() {
        Pengurangan = Bilangan1 - Bilangan2;
        return Pengurangan;
    }
}
