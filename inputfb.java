import java.util.ArrayList;
import java.util.Scanner;

public class inputfb {
    public static void main(String[] args) {
        ArrayList<Facebook> MasukanBarang = new ArrayList<Facebook>();
        for (int index = 0; index < 3; index++) {
            Facebook Barang = new Facebook();
            Scanner detailInput = new Scanner(System.in);
            System.out.println("Masukkan Nama :");
            Barang.Nama = detailInput.nextLine();

            System.out.println("Jenis Media:");
           Barang.Media= detailInput.nextInt();

            System.out.println("Masuk : ");
           Barang.Katagori = detailInput.nextLine();

            System.out.println("Masukkan Deskripsi : ");
           Barang.Deskripsi = detailInput.nextLine();

            MasukanBarang.add(Barang);
        }
    }
}