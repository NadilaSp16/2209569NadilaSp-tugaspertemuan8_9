/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan9;

/**
 *
 * @author Nadila Suci P
 */
import java.util.Scanner;
public class Pertemuan9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input tiga sisi segitiga
        System.out.print("Masukkan sisi1: ");
        double side1 = input.nextDouble();
        System.out.print("Masukkan sisi2: ");
        double side2 = input.nextDouble();
        System.out.print("Masukkan sisi3: ");
        double side3 = input.nextDouble();

        // input warna
        System.out.print("Masukkan warna: ");
        String color = input.next();

        // input nilai Boolean untuk menunjukkan apakah segitiga terisi
        System.out.print("Apakah segitiga terisi (true/false)? ");
        boolean filled = input.nextBoolean();

        // Membuat objek Segitiga dengan sisi-sisi yang dimasukkan
        Segitiga segitiga = new Segitiga(side1, side2, side3);
        segitiga.setColor(color);
        segitiga.setFilled(filled);

        // Menampilkan luas, keliling, warna, dan properti yang diisi
        System.out.println("Luas segitiga: " + segitiga.getArea());
        System.out.println("Keliling segitiga: " + segitiga.getPerimeter());
        System.out.println("Warna segitiga: " + segitiga.getColor());
        System.out.println("Apakah segitiga terisi: " + segitiga.isFilled());
        System.out.println(segitiga.toString());
    }
}

    

