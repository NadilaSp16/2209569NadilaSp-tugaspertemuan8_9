/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;

/**
 *
 * @author Nadila Suci P
 */
import java.util.Date;
public class Main {
 
    public static void main(String[] args) {
        Person person = new Person("Nadila Suci Permatasari", "Jl. GegerKalong No.75", "081222732585", "nadilasucip16@gmail.com");
        System.out.println(person.toString());

        Student student = new Student("Nadin Amizah", "jl. GegerKalong No.76", "082333748574", "amizahnadin@gmail.com", Student.MAHASISWA_BARU);
        System.out.println(student.toString());

        Employee employee = new Employee("Nasya Aurin", "jl. GegerKalong No. 99", "083444787901", "nasyaaurin", "Kantor 155", 5000000, new Date());
        System.out.println(employee.toString());

        Faculty faculty = new Faculty("Naril Agustian", "jl. Permata No. 16", "0812346598712", "narilagus@gmail.com", "Kantor 123", 6500000, new Date(), 
                "8 AM - 5 PM", "Dosen");
        System.out.println(faculty.toString());

        Staff staff = new Staff("Nurin Hidayah", "Jl. Mata Air No. 55", "084567890123", "nurinhiday@gmail.com", "Kantor 268", 5500000, new Date(), "Marketing");
        System.out.println(staff.toString());
    }
}