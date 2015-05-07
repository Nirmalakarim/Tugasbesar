public class Deklarasi_Lingkungan extends Lingkungan{
    public static void main(String[] args) {
   Deklarasi_Lingkungan n = new Deklarasi_Lingkungan();
   n.kondisi_lingkungan();
   n.kondisi_kebersihan();
}
    void kondisi_lingkungan(){        
        Lingkungan kondisi = new Lingkungan();
        System.out.println("Tahap Kondisi Lingkungan kelas \n");
        System.out.println("A. Bagaimana keaadaan lantai");
        System.out.println("1. bersih ");
        System.out.println("2. tidak bersih");
        System.out.print("Jawab : ");
        super.setLantai(scan.nextInt());
        
        System.out.println("B. Bagaimana keaadaan dinding");
        System.out.println("1. bersih");
        System.out.println("2. tidak bersih");
        System.out.print("Jawab : ");
        super.setDinding(scan.nextInt()); 
        
        System.out.println("C. Bagaimana keaadaan atap");
        System.out.println("1. bersih");
        System.out.println("2. tidak bersih");
        System.out.print("Jawab : ");
        super.setAtap(scan.nextInt());
        
        System.out.println("D. Bagaimana keaadaan pintu");
        System.out.println("1. bersih");
        System.out.println("2. tidak bersih");
        System.out.print("Jawab : ");
        super.setPintu(scan.nextInt());
        
        System.out.println("E. Bagaimana keaadaan jendela");
        System.out.println("1. bersih");
        System.out.println("2. tidak bersih");
        System.out.print("Jawab : ");
        super.setJendela(scan.nextInt());
        
        System.out.print("Keaadaan kebersihan kelas = ");
        System.out.println(kebersihan());
        
        
    }
    void kondisi_kebersihan (){
        System.out.println("Tahap Kebersihan Ruang kelas \n");
        System.out.println("A. Bagaimana sirkulasi udara kelas");
        System.out.println("1. lancar");
        System.out.println("2. tidak lancar");
        System.out.print("Jawab : ");
        super.setSirkulasi_udara(scan.nextInt());
        System.out.println("sirkulasi udara :"+sirkualsi_udara());
        
        System.out.println("B. Berapa nilai pencayahan kelas");
        System.out.print("jawab : ");
        super.setPencayahan(scan.nextInt());
        System.out.println(pencayahan());
                
        System.out.println("C. Berapa nilai kelembapan kelas");
        System.out.print("jawab : ");
        super.setKelembapan(scan.nextInt());
        System.out.println("Kelembapan :"+kelembapan());
        
        System.out.println("D. Berapa nilai suhu ruangan");
        System.out.print("jawab : ");
        super.setSuhu(scan.nextInt());
        System.out.println("Suhu :"+suhu());
    }
}
