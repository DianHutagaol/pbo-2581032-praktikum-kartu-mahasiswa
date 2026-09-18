import java.util.Scanner;

public class KartuMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("NIK (16 digit) : ");
        long nik = scanner.nextLong();

        System.out.print("Umur           : ");
        int umur = scanner.nextInt();

        System.out.print("Tinggi badan   : ");
        double tinggiBadan = scanner.nextDouble();

        System.out.print("Golongan darah : ");
        char golonganDarah = scanner.next().charAt(0);

        // Menampilkan hasil input
        System.out.println("\n===== DATA MAHASISWA =====");
        System.out.println("NIK            : " + nik);
        System.out.println("Umur           : " + umur);
        System.out.println("Tinggi Badan   : " + tinggiBadan);
        System.out.println("Golongan Darah : " + golonganDarah);

        scanner.close();
    }
}
