/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Progres6_Abstrak_Interface;

import Progres6_Abstrak_Interface.RuangKelas.deklarasi;

/**
 *
 * @author NirmalaKarim
 */
public class Identitas_kondisi extends RuangKelas implements deklarasi{
    
    public Identitas_kondisi(String kondisi) {
        super(kondisi);
    }

    @Override
    public String getPasword() {
        return super.getPasword();
    }

    @Override
    public String getUsername() {
        return super.getUsername();
    }
    
    
    public String getNama_ruang() {
        return Nama_ruang;
    }

    public void setNama_ruang(String Nama_ruang) {
        this.Nama_ruang = Nama_ruang;
    }

    public String getLokasi_ruang() {
        return Lokasi_ruang;
    }

    public void setLokasi_ruang(String Lokasi_ruang) {
        this.Lokasi_ruang = Lokasi_ruang;
    }

    public String getProdi() {
        return Prodi;
    }

    public void setProdi(String Prodi) {
        this.Prodi = Prodi;
    }

    public int getPanjang_ruang() {
        return Panjang_ruang;
    }

    public void setPanjang_ruang(int Panjang_ruang) {
        this.Panjang_ruang = Panjang_ruang;
    }

    public int getLebar_ruang() {
        return Lebar_ruang;
    }

    public void setLebar_ruang(int Lebar_ruang) {
        this.Lebar_ruang = Lebar_ruang;
    }

    public int getJumlah_kursi() {
        return Jumlah_kursi;
    }

    public void setJumlah_kursi(int Jumlah_kursi) {
        this.Jumlah_kursi = Jumlah_kursi;
    }

    public int getJumlah_jendela() {
        return Jumlah_jendela;
    }

    public void setJumlah_jendela(int Jumlah_jendela) {
        this.Jumlah_jendela = Jumlah_jendela;
    }

    
    public int getJumlah_pintu() {
        return jumlah_pintu;
    }

    public void setJumlah_pintu(int jumlah_pintu) {
        this.jumlah_pintu = jumlah_pintu;
    }

    @Override
    void deklarasi1() {
        System.out.println(kondisi);
        System.out.print("Masukan nama ruang :");
        setNama_ruang(scan.next());
        System.out.print("Masukan lokasi ruang :");
        setLokasi_ruang(scan.next());
        System.out.print("Masukan Jurusan anda :");
        setProdi(scan.next());
        
        System.out.println("================== \n");
        System.out.println("Nama ruang : "+getNama_ruang());
        System.out.println("Lokasi Ruang : "+getLokasi_ruang());
        System.out.println("Jurusan : "+getProdi());
    }

    @Override
    public void deklarasi2() {
        System.out.println(kondisi);
        System.out.println("A. Masukan panjang ruang ");
        System.out.print("Jawab :");
        setPanjang_ruang(scan.nextInt());
        System.out.println("B. Masukan lebar ruang ");
        System.out.print("Jawab :");
        setLebar_ruang(scan.nextInt());
        System.out.println("C. Luas : "+luas());
        System.out.println("D. Bentuk : "+bentuk());
        System.out.println("E. Masukan jumlah kursi");
        System.out.print("Jawab :");
        setJumlah_kursi(scan.nextInt());
        System.out.println("F. Rasio : "+rasio());
        System.out.println("Rasio : "+Analisis_rasio());
        System.out.println("G. Masukan jumlah pintu ");
        System.out.print("Jawab :");
        setJumlah_pintu(scan.nextInt());
        System.out.println("H. Masukan jumlah jendela");
        System.out.print("Jawab : ");
        setJumlah_jendela(scan.nextInt());
        System.out.println("Jumlah pintu dan jendela :"+analisisPintuDanJendela());
    }

    
    
    double luas (){        
        return getPanjang_ruang()*getLebar_ruang();
    }
    String bentuk(){
        String pilih;
        if(getPanjang_ruang()!=luas()){
            pilih="persegi panjang dan sesuai";
        } else{
            pilih="bukan persegi panjang";
        }
        return pilih;
    }
    
    double rasio(){
        return luas()/getJumlah_kursi();        
    }
    String analisisPintuDanJendela(){
        String satu;
                if(getJumlah_pintu() >=2&&getJumlah_jendela()>=1){
                    satu="sesuai";
                }
                else{
                    satu="Tidak sesuai";
                }
                return satu;
    }
    String Analisis_rasio(){
        String pilih;
        if(rasio()>=0.5){
            pilih="sesuai";
        }else {
            pilih="tidak sesuai";
        }
        return pilih;
    }
}
