public class Kubus extends Persegi {
    int Volume;
    public Kubus(int sisi) {
        Sisi = sisi;
    }
    public int VolumeKubus() {
        Volume = Sisi * Sisi * Sisi;
        return Volume;
    }
}
