public class Segitiga {
        int Alas;
        int Tinggi;
        float Luas;
        double Keliling;

        public Segitiga(int alas, int tinggi){
            Alas = alas;
            Tinggi = tinggi;
        }

        public float Luas_Segitiga(){
            Luas = (Alas * Tinggi) / 2;
            return Luas;
        }

        public double Keliling_Segitiga(){
            Keliling = Alas + Tinggi + (Math.sqrt(Alas * Alas + Tinggi * Tinggi));
            return Keliling;
        }
}