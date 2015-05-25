
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author NirmalaKarim
 */
public class Lingkungan extends Ruangkelas implements deklarasi{
    int pilih_atap;
    int pilih_dinding;
    int pilih_jendela;
    int pilih_pintu;
    int pilih_lantai;
    int pilih_sirkulasi;
    public Lingkungan(String kondisi) {//konstraktor
        super(kondisi);
    }
    
    @Override//override
    public void setKondisiLingkungan(int lantai, int dinding, int atap, int pintu, int jendela) {
        super.setKondisiLingkungan(lantai, dinding, atap, pintu, jendela);
    }

    @Override//override
    public void setKondisiLingkungan(int sirkulasi_udara) {
        super.setKondisiLingkungan(sirkulasi_udara);
    }
    
    
    //enkapsulasi
    public int getPilih_atap() {
        return pilih_atap;
    }

    public void setPilih_atap(int pilih_atap) {
        this.pilih_atap = pilih_atap;
    }

    public int getPilih_dinding() {
        return pilih_dinding;
    }

    public void setPilih_dinding(int pilih_dinding) {
        this.pilih_dinding = pilih_dinding;
    }

    public int getPilih_jendela() {
        return pilih_jendela;
    }

    public void setPilih_jendela(int pilih_jendela) {
        this.pilih_jendela = pilih_jendela;
    }

    public int getPilih_pintu() {
        return pilih_pintu;
    }

    public void setPilih_pintu(int pilih_pintu) {
        this.pilih_pintu = pilih_pintu;
    }

    public int getPilih_lantai() {
        return pilih_lantai;
    }

    public void setPilih_lantai(int pilih_lantai) {
        this.pilih_lantai = pilih_lantai;
    }

    public int getPilih_sirkulasi() {
        return pilih_sirkulasi;
    }

    public void setPilih_sirkulasi(int pilih_sirkulasi) {
        this.pilih_sirkulasi = pilih_sirkulasi;
    }
    
    public int getPencayahan() {
        return pencayahan;
    }

    public void setPencayahan(int pencayahan) {
        this.pencayahan = pencayahan;
    }

    public int getKelembapan() {
        return kelembapan;
    }

    public void setKelembapan(int kelembapan) {
        this.kelembapan = kelembapan;
    }

    public int getSuhu() {
        return suhu;
    }

    public void setSuhu(int suhu) {
        this.suhu = suhu;
    }
    

    @Override
    void deklarasi1() {
        setKondisiLingkungan(1, 1, 1, 1, 1);
        System.out.println(kondisi);
        System.out.println("A. Bagaimana keaadaan lantai");
        System.out.println("1. bersih ");
        System.out.println("2. tidak bersih");
        System.out.print("Jawab : ");
        setPilih_lantai(scan.nextInt());
        System.out.println("Kondisi lantai :"+string1());
        
        System.out.println("B. Bagaimana keaadaan dinding");
        System.out.println("1. bersih");
        System.out.println("2. tidak bersih");
        System.out.print("Jawab : ");
        setPilih_dinding(scan.nextInt());
        System.out.println("Kondisi dinding :"+string2());
                
        System.out.println("C. Bagaimana keaadaan atap");
        System.out.println("1. bersih");
        System.out.println("2. tidak bersih");
        System.out.print("Jawab : ");  
        setPilih_atap(scan.nextInt());
        System.out.println("Kondisi atap :"+string3());
        
        System.out.println("D. Bagaimana keaadaan pintu");
        System.out.println("1. bersih");
        System.out.println("2. tidak bersih");
        System.out.print("Jawab : ");
        setPilih_pintu(scan.nextInt());
        System.out.println("Kondisi pintu :"+string4());
        
        System.out.println("E. Bagaimana keaadaan jendela");
        System.out.println("1. bersih");
        System.out.println("2. tidak bersih");
        System.out.print("Jawab : ");
        setPilih_jendela(scan.nextInt());
        System.out.println("Kondisi jendela :"+string5());
    }

    @Override
    public void deklarasi2() {
        System.out.println(kondisi);
        setKondisiLingkungan(1);
        System.out.println("A. Bagaimana sirkulasi udara kelas");
        System.out.println("1. lancar");
        System.out.println("2. tidak lancar");
        System.out.print("Jawab : ");
        setPilih_sirkulasi(scan.nextInt());
        System.out.println("Sirkulasi udara : "+string6());
        
        System.out.println("B. Berapa nilai pencayahan kelas");
        System.out.print("jawab : ");
        setPencayahan(scan.nextInt());
        System.out.println("Pencayahan :"+pencayahan());
                
        System.out.println("C. Berapa nilai kelembapan kelas");
        System.out.print("jawab : ");
        setKelembapan(scan.nextInt());
        System.out.println("Kelembapan :"+kelembapan());
        
        System.out.println("D. Berapa nilai suhu ruangan");
        System.out.print("jawab : ");
        setSuhu(scan.nextInt());
        System.out.println("Suhu :"+suhu());
    }
    
    
    
    @Override
    String string1() {   //kebersihan lantai   
        a=getPilih_lantai();
        b=lantai;
        return super.string1();
    }

    @Override
    String string2() {//kebersihan dinding
        a=getPilih_dinding();
        b=dinding;
        return super.string2();
    }
    
    @Override
    String string3() {//kebersihan atap
        a=getPilih_atap();
        b=atap;
        return super.string3();
    }

    @Override
    String string4() {// kebersihan pintu
        a=getPilih_pintu();
        b=pintu;
        return super.string4();
    }

    @Override
    String string5() {//kebersihan jendela
        a=getPilih_jendela();
        b=jendela;
        return super.string5();
    }

    @Override
    String string6() {//sirkulasi udara
        a=getPilih_sirkulasi();
        b=sirkulasi_udara;
        return super.string6();
    }
    
    String pencayahan(){
        String pilih;
        if(getPencayahan()>=250 && getPencayahan()<=350){
            pilih = "sesuai";
        }else{
            pilih = "tidak sesuai";
        }
        return pilih;
    }
    String kelembapan(){
        String pilih;
        if(getKelembapan()>=70 && getKelembapan()<=80){
            pilih="sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String suhu(){
        String pilih;
        if(getSuhu()>=25 && getSuhu()<=35){
            pilih = "sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
}

