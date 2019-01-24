public class Persegi {
    private int sisi = 9;
    private int luas;

    public void coba(){
        luas = sisi * sisi;
        System.out.println("Luas persegi " + luas);
    }

    public static void main(String[] far){
        Persegi pg = new Persegi();
        pg.coba();
    }
}
