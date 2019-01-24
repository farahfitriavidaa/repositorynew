public class Lingkaran {
   double p = 3.14;
   double luas;

    public void lili(double jari){
        luas = p * jari * jari;
        System.out.println("Luas lingkaran adalah " + luas );
    }

    public static void main(String[] far){
        Lingkaran nm = new Lingkaran();
        nm.lili(20);
    }
}
