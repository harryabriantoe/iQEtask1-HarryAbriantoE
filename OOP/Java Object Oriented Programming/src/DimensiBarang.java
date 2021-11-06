public class DimensiBarang extends Balok {
    public DimensiBarang(int panjang, int lebar, int tinggi) {
        Panjang = panjang;
        Lebar = lebar;
        Tinggi = tinggi;
    }
    public double HitungHarga() {
        double Harga;
        double Berat = ((double)Volume)/50;
        Harga = Math.ceil(Berat) * 5000;
        return Harga;
    }
}
