public class Soal2 {
    public static void main(String[] args) {
        Kubus objKubus = new Kubus(4);
        Tabung objTabung = new Tabung(3.14,7,10);
        Balok objBalok = new Balok(7,8, 10);

        System.out.println("Volume");
        System.out.printf("Kubus: %d\n", objKubus.VolumeKubus());
        System.out.printf("Tabung: %f\n", objTabung.VolumeTabung());
        System.out.printf("Balok: %d\n",objBalok.VolumeBalok());
    }
}
