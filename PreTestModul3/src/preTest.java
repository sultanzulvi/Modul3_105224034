import java.util.Scanner;

public class preTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Usia : ");
        int usia = input.nextInt();

        System.out.print("Masukan Berat Badan : ");
        double beratBadan = input.nextDouble();

        System.out.print("Kadar Hemoglobin : ");
        double kadarHemoglobin = input.nextDouble();

        if(usia >= 20){
            if(beratBadan < 100 && beratBadan > 60){
                if(kadarHemoglobin < 17 && kadarHemoglobin > 12.5){
                    System.out.println("Anda layak untuk menjadi pendonor!");
                }else {
                    System.out.println("Kadar Hemoglobin tidak mencukupi!");
                }
            }
            else{
                System.out.println("Berat badan tidak memenuhi kriteria!");
            }
        }
        else{
            System.out.println("Usia anda tidak mencukupi!");
        }

        input.close();
    }
}