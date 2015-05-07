
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
public class Deklarasi_ruangkelas extends Ruangkelas{
    Scanner scan = new Scanner(System.in);
    void identitas_ruang(){
        System.out.println("Selamat datang");
        System.out.print("Masukan nama ruang :");
        super.setNama_ruang(scan.next());
        System.out.print("Masukan lokasi ruang :");
        super.setLokasi_ruang(scan.next());
        System.out.print("Masukan Jurusan anda :");
        super.setProdi(scan.next());
        
        System.out.println("================== \n");
        System.out.println("Nama ruang : "+super.getNama_ruang());
        System.out.println("Lokasi Ruang : "+super.getLokasi_ruang());
        System.out.println("Jurusan : "+super.getProdi());
    }
    void kondisi_ruangkelas(){
        System.out.println("\nTahap kondisi Ruang kelas\n");
        System.out.println("A. Masukan panjang ruang ");
        System.out.print("Jawab :");
        super.setPanjang_ruang(scan.nextInt());
        System.out.println("B. Masukan lebar ruang ");
        System.out.print("Jawab :");
        super.setLebar_ruang(scan.nextInt());
        System.out.println("C. Luas : "+luas());
        System.out.println("D. Bentuk : "+bentuk());
        System.out.println("E. Masukan jumlah kursi");
        System.out.print("Jawab :");
        super.setJumlah_kursi(scan.nextInt());
        System.out.println("F. Rasio : "+rasio());
        System.out.println("Rasio : "+Analisis_rasio());
        System.out.println("G. Masukan jumlah pintu ");
        System.out.print("Jawab :");
        super.setJumlah_pintu(scan.nextInt());
        System.out.println("H. Masukan jumlah jendela");
        System.out.print("Jawab : ");
        super.setJumlah_jendela(scan.nextInt());
        System.out.println("Jumlah pintu dan jendela :"+analisisPintuDanJendela());
    }
    public static void main(String[] args) {
        Deklarasi_ruangkelas n = new Deklarasi_ruangkelas();
        n.identitas_ruang();
        n.kondisi_ruangkelas();
    }
}
