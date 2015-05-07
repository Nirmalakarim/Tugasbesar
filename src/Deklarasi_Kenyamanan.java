/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NirmalaKarim
 */
public class Deklarasi_Kenyamanan extends Kenyamanan{
    void deklarasi_kenyamanan(){
               
        System.out.println("Tahap Kenyamanan Ruang Kelas \n");
        System.out.println("A. Apakah di kelas bising");
        System.out.println("1. Bising");
        System.out.println("2. Tidak Bising");
        System.out.print("Jawab : ");
        super.setKebisingan(scan.nextInt());
        System.out.println("Kebisingan :"+kebisingan());
        
        System.out.println("B. Apakah di kelas bau");
        System.out.println("1. Bau");
        System.out.println("2. Tidak Bau");
        System.out.print("Jawab : ");
        super.setBau(scan.nextInt());
        System.out.println("Bau :"+bau());
               
        System.out.println("C. Apakah di kelas ada yang bocor");
        System.out.println("1. Ada ");
        System.out.println("2. Tidak Ada");
        System.out.print("Jawab : ");
        super.setKebocoran(scan.nextInt());
        System.out.println("Kebocoran :"+kebocoran());
        
        System.out.println("D. Apakah di kelas ada aus");
        System.out.println("1. Ada ");
        System.out.println("2. Tidak Ada");
        System.out.print("Jawab : ");
        super.setKeausan(scan.nextInt());
        System.out.println("Keausan :"+keausan());
        
        System.out.println("E. Apakah di kelas ada yang rusak");
        System.out.println("1. Ada ");
        System.out.println("2. Tidak Ada ");
        System.out.print("Jawab : ");
        super.setKerusakan(scan.nextInt());
        System.out.println("Kerusakan :"+kerusakan());
        
    }
    void deklarasi_keamanan(){
        System.out.println("\nTahap Keamanan Ruang kelas \n");
        System.out.println("A. Apakah kelas masih kokoh");
        System.out.println("1. Masih Kokoh");
        System.out.println("2. Tidak Kokoh");
        System.out.print("Jawab : ");
        super.setKekokohan(scan.nextInt());
        System.out.println("Kekokohan :"+kekokohan());
        
        System.out.println("B. Bagaimana keaadaan kunci pintu");
        System.out.println("1. Ada");
        System.out.println("2. Tidak ada");
        System.out.print("Jawab : ");
        super.setKunci_pintu(scan.nextInt());
        
        System.out.println("C. Bagaimana keaadaan kunci jendela");
        System.out.println("1. Ada");
        System.out.println("2. Tidak ada");
        System.out.print("Jawab : ");
        super.setKunci_jendela(scan.nextInt());
        System.out.println("Analisis kunci pintu dan jendela :"+kunci());
        
        System.out.println("D. Apakah di kelas ada Bahaya");
        System.out.println("1. Aman");
        System.out.println("2. Tidak Aman");
        System.out.print("Jawab : ");
        super.setBahaya(scan.nextInt());
        System.out.println("Keamanan :"+keamanan());
    }
    public static void main(String[] args) {
        Deklarasi_Kenyamanan n =  new Deklarasi_Kenyamanan();
        n.deklarasi_kenyamanan();
        n.deklarasi_keamanan();
    }
    
}
