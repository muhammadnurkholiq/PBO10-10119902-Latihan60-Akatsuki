/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10.pkg10119902.latihan60.akatsuki;

/**
 *
 * @author korik
 */
public class Main {

/**
 *
 * @author 
 * Nama     : Muhammad Nurkholiq
 * Kelas    : IF10K
 * NIM      : 10119902
 * Deskripsi Program    : Program Ini Berisi Program Untuk Menampilkan Program Akatsuki
 * 
 */
    public static void main(String[] args) {
        // TODO code application logic here
        PemimpinAkatsuki pa = new PemimpinAkatsuki("Pain", "konoha", "pain");
        pa.setPemimpin("Pemimpin");
        pa.tampilAnggota();
        System.out.println("Di Akatsuki sebagai : " + pa.getPemimpin());
        
        System.out.println("");
    
        AnggotaAkatsuki aa = new AnggotaAkatsuki("Uchiha", "konoha", "zabuza");
        aa.setAnggota("Anggota");
        aa.tampilAnggota();
        System.out.println("Di Akatsuki sebagai : " + aa.getAnggota());
        System.out.println("");
    }
    
}