package array;

public class HapusDuplikat {
    public static void main(Sting[] args) {
        int[] nomor = {101, 102, 101, 103, 102, 104, 105, 103};
        int jumlah = 0;

        for (int i = 0; i < nomor.length; i++) {
            boolean ada = false;

            for (int j = 0; j< jumlah; j++) {
                if (nomor[i] == nomor[j]) {
                    ada = true;
                }
            }

            if (!ada) {
                nomor [jumlah] = nomor[i];
                jumlah++;
            }
        }

        System.out.print("nomor peserta unik: ");
        for (int i = 0; i < jumlah; i++) {
            System.out.print(nomor[i] + " ");
        }

        System.out.println("\nJumlah peserta unik: " + jumlah);
    }
}
