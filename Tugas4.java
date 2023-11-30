import java.util.Scanner;
public class Tugas4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bulan ke: ");
        int bulanKe = sc.nextInt();

        int jumlahPasangan = hitungJumlahPasangan(bulanKe);
        System.out.println("Jumlah pasangan marmut pada akhir bulan ke-" + bulanKe + " adalah: " + jumlahPasangan);

        sc.close();
    }
    static int hitungJumlahPasangan(int bulan){
        if (bulan <=2){
            return 1;
        }else {
            return hitungJumlahPasangan(bulan - 1) + hitungJumlahPasangan(bulan - 2);
        }
    }
}
