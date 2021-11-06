public class Soal5 {
    public static void main(String[] args) {
        Animal objAnimal = new Animal();
        Herbivor objHerbivor = new Herbivor();
        Karnivor objKarnivor = new Karnivor();
        Omnivor objOmnivor = new Omnivor();

        System.out.println("Animal");
        System.out.println("Nama Binatang: "+ objAnimal.nama);

        System.out.println("Herbivora");
        System.out.println("Nama Binatang: "+ objHerbivor.nama);
        System.out.println("Jenis Makanan: "+ objHerbivor.makanan);
        System.out.println("Jenis Gigi: "+ objHerbivor.gigi);

        System.out.println("Karnivora");
        System.out.println("Nama Binatang; "+ objKarnivor.nama);
        System.out.println("Jenis Makanan: "+ objKarnivor.makanan);
        System.out.println("Jenis Gigi: "+ objKarnivor.gigi);
    }
}
