import java.util.Scanner;

public class Emas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan harga emas     : ");
        int harga = sc.nextInt();
        System.out.print("Masukkan tahun investasi: ");
        int tahun = sc.nextInt();
        System.out.print("Hasil Investasi (Rp)    : ");
        investasi(harga, tahun);
    }
    public static void investasi(int harga, int tahun) {
        double keuntungan = 0.117, hasilInves = harga;
        for (int i = 0; i < tahun; i++) {
            hasilInves += hasilInves * keuntungan;
        }
        System.out.print(hasilInves);
    }
}
