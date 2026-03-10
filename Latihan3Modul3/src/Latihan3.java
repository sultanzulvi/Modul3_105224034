import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Masukan nilai ujian akhir : ");
        double nilaiAkhir = input.nextDouble();

        System.out.println("Presentasi Absensi : ");
        double absensi = input.nextDouble();

        String hasil = (nilaiAkhir > 75 && absensi > 80) ? "Lulus" : "Tidak Lulus";

        System.out.println("Hasil Akhir : " + hasil);

        input.close();
    }
}
