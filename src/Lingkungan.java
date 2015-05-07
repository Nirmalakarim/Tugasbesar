
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NirmalaKarim
 */
public class Lingkungan {
    Scanner scan = new Scanner(System.in);
    private int lantai;
    private int dinding;
    private int atap;
    private int pintu;
    private int jendela;
    private int sirkulasi_udara;
    private int pencayahan;
    private int kelembapan;
    private int suhu;

    public int getLantai() {
        return lantai;
    }

    public void setLantai(int lantai) {
        this.lantai = lantai;
    }

    public int getDinding() {
        return dinding;
    }

    public void setDinding(int dinding) {
        this.dinding = dinding;
    }

    public int getAtap() {
        return atap;
    }

    public void setAtap(int atap) {
        this.atap = atap;
    }

    public int getPintu() {
        return pintu;
    }

    public void setPintu(int pintu) {
        this.pintu = pintu;
    }

    public int getJendela() {
        return jendela;
    }

    public void setJendela(int jendela) {
        this.jendela = jendela;
    }

    public int getSirkulasi_udara() {
        return sirkulasi_udara;
    }

    public void setSirkulasi_udara(int sirkulasi_udara) {
        this.sirkulasi_udara = sirkulasi_udara;
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
    
  
    String kebersihan (){
       String pilih;
        if(getDinding()==1 && getAtap()==1 && getLantai()==1 && getPintu()==1 && getJendela()==1){
            pilih = "sesuai";
        }else{
            pilih = "tidak sesuai";
        }
        return pilih;
    }
    String sirkualsi_udara (){    
        String pilih;
        if(getSirkulasi_udara()==1){
            pilih = "sesuai";
        } else{
            pilih = "tidak sesuai";
        }
        return pilih;
    }
    String pencayahan(){
        String pilih;
        if(getPencayahan()>=250 && getPencayahan()<=350){
            pilih="sesuai";
        } else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String kelembapan(){
        String pilih;
        if (getKelembapan()>=70 && getKelembapan()<=80){
            pilih="sesuai";
        } else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String suhu(){
        String pilih;
        if (getSuhu()>=25 && getSuhu()<=35){
            pilih="sesuai";
        }else {
            pilih="tidak sesuai";
        }
        return pilih;
    }
}
