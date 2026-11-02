package array;

public class DaftarNilaiMahasiswa {
    public static void main(String[] args) {
        int[] nilai = {80,75,90,65,85};

        for(int i = 0; i < nilai.length; i++) {
            System.out.print(nilai[i]);
            if (i < nilai.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("\nnilai indeks ke-2: " + nilai[2]);
    }
}
//indeks array dimulai dari 0,sedangkan urutan mahasiswa dimulai dari 1


