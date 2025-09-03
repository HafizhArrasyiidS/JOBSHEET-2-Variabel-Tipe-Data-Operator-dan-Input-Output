import java.util.Scanner;

public class Tugas2Modif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang tanah (m): ");
        int panjangTanah = sc.nextInt();
        System.out.print("Masukkan lebar tanah (m): ");
        int lebarTanah = sc.nextInt();
        System.out.print("Masukkan jumlah kolam lingkaran: ");
        int jumlahKolamLingkaran = sc.nextInt();
        System.out.print("Masukkan diameter kolam lingkaran (m): ");
        int diameterLingkaran = sc.nextInt();
        System.out.print("Masukkan sisi kolam persegi (m): ");
        int sisiPersegi = sc.nextInt();

        int luasTanah = panjangTanah * lebarTanah;
        double jariJari = diameterLingkaran / 2.0;
        double luasKolamLingkaran = Math.PI * Math.pow(jariJari, 2);
        double totalLuasKolamLingkaran = jumlahKolamLingkaran * luasKolamLingkaran;
        int luasKolamPersegi = sisiPersegi * sisiPersegi;
        double totalKolam = totalLuasKolamLingkaran + luasKolamPersegi; 
        double luasRumput = luasTanah - totalKolam;

        System.out.println("\n===== Perhitungan Luas Tanah Pak Jaka =====");
        System.out.println("Luas Tanah                : " + luasTanah + " m2");
        System.out.println("Total Luas Kolam Lingkaran: " + totalLuasKolamLingkaran + " m2");
        System.out.println("Luas Kolam Persegi        : " + luasKolamPersegi + " m2");
        System.out.println("Total Luas Kolam          : " + totalKolam + " m2");
        System.out.println("Luas Tanah untuk Rumput   : " + luasRumput + " m2");

        sc.close();
    }
}
