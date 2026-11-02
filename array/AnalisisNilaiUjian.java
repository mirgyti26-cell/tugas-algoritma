package array;

public class AnalisisNilaiUjian {
    public static void main(String[] args){
        int[] nilai = {75, 80, 65, 90, 55, 85, 70, 95};
        int total = 0;
        int jumlahLulus = 0;

        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }

        double rata = (double) total / nilai.length;
        System.out.print("rata-rata: " + rata);
        System.out.print("nilai di atas rata-rata: ");
        for (int i =0; i < nilai.length; i++) {
            if (nilai[i] > rata) {
                System.out.print(nilai[i] + " ");
            }
            if (nilai[i] >= 70) {
                jumlahLulus++;
            }
        }
        System.out.println();
        System.out.println("jumlah mahasiswa lulus: " + jumlahLulus);

        double persen = (double) jumlahLulus / nilai.length * 100;
        System.out.println("persentanse lulus: " + persen + "%");
    }

}
