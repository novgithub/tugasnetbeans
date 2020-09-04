/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2pbo;

/**
 *
 * @author User
 */
public class main {
    public static void main(String[] args) {
        Encapsulation siswa = new Encapsulation();

        //masukkan data
        siswa.setName("nova");
        siswa.setId(07);
        
        //panggil method
        System.out.println("Nama Siswa: "+siswa.getName());
        System.out.println("Id Siswa: "+siswa.getId());
    }

}
