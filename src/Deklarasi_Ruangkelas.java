
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NirmalaKarim
 */
public class Deklarasi_Ruangkelas {
    Scanner scan = new Scanner(System.in);
    void identitas_ruang(){
        Ruangkelas kelas = new Ruangkelas();
        System.out.println("Selamat datang");
        System.out.print("Masukan nama ruang :");
        kelas.setNama_ruang(scan.next());
        System.out.print("Masukan lokasi ruang :");
        kelas.setLokasi_ruang(scan.next());
        System.out.print("Masukan Jurusan anda :");
        kelas.setProdi(scan.next());
        
        System.out.println("==================");
        System.out.println("");
        System.out.println("Nama ruang : "+kelas.getNama_ruang());
        System.out.println("Lokasi Ruang : "+kelas.getLokasi_ruang());
        System.out.println("Jurusan : "+kelas.getProdi());
    }
    void kondisi_ruangkelas(){
        Ruangkelas kelas = new Ruangkelas();
        System.out.println("*kondisi ruang kelas*");
        System.out.print("Masukan panjang ruang : ");
        kelas.setPanjang_ruang(scan.nextInt());
        System.out.print("Masukan lebar ruang : ");
        kelas.setLebar_ruang(scan.nextInt());
        System.out.println("Luas : "+kelas.luas());
        System.out.print("Bentuk : ");
        kelas.bentuk();
        System.out.println("");
        System.out.print("Masukan jumlah kursi : ");
        kelas.setJumlah_kursi(scan.nextInt());
        System.out.println("Rasio : "+kelas.rasio());
        if (kelas.rasio()>=0.5){
            System.out.println("sesuai");
        }else {
            System.out.println("tidak sesuai");
        }
        System.out.print("Masukan jumlah pintu : ");
        kelas.setJumlah_pintu(scan.nextInt());
        System.out.print("Masukan jumlah jendela : ");
        kelas.setJumlah_jendela(scan.nextInt());
        kelas.analisis();
    }
}
