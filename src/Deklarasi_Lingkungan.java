
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NirmalaKarim
 */
public class Deklarasi_Lingkungan {
    Scanner scan = new Scanner(System.in);
    void kondisi_lingkungan(){        
        Lingkungan kondisi = new Lingkungan();
        /*kondisi.setLantai("bersih");
        kondisi.setDinding("bersih");
        kondisi.setAtap("bersih");
        kondisi.setJendela("bersih");
        kondisi.setPintu("bersih");
        kondisi.setSirkulasi_udara("lancar*/
        
        System.out.println("Tahap Lingkungan Ruang kelas \n");
        kondisi.kebersihan();
        
        System.out.println("Tahap Kebersihan Ruang kelas \n");
        System.out.println("A. Bagaimana sirkulasi udara kelas");
        System.out.println("1. lancar");
        System.out.println("2. tidak lancar");
        System.out.print("Jawab : ");
        kondisi.setSirkulasi_udara(scan.nextInt());
        kondisi.sirkualsi_udara();
        
        System.out.println("B. Berapa nilai pencayahan kelas");
        System.out.print("jawab : ");
        kondisi.setPencayahan(scan.nextInt());
        kondisi.pencayahan();
                
        System.out.println("C. Berapa nilai kelembapan kelas");
        System.out.print("jawab : ");
        kondisi.setKelembapan(scan.nextInt());
        kondisi.kelembapan();
        
        System.out.println("D. Berapa nilai suhu ruangan");
        System.out.print("jawab : ");
        kondisi.setSuhu(scan.nextInt());
        kondisi.suhu();
    }
    void kondisi_Kenyamanan (){
        Kenyamanan kondisi = new Kenyamanan();
        
        /*kondisi.setKebisingan("tidak");
        kondisi.setBau("tidak");
        kondisi.setKebocoran("tidak");
        kondisi.setKeausan("tidak aus");
        kondisi.setKerusakan("tidak");
        kondisi.setKekokohan("kokoh");
        kondisi.setKunci_jendela("ada");
        kondisi.setKunci_pintu("ada");
        kondisi.setBahaya("aman");*/
        
        System.out.println("Tahap Kenyamanan Ruang Kelas \n");
        System.out.println("A. Apakah di kelas bising");
        System.out.println("1. Bising");
        System.out.println("2. Tidak Bising");
        System.out.print("Jawab : ");
        kondisi.setKebisingan(scan.nextInt());
        kondisi.kebisingan();
        
        System.out.println("B. Apakah di kelas bau");
        System.out.println("1. Bau");
        System.out.println("2. Tidak Bau");
        System.out.print("Jawab : ");
        kondisi.setBau(scan.nextInt());
        kondisi.bau();
        
        System.out.println("C. Apakah di kelas ada yang bocor");
        System.out.println("1. Ada ");
        System.out.println("2. Tidak Ada");
        System.out.print("Jawab : ");
        kondisi.setKebocoran(scan.nextInt());
        kondisi.kebocoran();
        
        
        System.out.println("D. Apakah di kelas ada aus");
        System.out.println("1. Ada ");
        System.out.println("2. Tidak Ada");
        System.out.print("Jawab : ");
        kondisi.setKeausan(scan.nextInt());
        kondisi.keausan();
        
        System.out.println("E. Apakah di kelas ada yang rusak");
        System.out.println("1. Ada ");
        System.out.println("2. Tidak Ada ");
        System.out.print("Jawab : ");
        kondisi.setKerusakan(scan.nextInt());
        kondisi.kerusakan();
        
        System.out.println("F. Apakah kelas masih kokoh");
        System.out.println("1. Masih Kokoh");
        System.out.println("2. Tidak Kokoh");
        System.out.print("Jawab : ");
        kondisi.setKekokohan(scan.nextInt());
        kondisi.kekokohan();
        
        kondisi.kunci();
        
        System.out.println("I. Apakah di kelas ada Bahaya");
        System.out.println("1. Aman");
        System.out.println("2. Tidak Aman");
        System.out.print("Jawab : ");
        kondisi.setBahaya(scan.nextInt());
        kondisi.keamanan();
    }
}
