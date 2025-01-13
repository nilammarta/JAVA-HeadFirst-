package Exercise5;

public class CastingPrimitive {
    public static void main(String[] args) {
        // casting primitive
        long x = 24;
        int y = (int) x;

        System.out.println(y);


        // Error casting primitive
//        long z = 34;
//        int w = z;

        // Jika melakukan casting primitive dari tipe yang lebih besar ke type yang ukurannya lebih kecil
        long q = 40002;
        short u = (short) q;

        System.out.println(u); // akan menghasilkan niali -25534. Sehingga nilai yang dihasilkan tidak sesuai.
    }
}
