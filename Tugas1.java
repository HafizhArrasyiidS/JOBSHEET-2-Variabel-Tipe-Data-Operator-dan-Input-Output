import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        // Input
        int gajiPokok = 3000000;
        int tunjanganPerAnak = 150000;
        int jumlahAnak = 3;
        double persenPotongan = 0.05;

        // Proses
        int totalTunjangan = tunjanganPerAnak * jumlahAnak;
        int gajiKotor = gajiPokok + totalTunjangan;
        double potongan = persenPotongan * gajiPokok;
        double gajiBersih = gajiKotor - potongan;

        // Output
        System.out.println("===== Perhitungan Gaji Bu Jesi =====");
        System.out.println("Gaji Pokok       : Rp " + gajiPokok);
        System.out.println("Tunjangan Anak   : Rp " + totalTunjangan);
        System.out.println("Gaji Kotor       : Rp " + gajiKotor);
        System.out.println("Potongan (5%)    : Rp " + potongan);
        System.out.println("Gaji Bersih      : Rp " + gajiBersih);
    }
}
