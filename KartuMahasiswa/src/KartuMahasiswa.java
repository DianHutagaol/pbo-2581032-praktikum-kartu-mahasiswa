import java.util.Scanner;

public class KartuMahasiswa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------KARTU MAHASISWA------------");

        String nik = bacaNIK(scanner);
        int umur = bacaUmur(scanner);
        double tinggi = bacaTinggi(scanner);
        char golDarah = bacaGolDarah(scanner);
        boolean menikah = bacaStatusMenikah(scanner);
        String nama = bacaNama(scanner);


        System.out.println("------------KARTU MAHASISWA------------");
        System.out.println("Nama Lengkap   : " + nama);
        System.out.println("NIK            : " + nik);
        System.out.println("Umur           : " + umur + " tahun");
        System.out.println("Tinggi Badan   : " + tinggi + " cm");
        System.out.println("Golongan Darah : " + golDarah);
        System.out.println("Status Menikah : " + (menikah ? "Sudah" : "Belum"));
        System.out.println("=========================================");

        scanner.close();
    }

    public static String bacaNIK(Scanner scanner) {
        String input;
        boolean valid = false;
        do {
            System.out.print("Input NIK (harus 16 digit) : ");
            input = scanner.nextLine().trim();

            if (input.matches("\\d{16}")) {
                valid = true;
            } else {
                System.out.println("[ERROR] NIK tidak valid! NIK kamu  harus ada 16 angka, kalo tidak ada berarti tidak bisa lanjut.\n");
            }
        } while (!valid);
        return input;
    }

    public static int bacaUmur(Scanner scanner) {
        int umur = 0;
        boolean valid = false;
        do {
            System.out.print("Input Umur (15 - 100 tahun)  : ");
            if (scanner.hasNextInt()) {
                umur = scanner.nextInt();
                if (umur >= 17 && umur <= 100) {
                    valid = true;
                } else {
                    System.out.println("[ERROR] Umur kurang dari 17 dan lebih dari 100 sudah tidak diizinkan untuk melanjutkan data.\n");
                }
            } else {
                System.out.println("[ERROR] input harus angka tidak boleh tulisan abjad\n");
                scanner.next();
            }
        } while (!valid);
        return umur;
    }

    public static double bacaTinggi(Scanner scanner) {
        double tinggi = 0.0;
        boolean valid = false;
        do {
            System.out.print("Input Tinggi Badan (cm)     : ");
            if (scanner.hasNextDouble()) {
                tinggi = scanner.nextDouble();
                if (tinggi >= 150 && tinggi <= 300) {
                    valid = true;
                } else {
                    System.out.println("[ERROR] Tinggi badan harus antara 150 hingga 300 cm!\n");
                }
            } else {
                System.out.println("[ERROR] input harus angka tidak boleh tulisan abjad\n");
                scanner.next();
            }
        } while (!valid);
        return tinggi;
    }

    public static char bacaGolDarah(Scanner scanner) {
        char gol = ' ';
        boolean valid = false;
        do {
            System.out.print("Input Gol. Darah (A/B/O)    : ");
            String input = scanner.next().toUpperCase();
            if (input.length() == 1 && (input.charAt(0) == 'A' || input.charAt(0) == 'B' || input.charAt(0) == 'O')) {
                gol = input.charAt(0);
                valid = true;
            } else {
                System.out.println("[ERROR] Golongan darah harus berupa huruf 'A', 'B', atau 'O'!\n");
            }
        } while (!valid);
        return gol;
    }

    public static boolean bacaStatusMenikah(Scanner scanner) {
        boolean status = false;
        boolean valid = false;
        do {
            System.out.print("Sudah Menikah? (true/false) : ");
            if (scanner.hasNextBoolean()) {
                status = scanner.nextBoolean();
                valid = true;
            } else {
                System.out.println("[ERROR] Input harus berupa kata 'true' atau 'false'!\n");
                scanner.next();
            }
        } while (!valid);
        scanner.nextLine();
        return status;
    }

    public static String bacaNama(Scanner scanner) {
        String nama;
        boolean valid = false;
        do {
            System.out.print("Input Nama Lengkap          : ");
            nama = scanner.nextLine().trim();
            if (!nama.isEmpty()) {
                valid = true;
            } else {
                System.out.println("[ERROR] Nama lengkap tidak boleh kosong!\n");
            }
        } while (!valid);
        return nama;
    }
}