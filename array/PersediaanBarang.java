package array;

public class PersediaanBarang {
    public static void main(String[] args) {
        int[] stock = {12, 8, 15, 6};

        System.out.println("stock pertama: " + stock[0]);
        System.out.println("stock terakhir: " +  stock[3]);
        //jika program mengakses stock[4], maka akan terjadi error
        //karena indeks array hanya dari 0 sampai 3
        stock[1]= 10;
        System.out.print("stock setelah perubahan: ");
        for(int i = 0; i < stock.length; i++) {
            System.out.print(stock[i]);
            if (i < stock.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

}

