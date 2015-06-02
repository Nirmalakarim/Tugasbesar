/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author NirmalaKarim
 */
public class Lingkungan extends Ruangkelas implements Deklarasi{
    private int pilih_atap;
    private int pilih_dinding;
    private int pilih_jendela;
    private int pilih_pintu;
    private int pilih_lantai;
    private int pilih_sirkulasi;
    public Lingkungan(String kondisi) {//konstraktor
        super(kondisi);
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
    
    @Override
    void deklarasi1() {
        setKondisiLingkungan(1, 1, 1, 1, 1);
        System.out.println(getKondisi());
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
            try(FileOutputStream fs = new FileOutputStream("penyimpanan.txt")){
                ObjectOutputStream os;
                os = new ObjectOutputStream(fs);
                os.writeObject(getPilih_lantai());
                os.writeObject(getPilih_dinding());
                os.writeObject(getPilih_jendela());
                os.writeObject(getPilih_atap());
                os.writeObject(getPilih_pintu());
                os.close();
                
            } catch(IOException e){
                e.printStackTrace();
            }
    }

    @Override
    public void deklarasi2() {
        System.out.println(getKondisi());
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
        
        try(FileOutputStream fs = new FileOutputStream("penyimpanan.txt")){
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(getPilih_sirkulasi());
            os.writeObject(getPencayahan());
            os.writeObject(getKelembapan());
            os.writeObject(getSuhu());
            os.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    
    
    @Override
    String string1() {   //kebersihan lantai   
        a=getPilih_lantai();
        b=getLantai();
        return super.string1();
    }

    @Override
    String string2() {//kebersihan dinding
        a=getPilih_dinding();
        b=getDinding();
        return super.string2();
    }
    
    @Override
    String string3() {//kebersihan atap
        a=getPilih_atap();
        b=getAtap();
        return super.string3();
    }

    @Override
    String string4() {// kebersihan pintu
        a=getPilih_pintu();
        b=getPintu();
        return super.string4();
    }

    @Override
    String string5() {//kebersihan jendela
        a=getPilih_jendela();
        b=getJendela();
        return super.string5();
    }

    @Override
    String string6() {//sirkulasi udara
        a=getPilih_sirkulasi();
        b=getSirkulasi_udara();
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
