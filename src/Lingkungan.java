
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NirmalaKarim
 */
public class Lingkungan extends Ruangkelas{
    int pilih_atap;
    int pilih_dinding;
    int pilih_jendela;
    int pilih_pintu;
    int pilih_lantai;
    int pilih_sirkulasi;

    public Lingkungan(String kondisi) {
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
    
    //untuk mengembalikan nilai
    String kebersihan_atap(){
        String pilih;
        if(getPilih_atap()==atap){
            pilih = "sesuai";
        }else{
            pilih = "tidak sesuai";
        }
        return pilih;
    }
    String kebersihan_dinding(){
        String pilih;
        if(getPilih_dinding()==dinding){
            pilih = "sesuai";
        }else{
            pilih = "tidak sesuai";
        }
        return pilih;
    }
    String kebersihan_jendela(){
        String pilih;
        if(getPilih_jendela()==jendela){
            pilih = "sesuai";
        }else{
            pilih = "tidak sesuai";
        }
        return pilih;
    }
    String kebersihan_lantai(){
        String pilih;
        if(getPilih_lantai()==lantai){
            pilih = "sesuai";
        }else{
            pilih = "tidak sesuai";
        }
        return pilih;
    }
    String kebersihan_pintu(){
        String pilih;
        if(getPilih_pintu()==pintu){
            pilih = "sesuai";
        }else{
            pilih = "tidak sesuai";
        }
        return pilih;
    }
    String sirkulasi_udara(){
        String pilih;
        if(getPilih_sirkulasi()==sirkulasi_udara){
            pilih = "sesuai";
        } else{
            pilih = "tidak sesuai";
        }
        return pilih;
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
