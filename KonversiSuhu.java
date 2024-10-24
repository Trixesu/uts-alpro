package utsalpro;

import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nama\t: Paulus Seta Risfikawanta");
        System.out.println("NIM\t: 245314018");
        System.out.println("Menu");
        System.out.println("1. Celcius\n2. Fahrenheit\n3. Reamur");
        System.out.print("Pilih ? ");
        int menu = input.nextInt();
        
        if (menu == 1) {
            System.out.print("Masukkan Suhu Celcius\t: ");
            double celcius = input.nextDouble();
            double reamur = (4.0/5.0) * celcius;
            double fahrenheit = (9.0/5.0) * celcius;
            System.out.println("Suhu Reamur\t: "+reamur);
            System.out.println("Suhu Fahrenheit\t: "+fahrenheit);
        } else if (menu == 2) {
            System.out.print("Masukkan Suhu Fahrenheit\t: ");
            double fahrenheit = input.nextDouble();
            double celcius = (4.0/9.0) * (fahrenheit - 32);
            double reamur = (5.0/9.0) * (fahrenheit - 32);
            System.out.println("Suhu Celcius\t: "+celcius);
            System.out.println("Suhu Reamur\t: "+reamur);
        } else if (menu == 3) {
            System.out.print("Masukkan Suhu Reamur\t: ");
            double reamur = input.nextDouble();
            double celcius = (5.0/4.0) * reamur;
            double fahrenheit = (9.0/4.0) * (reamur + 32);
            System.out.println("Suhu Reamur\t: "+reamur);
            System.out.println("Suhu Celcius\t: "+celcius);
        } else {
            System.out.println("Masukkan Salah");
        }
        input.close();
    }
}