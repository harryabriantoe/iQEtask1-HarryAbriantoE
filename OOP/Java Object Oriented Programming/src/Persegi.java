public class Persegi {
        int Sisi;
        int Luas;
        int Keliling;

        public Persegi() {
        }

        public Persegi(int sisi){
            Sisi = sisi;
        }

        public int Luas_Persegi(){
            Luas = Sisi * Sisi;
            return Luas;
        }

        public int Keliling_Persegi(){
            Keliling = Sisi * 4;
            return Keliling;
        }
}
