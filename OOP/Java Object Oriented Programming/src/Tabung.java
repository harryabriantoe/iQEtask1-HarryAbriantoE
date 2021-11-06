public class Tabung {
    double Jarijari;
    double Phi;
    double Tinggi;
    double Volume;
    public Tabung(double phi, double jarijari,double tinggi) {
        Jarijari = jarijari;
        Phi = phi;
        Tinggi = tinggi;
    }
    public double VolumeTabung() {
        Volume = Phi * Jarijari * Jarijari * Tinggi;
        return Volume;
    }
}
