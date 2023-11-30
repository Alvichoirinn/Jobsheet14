import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nila n: ");
        int n = sc.nextInt();

        System.out.println("Fungsi Rekursif: ");
        deretDescendingRekursif(n);

        System.out.println("\nFungsi Iteratif: ");
        deretDescendingRekursif(n);

        sc.close();
    }
    static void deretDescendingRekursif(int n){
        if (n >= 0){
            System.out.print(n+ " ");
            deretDescendingRekursif(n-1);
        }
    }
    static void deretDescendingIteratif( int n){
        for(int i = n; i >= 0; i--){
            System.out.print(i+ " ");
        }
    }
}
