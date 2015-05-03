
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
    
  
    void kebersihan (){
        
        System.out.println("A. Bagaimana keaadaan lantai");
        System.out.println("1. bersih ");
        System.out.println("2. tidak bersih");
        System.out.print("Jawab : ");
        setLantai(scan.nextInt());
        switch(getLantai()){
            case 1:
                System.out.println("sesuai \n");        
                break;
            case 2:
                System.out.println("tidak sesuai \n");
        }
        
        System.out.println("B. Bagaimana keaadaan dinding");
        System.out.println("1. bersih");
        System.out.println("2. tidak bersih");
        System.out.print("Jawab : ");
        setDinding(scan.nextInt());
        switch(getDinding()){
            case 1:
                System.out.println("sesuai \n");        
                break;
            case 2:
                System.out.println("tidak sesuai \n");
        }
        
        System.out.println("C. Bagaimana keaadaan atap");
        System.out.println("1. bersih");
        System.out.println("2. tidak bersih");
        System.out.print("Jawab : ");
        setAtap(scan.nextInt());
        switch(getAtap()){
            case 1:
                System.out.println("sesuai \n");        
                break;
            case 2:
                System.out.println("tidak sesuai \n");
        }
        
        System.out.println("D. Bagaimana keaadaan pintu");
        System.out.println("1. bersih");
        System.out.println("2. tidak bersih");
        System.out.print("Jawab : ");
        setPintu(scan.nextInt());
        switch(getPintu()){
            case 1:
                System.out.println("sesuai \n");        
                break;
            case 2:
                System.out.println("tidak sesuai \n");
        }
        
        System.out.println("E. Bagaimana keaadaan jendela");
        System.out.println("1. bersih");
        System.out.println("2. tidak bersih");
        System.out.print("Jawab : ");
        setJendela(scan.nextInt());
        switch(getJendela()){
            case 1:
                System.out.println("sesuai \n");        
                break;
            case 2:
                System.out.println("tidak sesuai \n");
        }
    }
    void sirkualsi_udara (){    
        switch(getSirkulasi_udara()){
            case 1:
                System.out.println("sesuai \n");        
                break;
            case 2:
                System.out.println("tidak sesuai \n");
        }
    }
    void pencayahan(){
        if(getPencayahan()>=250 && getPencayahan()<=350){
            System.out.println("sesuai \n");
        } else{
            System.out.println("tidak sesuai \n");
        }
    }
    void kelembapan(){
        if (getKelembapan()>=70 && getKelembapan()<=80){
            System.out.println("sesuai \n");
        } else{
            System.out.println("tidak sesuai \n");
        }
    }
    void suhu(){
        if (getSuhu()>=25 && getSuhu()<=35){
            System.out.println("sesuai \n");
        }else {
            System.out.println("tidak sesuai \n");
        }
    }
}
