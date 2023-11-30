import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        if (cekBilanganPrima(n)){
            System.out.println(n + " adalah bilangan prima");
        }else{
            System.out.println(n + " bukan bilangan prima");
        }

        sc.close();
    }
    
    static boolean cekBilanganPrima(int n){
        return cekBilanganPrima(n, 2);
    }
    static boolean cekBilanganPrima(int n, int i){
        if (n <= 1){
            return false;
        }
        if (i == n){
            return true;
        }if (n % i == 0){
            return false;
        }
        return cekBilanganPrima(n, i + 1);

    }
}