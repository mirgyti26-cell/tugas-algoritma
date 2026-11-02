package array;

public class RangkingMahasiswa {
    public static void main(String[] args){
        int[] nilai = {78, 90, 65, 90, 85, 72, 95, 85};
        int n = nilai.length;

        // Mengerutkan nilai dari tertinggi ke terendah
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nilai[i] < nilai[j]) {
                    int temp = nilai[i];
                    nilai[i] = nilai[j];
                    nilai[j] = temp;
                }
            }
        }

        System.out.println("nilai dari tertinggi ke terendah:");
        for (int i = 0; i < n; i++) {
            System.out.print(nilai[i] + " ");
        }

        System.out.println("\n\nTiga nilai tertinggi yang berbeda: ");
        int jumlah = 0;
        int sebelumnya = -1;

        for (int i = 0; i < n; i++) {
            if (nilai[i] != sebelumnya) {
                System.out.println(nilai[i]);
                sebelumnya = nilai[i];
                jumlah++;

                if (jumlah == 3) {
                    break;
                }
            }
        }

        System.out.println("\nPeringkat mahasiswa: ");
        int peringkat = 1;

        for (int i = 0; i < n; i++) {
            if (i > 0 && nilai[i] != nilai[i - 1]) {
                peringkat = i + 1;
            }
            
            System.out.println("nilai " + nilai[i] + " = peringkat " + peringkat);
        }
    }
}
