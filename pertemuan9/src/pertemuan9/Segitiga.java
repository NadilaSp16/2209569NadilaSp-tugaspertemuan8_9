/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan9;

/**
 *
 * @author Nadila Suci P
 */
public class Segitiga extends GeometricObject {
    
    private double side1;
    private double side2;
    private double side3;

    // Konstruktor tanpa argumen yang membuat segitiga default
    public Segitiga() {
        this(1.0, 1.0, 1.0);
    }

    // Konstruktor dengan parameter untuk sisi-sisi segitiga
    public Segitiga(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Metode akses untuk side1
    public double getSide1() {
        return side1;
    }

    // Metode akses untuk side2
    public double getSide2() {
        return side2;
    }

    // Metode akses untuk side3
    public double getSide3() {
        return side3;
    }

    // Metode untuk menghitung luas segitiga 
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Metode untuk menghitung keliling segitiga
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // Metode toString untuk Segitiga
    @Override
    public String toString() {
        return "Segitiga: sisi1 = " + side1 + " sisi2 = " + side2 + " sisi3 = " + side3;
    }

}


