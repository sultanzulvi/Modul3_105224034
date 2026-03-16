import java.util.Scanner;

public class KioskSoundFest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int stokVIP = 5;
        int stokFestival = 25;
        int stokTribune = 35;

        while (true) {

            System.out.println("\n=== KIOSK TIKET SOUNDFEST 2025 ===");
            System.out.println("1. VIP (Rp1500000) Stok: " + stokVIP);
            System.out.println("2. Festival (Rp800000) Stok: " + stokFestival);
            System.out.println("3. Tribune (Rp500000) Stok: " + stokTribune);
            System.out.println("4. Matikan Mesin");

            System.out.print("Pilih menu: ");
            int menu = input.nextInt();

            if (menu == 4) {
                System.out.println("Mesin dimatikan.");
                break;
            }

            System.out.print("Jumlah tiket: ");
            int jumlah = input.nextInt();

            int berhasil = 0;
            int total = 0;

            switch (menu) {

                case 1:

                    if (jumlah > stokVIP) {
                        System.out.println("Stok VIP tidak cukup.");
                        break;
                    }

                    for (int i = 1; i <= jumlah; i++) {

                        System.out.print("Usia penonton tiket ke-" + i + ": ");
                        int usia = input.nextInt();

                        if (usia <= 0 || usia > 120) {
                            System.out.println("Usia tidak logis.");
                            i--;
                            continue;
                        }

                        if (usia < 18) {
                            System.out.println("Tidak memenuhi syarat VIP.");
                            continue;
                        }

                        berhasil++;
                        total += 1500000;
                    }

                    stokVIP -= berhasil;
                    break;

                case 2:

                    if (jumlah > stokFestival) {
                        System.out.println("Stok Festival tidak cukup.");
                        break;
                    }

                    for (int i = 1; i <= jumlah; i++) {

                        System.out.print("Usia penonton tiket ke-" + i + ": ");
                        int usia = input.nextInt();

                        if (usia <= 0 || usia > 120) {
                            System.out.println("Usia tidak logis.");
                            i--;
                            continue;
                        }

                        if (usia < 15) {
                            System.out.println("Tidak memenuhi syarat Festival.");
                            continue;
                        }

                        berhasil++;
                        total += 800000;
                    }

                    stokFestival -= berhasil;
                    break;

                case 3:

                    if (jumlah > stokTribune) {
                        System.out.println("Stok Tribune tidak cukup.");
                        break;
                    }

                    for (int i = 1; i <= jumlah; i++) {

                        System.out.print("Usia penonton tiket ke-" + i + ": ");
                        int usia = input.nextInt();

                        if (usia <= 0 || usia > 120) {
                            System.out.println("Usia tidak logis.");
                            i--;
                            continue;
                        }

                        berhasil++;
                        total += 500000;
                    }

                    stokTribune -= berhasil;
                    break;

                default:
                    System.out.println("Menu tidak tersedia.");
            }

            if (berhasil > 0) {
                System.out.println("\n=== NOTA PEMBELIAN ===");
                System.out.println("Tiket berhasil : " + berhasil);
                System.out.println("Total bayar    : Rp " + total);
            }

        }

        input.close();
    }
}