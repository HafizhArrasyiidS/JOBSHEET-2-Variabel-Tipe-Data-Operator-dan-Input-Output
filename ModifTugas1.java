import java.util.Scanner;

public class ModifTugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gajiPokok, tunjanganPerAnak, jumlahAnak;
        double persenPotongan = 0.05;

        System.out.print("Masukkan gaji pokok: Rp ");
        gajiPokok = sc.nextInt();
        System.out.print("Masukkan tunjangan anak per bulan: Rp ");
        tunjanganPerAnak = sc.nextInt();
        System.out.print("Masukkan jumlah anak: ");
        jumlahAnak = sc.nextInt();

        int totalTunjangan = tunjanganPerAnak * jumlahAnak;
        int gajiKotor = gajiPokok + totalTunjangan;
        double potongan = persenPotongan * gajiPokok;
        double gajiBersih = gajiKotor - potongan;

        System.out.println("\n===== Perhitungan Gaji Karyawan =====");
        System.out.println("Gaji Pokok       : Rp " + gajiPokok);
        System.out.println("Tunjangan Anak   : Rp " + totalTunjangan);
        System.out.println("Gaji Kotor       : Rp " + gajiKotor);
        System.out.println("Potongan (5%)    : Rp " + potongan);
        System.out.println("Gaji Bersih      : Rp " + gajiBersih);
    }
}