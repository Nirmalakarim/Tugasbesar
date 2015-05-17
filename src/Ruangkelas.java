
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NirmalaKarim
 */
public class Ruangkelas {
    Scanner scan = new Scanner(System.in);
    String Nama_ruang;
    String Lokasi_ruang;
    String Prodi;
    int Panjang_ruang;
    int Lebar_ruang;
    int Jumlah_kursi;
    int Jumlah_meja;
    int Jumlah_jendela;
    int jumlah_pintu;
    String Username;
    String pasword;
    int Jumlahsteker;
    int kondisisteker;
    int posisisteker;
    int jumlahkabelLCD;
    int kondisikabelLCD;
    int posisikabelLCD;
    int jumlahlampu;
    int kondisilampu;
    int posisilampu;
    int jumlahkipasangin;
    int kondisikipasangin;
    int posisikipasangin;
    int jumlahAC;
    int kondisiAC;
    int posisiAC;
    int SSID;
    int bandwidth;
    int jumlahCCTV;
    int kondisiCCTV;
    int posisiCCTV;
    int kebisingan;
    int bau;
    int kebocoran;
    int keausan;
    int kerusakan;
    int kekokohan;
    int kunci_pintu;
    int kunci_jendela;
    int bahaya;
    int lantai;
    int dinding;
    int atap;
    int pintu;
    int jendela;
    int sirkulasi_udara;
    int pencayahan;
    int kelembapan;
    int suhu;
    String kondisi;

    public Ruangkelas(String kondisi) {
        this.kondisi = kondisi;
    }
    
    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }
    
    public void setFasilitas (int kondisisteker, int kondisikabelLCD, int kondisilampu, int kondisikipasangin, int kondisiAC, int kondisiCCTV){
        this.kondisisteker=kondisisteker;
        this.kondisikabelLCD=kondisikabelLCD;
        this.kondisilampu= kondisilampu;
        this.kondisikipasangin=kondisikipasangin;
        this.kondisiAC=kondisiAC;
        this.kondisiCCTV=kondisiCCTV;
    }
    public void setFasilitas (int posisikabelLCD, int posisilampu, int posisikipasangin, int posisiAC){
        this.posisikabelLCD=posisikabelLCD;
        this.posisilampu=posisilampu;
        this.posisikipasangin=posisikipasangin;
        this.posisiAC=posisiAC;
    }
    public void setFasilitas(String username, String pasword){
        this.Username=username;
        this.pasword=pasword;
    }
    public void setKondisiLingkungan(int lantai, int dinding, int atap, int pintu, int jendela){//overloading
        this.atap=atap;
        this.dinding=dinding;
        this.lantai=lantai;
    }
    public void setKondisiLingkungan(int sirkulasi_udara){
        this.sirkulasi_udara=sirkulasi_udara;
    }
    public void setKondisiKenyamanan(int kebisingan, int bau, int kebocoran, int kerusakan, int keausan){
        this.kebisingan=kebisingan;
        this.bau=bau;
        this.kebocoran=kebocoran;
        this.kerusakan=kerusakan;
        this.keausan=keausan;
    }
    public void setKondisiKenyamanan(int kekokohan, int kunci_pintu, int kunci_jendela, int bahaya){
        this.kekokohan=kekokohan;
        this.kunci_pintu=kunci_pintu;
        this.kunci_jendela=kunci_jendela;
        this.bahaya=bahaya;
    }
}
