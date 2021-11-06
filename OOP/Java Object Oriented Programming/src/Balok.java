public class Balok extends PersegiPanjang {
    int Tinggi;
    int Volume;
    public Balok(int panjang, int lebar, int tinggi) {
        Panjang = panjang;
        Lebar = lebar;
        Tinggi = tinggi;
    }
    public int VolumeBalok() {
        Volume = Panjang * Lebar * Tinggi;
        return Volume;
    }
    public Balok () {
    }
}
