import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class Percobaan2 {
   
    static int hitungPangkat(int x, int y){
        if (y == 0){
            return (1);
        }else{
            return(x * hitungPangkat(x, y-1));
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan, pangkat;
        System.out.print("Bilangan yang dihitung: ");
        bilangan = input.nextInt();
        System.out.print("Pangkat: ");
        pangkat = input.nextInt();
        cetakPangkat(pangkat, bilangan);
        System.out.println(hitungPangkat(bilangan, pangkat));
    }

    public static void cetakPangkat (int pangkat, int bilangan){//membuat fungsi 
    System.out.print("Perhitungan pangkat: ");
        for (int i = 1; i <= pangkat; i++){
            System.out.print(bilangan);
            if (i < pangkat){
                System.out.print("x");
            }else{
                System.out.print("="+ hitungPangkat(bilangan, pangkat));
            }
        }
        System.out.println();
    }
}



