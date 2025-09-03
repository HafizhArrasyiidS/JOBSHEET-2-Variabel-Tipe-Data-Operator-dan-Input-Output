public class ContohVariabel10 {

    public static void main(String[] args) {
        String hobby = "Bermain Petak Umpet";
        boolean pandai = true;
        char jenisKelamin = 'L';
        byte umurSekarang = 20;
        double $ipk = 3.24, tinggiBadan = 1.78;

        System.out.println(hobby);
        System.out.println("Apakah Pandai? " + pandai);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Umur Saya Sekarang: " + umurSekarang);
        System.out.println(String.format("Saya ber ipk %s, dengan tinggi badan %s", $ipk,tinggiBadan));
    }
}