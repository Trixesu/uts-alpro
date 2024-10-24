package utsalpro;

import java.util.Scanner;

public class KangGalon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nota Warung 'Air Murah'");
        System.out.println("Nama\t: Paulus Seta Risfikawanta");
        System.out.println("NIM\t: 245314018");
        
        //Proses Input
        //\t (tab) adalah untuk meratakan baris tulisan
        System.out.print("Masukkan Jumlah Galon   : ");
        double galon = input.nextDouble();
        System.out.print("Masukkan Jumlah B.Besar : ");
        double bBesar = input.nextDouble();
        System.out.print("Masukkan Jumlah B.Kecil : ");
        double bKecil = input.nextDouble();
        System.out.print("Masukkan Jumlah Gelas   : ");
        double gelas = input.nextDouble();
        System.out.println("");
        System.out.println("Jumlah\tKemasan\t@\tHarga\tDiscount");
        System.out.println("========================================");        
        
        //Proses Menghitung
        double hargaGalon, hargabBesar, hargabKecil, hargaGelas, diskonGalon, diskonbBesar, diskonbKecil, diskonGelas, totalHarga, totalDiskon,  totalBayar;
        hargaGalon = 30000 * galon;
        hargabBesar = 5000 * bBesar;
        hargabKecil = 3000 * bKecil;
        hargaGelas = 1000 * gelas;        
        diskonGalon = (galon * hargaGalon) * 0.15;
        diskonbBesar = (bBesar * hargabBesar) * 0.12;
        diskonbKecil = (bKecil * hargabKecil) * 0.10;
        diskonGelas = (gelas * hargaGelas) * 0.20;
        
        //Proses Output
        //(int) berfungsi untuk mengonversikan output dari bilangan desimal ke bilangan bulat
        System.out.println(+(int)galon+"\tGalon\t30000\t"+(int)hargaGalon+"\t"+(int)diskonGalon);
        System.out.println(+(int)bBesar+"\tB.Besar\t5000\t"+(int)hargabBesar+"\t"+(int)diskonbBesar);
        System.out.println(+(int)bKecil+"\tB.Kecil\t3000\t"+(int)hargabKecil+"\t"+(int)diskonbKecil);
        System.out.println(+(int)gelas+"\tGelas\t1000\t"+(int)hargaGelas+"\t"+(int)diskonGelas);
        System.out.println("========================================");
        totalHarga = hargaGalon + hargabBesar + hargabKecil + hargaGelas;
        totalDiskon = diskonGalon + diskonbBesar + diskonbKecil + diskonGelas;
        totalBayar = totalHarga - totalDiskon;
        System.out.println("Total\t\t\t"+(int)totalHarga+"\t"+(int)totalDiskon);
        System.out.println("Dibayarkan\t\t"+(int)totalBayar);
        input.close();
    }
}