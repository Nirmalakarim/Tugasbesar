
import java.util.Scanner;

public class Deklarasi_Fasilitas{
   Scanner scan = new Scanner(System.in);
    void deklarasi (){
        analisa_sarana(new Fasilitas("Tahap Jumlah, Kondisi, Posisi Sarana"));
    }

    public void analisa_sarana(Fasilitas kondisi) {
        kondisi.setFasilitas("TugasBesar", "java");
        kondisi.setFasilitas(2, 3, 3, 1);
        kondisi.setFasilitas(1, 1, 1, 1, 1, 1);
        System.out.println(kondisi.kondisi);
        System.out.println("A. Berapa Jumlah Steker");
        System.out.print("Jawab :");
        kondisi.setJumlahsteker(scan.nextInt());
        System.out.println("Jumlah steker :"+kondisi.JumlahSteker());
        System.out.println("B. Bagaimana Kondisi steker");
        System.out.println("1. Baik");
        System.out.println("2. Buruk");
        System.out.print("Jawab :");
        kondisi.setPilih_kondisisteker(scan.nextInt());
        System.out.println("Kondisi steker :"+kondisi.kondisiSteker());
        System.out.println("C. Dimana posisi steker");
        System.out.println("1. pojok ruangan ");
        System.out.println("2. dekat dosen");
        System.out.println("3. atap");
        System.out.print("Jawab :");
        kondisi.setPosisisteker(scan.nextInt());
        System.out.print("dan ");
        kondisi.setPosisisteker(scan.nextInt());
        System.out.println("Posisi steker "+kondisi.posisiSteker());
        
        System.out.println("D. Berapa Jumlah Kabel LCD");
        System.out.print("Jawab :");
        kondisi.setJumlahkabelLCD(scan.nextInt());
        System.out.println("Jumlah kabel LCD :"+kondisi.JumlahKabelLCD());
        System.out.println("E. Bagaimana Kondisi Kabel LCD");
        System.out.println("1. Berfungsi");
        System.out.println("2. Tidak Berfungsi");
        System.out.print("Jawab :");
        kondisi.setPilih_kondisikabel(scan.nextInt());
        System.out.println("Kondisi Kabel LCD :"+kondisi.KondisiKabelLCD());
        System.out.println("F. Dimana posisi Kabel LCD");
        System.out.println("1. pojok ruangan ");
        System.out.println("2. dekat dosen");
        System.out.println("3. atap");
        System.out.print("Jawab :");
        kondisi.setPilih_posisikabel(scan.nextInt());
        System.out.println("Posisi Kabel LCD "+kondisi.PosisiKabelLCD());
        
        System.out.println("G. Berapa Jumlah Lampu");
        System.out.print("Jawab :");
        kondisi.setJumlahlampu(scan.nextInt());
        System.out.println("Jumlah Lampu :"+kondisi.JumlahLampu());
        System.out.println("H. Bagaimana Kondisi Lampu");
        System.out.println("1. Baik");
        System.out.println("2. Buruk");
        System.out.print("Jawab :");
        kondisi.setPilih_kondisilampu(scan.nextInt());
        System.out.println("Kondisi Lampu :"+kondisi.KondisiLampu());
        System.out.println("I. Dimana posisi Lampu");
        System.out.println("1. pojok ruangan ");
        System.out.println("2. dekat dosen");
        System.out.println("3. atap ruangan");
        System.out.print("Jawab :");
        kondisi.setPilih_posisilampu(scan.nextInt());
        System.out.println("Posisi Lampu :"+kondisi.PosisiLampu());
        
        System.out.println("J. Berapa Jumlah Kipas Angin");
        System.out.print("Jawab :");
        kondisi.setJumlahkipasangin(scan.nextInt());
        System.out.println("Jumlah Kipas Angin :"+kondisi.JumlahKipasAngin());
        System.out.println("K. Bagaimana Kondisi Kipas Angin");
        System.out.println("1. Baik");
        System.out.println("2. Buruk");
        System.out.print("Jawab :");
        kondisi.setPilih_kondisikipas(scan.nextInt());
        System.out.println("Kondisi Kipas Angin :"+kondisi.KondisiKipasAngin());
        System.out.println("L. Dimana posisi Kipas Angin");
        System.out.println("1. pojok ruangan ");
        System.out.println("2. dekat dosen");
        System.out.println("3. atap ruangan");
        System.out.print("Jawab :");
        kondisi.setPilih_posisikipas(scan.nextInt());
        System.out.println("Posisi Kipas Angin :"+kondisi.PosisiKipasAngin());
        
        System.out.println("M. Berapa Jumlah AC");
        System.out.print("Jawab :");
        kondisi.setJumlahAC(scan.nextInt());
        System.out.println("Jumlah AC :"+kondisi.JumlahAC());
        System.out.println("N. Bagaimana Kondisi AC");
        System.out.println("1. Baik");
        System.out.println("2. Buruk");
        System.out.print("Jawab :");
        kondisi.setPilih_kondisiac(scan.nextInt());
        System.out.println("Kondisi AC :"+kondisi.KondisiAC());
        System.out.println("O. Dimana posisi AC");
        System.out.println("1. Belakang ");
        System.out.println("2. Atap");
        System.out.println("3. Depan");
        System.out.print("Jawab :");
        kondisi.setPilih_posisiac(scan.nextInt());
        System.out.println("Posisi AC :"+kondisi.PosisiAC());
        
        System.out.println("P. Silahkan pilih SSID");
        System.out.println("1. UMM Hotspot");
        System.out.println("2. RiaJenaka");
        System.out.println("3. Otoy");
        System.out.print("Jawab :");
        kondisi.setSSID(scan.nextInt());
        System.out.println("SSID :"+kondisi.SSID());
        System.out.println("Q. Silahkan Login");
        System.out.print("Username :");
        kondisi.pilih_username=scan.next();
        System.out.print("Pasword");
        kondisi.pilih_pasword=scan.next();
        System.out.println("username :"+kondisi.loginusername());
        System.out.println("Pasword :"+kondisi.loginpasword());
        
        System.out.println("G. Berapa Jumlah CCTV");
        System.out.print("Jawab :");
        kondisi.setJumlahCCTV(scan.nextInt());
        System.out.println("Jumlah CCTV :"+kondisi.JumlahCCTV());
        System.out.println("H. Bagaimana Kondisi CCTV");
        System.out.println("1. Baik");
        System.out.println("2. Buruk");
        System.out.print("Jawab :");
        kondisi.setPilih_kondisicctv(scan.nextInt());
        System.out.println("Kondisi CCTV :"+kondisi.KondisiCCTV());
        System.out.println("I. Dimana posisi CCTV");
        System.out.println("1. Belakang ");
        System.out.println("2. Samping");
        System.out.println("3. Depan");
        System.out.print("Jawab :");
        kondisi.setPosisiCCTV(scan.nextInt());
        System.out.println("Posisi CCTV :"+kondisi.PosisiCCTV());
    }
}




