import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int iterasi = 0;
        while (iterasi != 3){
        System.out.println("Masukan 6 angka : ");
        int pin = input.nextInt();
            if( pin == 654321){
                System.out.println("Berhasil!!");
                break;
            }else{
                if(iterasi != 3){
                System.out.println("Sandi salah, coba lagi!!");
                }else{
                break;
                }
            }
            iterasi++;
        }

        input.close();
    }
}
