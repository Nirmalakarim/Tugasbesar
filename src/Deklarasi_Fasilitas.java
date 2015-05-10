public class Deklarasi_Fasilitas extends Fasilitas{
   void analisa_sarana(){
        Ruangkelas x = new Ruangkelas();
        x.setUsername("tugasbesar");
        x.setPasword("12345");
        System.out.println("Tahap Jumlah, Kondisi, Posisi Sarana \n");
        System.out.println("A. Berapa Jumlah Steker");
        System.out.print("Jawab :");
        super.setJumlahsteker(scan.nextInt());
        System.out.println("Jumlah steker :"+JumlahSteker());
        System.out.println("B. Bagaimana Kondisi steker");
        System.out.println("1. Baik");
        System.out.println("2. Buruk");
        System.out.print("Jawab :");
        super.setKondisisteker(scan.nextInt());
        System.out.println("Kondisi steker :"+kondisiSteker());
        System.out.println("C. Dimana posisi steker");
        System.out.println("1. pojok ruangan ");
        System.out.println("2. dekat dosen");
        System.out.println("3. atap");
        System.out.print("Jawab :");
        super.setPosisisteker(scan.nextInt());
        System.out.print("dan ");
        super.setPosisisteker(scan.nextInt());
        System.out.println("Posisi steker "+posisiSteker());
        
        System.out.println("D. Berapa Jumlah Kabel LCD");
        System.out.print("Jawab :");
        super.setJumlahkabelLCD(scan.nextInt());
        System.out.println("Jumlah kabel LCD :"+JumlahKabelLCD());
        System.out.println("E. Bagaimana Kondisi Kabel LCD");
        System.out.println("1. Berfungsi");
        System.out.println("2. Tidak Berfungsi");
        System.out.print("Jawab :");
        super.setKondisikabelLCD(scan.nextInt());
        System.out.println("Kondisi Kabel LCD :"+KondisiKabelLCD());
        System.out.println("F. Dimana posisi Kabel LCD");
        System.out.println("1. pojok ruangan ");
        System.out.println("2. dekat dosen");
        System.out.println("3. atap");
        System.out.print("Jawab :");
        super.setPosisikabelLCD(scan.nextInt());
        System.out.println("Posisi Kabel LCD "+PosisiKabelLCD());
        
        System.out.println("G. Berapa Jumlah Lampu");
        System.out.print("Jawab :");
        super.setJumlahlampu(scan.nextInt());
        System.out.println("Jumlah Lampu :"+JumlahLampu());
        System.out.println("H. Bagaimana Kondisi Lampu");
        System.out.println("1. Baik");
        System.out.println("2. Buruk");
        System.out.print("Jawab :");
        super.setKondisilampu(scan.nextInt());
        System.out.println("Kondisi Lampu :"+KondisiLampu());
        System.out.println("I. Dimana posisi Lampu");
        System.out.println("1. pojok ruangan ");
        System.out.println("2. dekat dosen");
        System.out.println("3. atap ruangan");
        System.out.print("Jawab :");
        super.setPosisilampu(scan.nextInt());
        System.out.println("Posisi Lampu :"+PosisiLampu());
        
        System.out.println("J. Berapa Jumlah Kipas Angin");
        System.out.print("Jawab :");
        super.setJumlahkipasangin(scan.nextInt());
        System.out.println("Jumlah Kipas Angin :"+JumlahKipasAngin());
        System.out.println("K. Bagaimana Kondisi Kipas Angin");
        System.out.println("1. Baik");
        System.out.println("2. Buruk");
        System.out.print("Jawab :");
        super.setKondisikipasangin(scan.nextInt());
        System.out.println("Kondisi Kipas Angin :"+KondisiKipasAngin());
        System.out.println("L. Dimana posisi Kipas Angin");
        System.out.println("1. pojok ruangan ");
        System.out.println("2. dekat dosen");
        System.out.println("3. atap ruangan");
        System.out.print("Jawab :");
        super.setPosisikipasangin(scan.nextInt());
        System.out.println("Posisi Kipas Angin :"+PosisiKipasAngin());
        
        System.out.println("M. Berapa Jumlah AC");
        System.out.print("Jawab :");
        super.setJumlahAC(scan.nextInt());
        System.out.println("Jumlah AC :"+JumlahAC());
        System.out.println("N. Bagaimana Kondisi AC");
        System.out.println("1. Baik");
        System.out.println("2. Buruk");
        System.out.print("Jawab :");
        super.setKondisiAC(scan.nextInt());
        System.out.println("Kondisi AC :"+KondisiAC());
        System.out.println("O. Dimana posisi AC");
        System.out.println("1. Belakang ");
        System.out.println("2. Samping");
        System.out.println("3. Depan");
        System.out.print("Jawab :");
        super.setPosisiAC(scan.nextInt());
        System.out.println("Posisi AC :"+PosisiAC());
        
        System.out.println("P. Silahkan pilih SSID");
        System.out.println("1. UMM Hotspot");
        System.out.println("2. RiaJenaka");
        System.out.println("3. Otoy");
        System.out.print("Jawab :");
        super.setSSID(scan.nextInt());
        System.out.println("SSID :"+SSID());
        System.out.println("Q. Silahkan Login");
        System.out.print("Username :");
        x.username2=scan.next();
        System.out.print("Pasword");
        x.pasword2=scan.next();
        System.out.println("username :"+x.loginusername());
        System.out.println("Pasword :"+x.loginpasword());
        
        System.out.println("G. Berapa Jumlah CCTV");
        System.out.print("Jawab :");
        super.setJumlahCCTV(scan.nextInt());
        System.out.println("Jumlah CCTV :"+JumlahCCTV());
        System.out.println("H. Bagaimana Kondisi CCTV");
        System.out.println("1. Baik");
        System.out.println("2. Buruk");
        System.out.print("Jawab :");
        super.setKondisiCCTV(scan.nextInt());
        System.out.println("Kondisi CCTV :"+KondisiCCTV());
        System.out.println("I. Dimana posisi CCTV");
        System.out.println("1. Belakang ");
        System.out.println("2. Samping");
        System.out.println("3. Depan");
        System.out.print("Jawab :");
        super.setPosisiCCTV(scan.nextInt());
        System.out.println("Posisi CCTV :"+PosisiCCTV());
    }
    public static void main(String[] args) {
        Deklarasi_Fasilitas test = new Deklarasi_Fasilitas();
        test.analisa_sarana();
    }
}




