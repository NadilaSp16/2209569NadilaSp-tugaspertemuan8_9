/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;

/**
 *
 * @author Nadila Suci P
 */
public class Student extends Person {
    public static final String MAHASISWA_BARU = "Mahasiswa Baru";
    public static final String MAHASISWA_TAHUN_KETIGA = "Mahasiswa Tahun Ketiga";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    protected String statusKelas;

    public Student(String nama, String alamat, String nomorTelepon, String email, String statusKelas) {
        super(nama, alamat, nomorTelepon, email);
        this.statusKelas = statusKelas;
    }

    public String getStatusKelas() {
        return statusKelas;
    }

    @Override
    public String toString() {
        return String.format(
            "Kelas: Student\nNama: %s\nAlamat: %s\nNomor Telepon: %s\nEmail: %s\nStatus Kelas: %s\n",
            nama, alamat, nomorTelepon, email, statusKelas
        );
    }
}

