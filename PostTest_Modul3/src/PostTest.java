import java.util.Scanner;

public class PostTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int saldo = 500000;
        int pilih;

        do{
        System.out.println("===== MENU =====");
        System.out.println("1. Cek Saldo");
        System.out.println("2. Setor Tunai");
        System.out.println("3. Tarik Tunai");
        System.out.println("4. Exit");

        pilih = input.nextInt();

        switch (pilih){
            case 1:
            System.out.print("Saldo : " + saldo);
            break;

            case 2:
            System.out.print("Setor tunai : ");
            int setor = input.nextInt();
            
            System.out.print("Saldo : " + ( saldo + setor ));
            break;

            case 3:
            System.out.print("Tarik saldo : ");
            int tarikSaldo = input.nextInt();

            if( saldo - tarikSaldo <= 50000){
                System.out.println("Sisa saldo anda kurang dari 50000!!");
            }else{
                System.out.print("Saldo : " + (saldo - tarikSaldo) );
            }
            break;

            case 4:
                System.out.println("Terima kasih, datang kembali!!");
                break;

            default:
                System.out.println("Pilih sesuai menu!!");
        }
        } while (pilih != 4);
        
        input.close();

    }
}
