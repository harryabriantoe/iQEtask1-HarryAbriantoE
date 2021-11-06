public class PersegiPanjang {
        int Panjang;
        int Lebar;
        int Luas;
        int Keliling;

        public PersegiPanjang () {
        }

        public PersegiPanjang(int panjang, int lebar){
            Panjang = panjang;
            Lebar = lebar;
        }

        public int Luas_PersegiPanjang(){
            Luas = Panjang * Lebar;
            return Luas;
        }

        public int Keliling_PersegiPanjang(){
            Keliling = (Panjang + Lebar) * 2;
            return Keliling;
        }
}
