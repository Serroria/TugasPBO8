/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package kelasku.tugaspertemuan8;
import java.util.Scanner;
/**
Nama : Merylien Jovanda
Kelas : 3f Informatika
*1. Jumlah Barang = 5 
2. Kode dari 001-00n
4. Barang = pulpen, buku,pensil,spidol,penghapus.
- Harga satuan ( random /bebas = asal masuk akal)
* 
* 
 */
public class Toko {

    public static void main(String[] args) {
        String[]Item = new String[5];
        String[]kode = new String[5];
        Scanner input = new Scanner(System.in);
        int harga[] = new int [5];
        int jumlahBeli[] = new int [5];
        
        String[] kodeBarang = {};
        String[] namaBarang = {"Pulpen", "Buku", "Pensil","Spidol", "Penghapus"};
        int[] hargaList = {2000, 5000, 2000, 5000, 2000};
        
        System.out.print("Masukan Item Barang: ");
        int data = input.nextInt();
        for (int i=0; i<data; i++){
        System.out.println("Data ke "+ (i+1));
        
        System.out.print("Masukan Kode : ");
        kode[i] = input.next();
        System.out.print("Masukan jumlah beli : ");
        jumlahBeli [i] = input.nextInt();
        
        switch (kode[i]) {
        case "001":
            namaBarang[i] = "Pulpen";
            harga[i] = 2000;
            break;
        case "002":
            namaBarang[i] = "Buku";
            harga[i] = 5000;
            break;
        case "003":
            namaBarang[i] = "Pensil";
            harga[i] = 2000;
            break;
        case "004":
            namaBarang[i] = "Spidol";
            harga[i] = 5000;
            break;
        case "005":
            namaBarang[i] = "Penghapus";
            harga [i] = 2000;
            break;
        default:
            System.out.println("Kode barang tidak ditemukan!");
            namaBarang[i] = "Tidak diketahui";
            harga[i] = 0;
            break;
    }
        }
        
        System.out.println();
        System.out.println("TOKO SERBA ADA");
        System.out.println("**************");
        System.out.printf("%-3s %-10s %-17s %-6s %-12s %-12s\n", "No", "Kode Barang", "Nama Barang", "Harga", "Jumlah Beli", "Jumlah Bayar");
        
        System.out.println("================================================================");
        int totalBayar = 0;
        for (int i = 0; i < data; i++) {
            int jumlahBayar = harga[i] * jumlahBeli[i];
            totalBayar += jumlahBayar;
            
    
           System.out.printf("%-3s %-10s %-17s %-8s %-12s %-12s\n", (i + 1), kode[i], namaBarang[i], harga[i], jumlahBeli[i], jumlahBayar);
        }
        
        System.out.println("================================================================");
        System.out.println("Total Bayar: " + totalBayar);
        System.out.println("================================================================");
    }
    }
