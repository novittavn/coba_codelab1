import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nama;
        char jenisKelamin;
        String jenisKelaminLengkap;
        String tanggalLahirString;
        int umurTahun;
        int umurBulan;
        Scanner scan = new Scanner(System.in);

        System.out.print("Nama: ");
        nama = scan.nextLine();

        System.out.print("Jenis kelamin (P/L): ");
        jenisKelamin = scan.next().charAt(0);

        if (jenisKelamin == 'P' || jenisKelamin == 'p') {
            jenisKelaminLengkap = "Perempuan";
        } else if (jenisKelamin == 'L' || jenisKelamin == 'l') {
            jenisKelaminLengkap = "Laki-laki";
        } else {
            System.out.println("Input jenis tidak valid. Gunakan 'P' atau 'L'.");
            scan.close();
            return;
        }

        System.out.print("Tanggal lahir (yyyy-mm-dd): ");
        tanggalLahirString = scan.next();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirString);

        LocalDate hariIni = LocalDate.now();
        Period selisih = Period.between(tanggalLahir, hariIni);
        umurTahun = selisih.getYears();
        umurBulan = selisih.getMonths();

        System.out.println("\n");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminLengkap);
        System.out.println("Umur Anda : " + umurTahun + " tahun " + umurBulan + " bulan");

        scan.close();
    }
}