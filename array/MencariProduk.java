package array;

public class MencariProduk {
    public static void main(String[] args) {
        int[] produk = {101, 105, 110, 115, 120, 125};
        int cari = 110;
        int indeks = -1;
        int diperiksa = 0;

        for (int i = 0; i < produk.length; i++) {
            diperiksa++;

            if (produk [i] == cari) {
                indeks = i;
                break;
            }
        }
        if (indeks != -1) {
            System.out.println("produk ditemukan");
            System.out.println("indeks: " + indeks);
        } else {
            System.out.println("produk tidak tersedia");
        }

        System.out.println("Elemen diperiksa: " + diperiksa);
    }

}
