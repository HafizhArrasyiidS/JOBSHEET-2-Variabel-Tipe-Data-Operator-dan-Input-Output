import java.util.Scanner;

public class Bank10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jml_tabungan_awal, lama_menabung;
        double prosentase_bunga = 0.02, bunga, jml_tabungan_akhir;

        System.out.println("Masukkan jumlah tabungan awal: ");
        jml_tabungan_awal = sc.nextInt();
        System.out.println("Masukkan lama menabung: ");
        lama_menabung = sc.nextInt();

        bunga = jml_tabungan_awal * prosentase_bunga * lama_menabung;
        jml_tabungan_akhir = jml_tabungan_awal + bunga;

        System.out.println("Bunga adalah: " + bunga);
        System.out.println("Jumlah tabungan akhir: " + jml_tabungan_akhir);
    }
}