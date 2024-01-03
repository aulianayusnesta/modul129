import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;
//
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        out.print("Masukkan harga barang: ");
        double hargaBarang = input.nextDouble();
        out.print("Masukkan jumlah barang: ");
        int jumlahBarang = input.nextInt();
        double totalBelanja = hargaBarang * jumlahBarang;
        out.println("Total belanja Anda adalah: " + totalBelanja);
        input.close();
    }
}