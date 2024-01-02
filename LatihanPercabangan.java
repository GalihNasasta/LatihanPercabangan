import java.util.Scanner;

public class LatihanPercabangan {
    public static void main(String[] args) {
        int gajiKaryawan, lamaKerja, bonus;
        String nama;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nama: ");
        nama=input.nextLine();
        System.out.print("Masukkan Masa Kerja (Tahun): ");
        lamaKerja=input.nextInt();
        
        if (lamaKerja > 4) {
            bonus = 450000;
        } else {
            bonus = 100000;
        }
        
        gajiKaryawan = 3000000 + bonus;
        
        System.out.println("Gaji yang diterima: Rp "+gajiKaryawan);
        
    }
    
}
