
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author asus cb46c
 */
public class Deklarasi_kondisi{
    Scanner scan = new Scanner(System.in);
    void deklarasi(){
        identitas (new Identitas_kondisi("Tahap Identitas Kelas"));
        kondisi (new Identitas_kondisi("Tahap Kondisi Kelas"));
    }
    public void identitas(Identitas_kondisi test) {
        System.out.println(test.kondisi);
        System.out.print("Masukan nama ruang :");
        test.setNama_ruang(scan.next());
        System.out.print("Masukan lokasi ruang :");
        test.setLokasi_ruang(scan.next());
        System.out.print("Masukan Jurusan anda :");
        test.setProdi(scan.next());
        
        System.out.println("================== \n");
        System.out.println("Nama ruang : "+test.getNama_ruang());
        System.out.println("Lokasi Ruang : "+test.getLokasi_ruang());
        System.out.println("Jurusan : "+test.getProdi());
       
    }
    public void kondisi(Identitas_kondisi test) {
        System.out.println(test.kondisi);
        System.out.println("A. Masukan panjang ruang ");
        System.out.print("Jawab :");
        test.setPanjang_ruang(scan.nextInt());
        System.out.println("B. Masukan lebar ruang ");
        System.out.print("Jawab :");
        test.setLebar_ruang(scan.nextInt());
        System.out.println("C. Luas : "+test.luas());
        System.out.println("D. Bentuk : "+test.bentuk());
        System.out.println("E. Masukan jumlah kursi");
        System.out.print("Jawab :");
        test.setJumlah_kursi(scan.nextInt());
        System.out.println("F. Rasio : "+test.rasio());
        System.out.println("Rasio : "+test.Analisis_rasio());
        System.out.println("G. Masukan jumlah pintu ");
        System.out.print("Jawab :");
        test.setJumlah_pintu(scan.nextInt());
        System.out.println("H. Masukan jumlah jendela");
        System.out.print("Jawab : ");
        test.setJumlah_jendela(scan.nextInt());
        System.out.println("Jumlah pintu dan jendela :"+test.analisisPintuDanJendela());
    }
}
