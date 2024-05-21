/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package person;

/**
 *
 * @author Nadila Suci P
 */
public class Person {

    protected String nama;
    protected String alamat;
    protected String nomorTelepon;
    protected String email;

    public Person(String nama, String alamat, String nomorTelepon, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return String.format(
            "Kelas: Person\nNama: %s\nAlamat: %s\nNomor Telepon: %s\nEmail: %s\n",
            nama, alamat, nomorTelepon, email
        );
    }
}

