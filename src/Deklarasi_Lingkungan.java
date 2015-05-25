
import java.util.Scanner;

public class Deklarasi_Lingkungan {
    Scanner scan = new Scanner(System.in);
    void deklarasi (){
        deklarasi_lingkungan (new Lingkungan("Tahap Kondisi Lingkungan"));
        deklarasi_kebersihan (new Lingkungan("Tahap Kondisi Kebersihan"));
    }    

    public void deklarasi_lingkungan(Lingkungan test) {
        test.deklarasi1();
    }
    public void deklarasi_kenyamanan(Kenyamanan test) {
        test.setKondisiKenyamanan(2, 2, 2, 2, 2);
        System.out.println(test.kondisi);
        System.out.println("A. Apakah di kelas bising ?");
        System.out.println("1. Bising");
        System.out.println("2. Tidak Bising");
        System.out.print("Jawab : ");
        test.setPilih_kebisingan(scan.nextInt());
        System.out.println("Kebisingan :"+test.kebisingan());
        
        System.out.println("B. Apakah di kelas bau ?");
        System.out.println("1. Bau");
        System.out.println("2. Tidak Bau");
        System.out.print("Jawab : ");
        test.setPilih_bau(scan.nextInt());
        System.out.println("Bau :"+test.bau());
               
        System.out.println("C. Apakah di kelas ada yang bocor ?"); 
        System.out.println("1. Ada ");
        System.out.println("2. Tidak Ada");
        System.out.print("Jawab : ");
        test.setPilih_kebocoran(scan.nextInt());
        System.out.println("Kebocoran :"+test.kebocoran());
        
        System.out.println("D. Apakah di kelas ada aus ?");
        System.out.println("1. Ada ");
        System.out.println("2. Tidak Ada");
        System.out.print("Jawab : ");
        test.setPilih_keausan(scan.nextInt());
        System.out.println("Keausan :"+test.keausan());
        
        System.out.println("E. Apakah di kelas ada yang rusak ?");
        System.out.println("1. Ada ");
        System.out.println("2. Tidak Ada ");
        System.out.print("Jawab : ");
        test.setPilih_kerusakan(scan.nextInt());
        System.out.println("Kerusakan :"+test.kerusakan());
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
