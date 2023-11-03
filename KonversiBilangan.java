
import java.util.Scanner;

/**
 *
 * @author JOHAN ARIZONA
 */

public class KonversiBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        String binerInput, binerOutput, heksadesimalInput, heksadesimalOutput;
        int desimalInput, desimalOutput;
        System.out.println("SELAMAT DATANG DI PROGRAM KONVERSI BILANGAN!");
        while (true) {
            System.out.println("============================================");
            System.out.println("Pilih jenis konversi:");
            System.out.println("1. Biner ke Desimal");
            System.out.println("2. Desimal ke Biner");
            System.out.println("3. Biner ke Heksadesimal");
            System.out.println("4. Heksadesimal ke Biner");
            System.out.println("5. Desimal ke Heksadesimal");
            System.out.println("6. Heksadesimal ke Desimal");
            System.out.println("0. Keluar");
            System.out.println("============================================");
            System.out.print("Masukkan pilihan Anda (0-6): ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan bilangan biner: ");
                    binerInput = input.next();
                    desimalOutput = Integer.parseInt(binerInput, 2);
                    System.out.println("Hasil konversi ke desimal: " + desimalOutput);
                    break;
                case 2:
                    System.out.print("Masukkan bilangan desimal: ");
                    desimalInput = input.nextInt();
                    binerOutput = Integer.toBinaryString(desimalInput);
                    System.out.println("Hasil konversi ke biner: " + binerOutput);
                    break;
                case 3:
                    System.out.print("Masukkan bilangan biner: ");
                    binerInput = input.next();
                    desimalOutput = Integer.parseInt(binerInput, 2);
                    heksadesimalOutput = Integer.toHexString(desimalOutput);
                    System.out.println("Hasil konversi ke heksadesimal: " + heksadesimalOutput);
                    break;
                case 4:
                    System.out.print("Masukkan bilangan heksadesimal: ");
                    heksadesimalInput = input.next();
                    desimalOutput = Integer.parseInt(heksadesimalInput, 16);
                    binerOutput = Integer.toBinaryString(desimalOutput);
                    System.out.println("Hasil konversi ke biner: " + binerOutput);
                    break;
                case 5:
                    System.out.print("Masukkan bilangan desimal: ");
                    desimalInput = input.nextInt();
                    heksadesimalOutput = Integer.toHexString(desimalInput);
                    System.out.println("Hasil konversi ke heksadesimal: " + heksadesimalOutput);
                    break;
                case 6:
                    System.out.print("Masukkan bilangan heksadesimal: ");
                    heksadesimalInput = input.next();
                    desimalOutput = Integer.parseInt(heksadesimalInput, 16);
                    System.out.println("Hasil konversi ke desimal: " + desimalOutput);
                    break;
                case 0:
                    System.out.println("TERIMAKASIH TELAH MENGGUNAKAN PROGRAM INI!");
                    System.out.println("============================================");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Masukkan angka antara 0-6.");
                    break;
            }
        }
    }
}


