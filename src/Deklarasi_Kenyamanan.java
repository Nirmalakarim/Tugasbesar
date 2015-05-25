
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NirmalaKarim
 */
public class Deklarasi_Kenyamanan{
    Scanner scan = new Scanner(System.in);
    void deklarasi(){
        deklarasi_kenyamanan(new Kenyamanan("Tahap Kondisi Kenyamanan"));
        deklarasi_keamanan(new Kenyamanan("Tahap Kondisi Keamanan"));      
    }
    public void deklarasi_kenyamanan(Kenyamanan test) {
        test.deklarasi1();
    }
    public void deklarasi_keamanan(Kenyamanan test) {
        test.setKondisiKenyamanan(1, 1, 1, 1);
        System.out.println(test.kondisi);
        System.out.println("A. Apakah kelas masih kokoh ?");
        System.out.println("1. Masih Kokoh");
        System.out.println("2. Tidak Kokoh");
        System.out.print("Jawab : ");
        test.setPilih_kekokohan(scan.nextInt());
        System.out.println("Kekokohan :"+test.kekokohan());
        
        System.out.println("B. Bagaimana keaadaan kunci pintu ?");
        System.out.println("1. Ada");
        System.out.println("2. Tidak ada");
        System.out.print("Jawab : ");
        test.setPilih_kuncipintu(scan.nextInt());
        
        System.out.println("C. Bagaimana keaadaan kunci jendela ?");
        System.out.println("1. Ada");
        System.out.println("2. Tidak ada");
        System.out.print("Jawab : ");
        test.setPilih_kuncijendela(scan.nextInt());
        System.out.println("Analisis kunci pintu dan jendela :"+test.kunci());
        
        System.out.println("D. Apakah di kelas ada Bahaya ?");
        System.out.println("1. Aman");
        System.out.println("2. Tidak Aman");
        System.out.print("Jawab : ");
        test.setPilih_bahaya(scan.nextInt());
        System.out.println("Keamanan :"+test.keamanan());
    }
}
