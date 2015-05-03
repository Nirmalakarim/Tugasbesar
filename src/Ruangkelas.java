/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NirmalaKarim
 */
public class Ruangkelas {
     private String Nama_ruang;
    private String Lokasi_ruang;
    private String Prodi;
    private int Panjang_ruang;
    private int Lebar_ruang;
    private int Jumlah_kursi;
    private int Jumlah_meja;
    private int Jumlah_jendela;
    private int jumlah_pintu;

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

    public int getJumlah_meja() {
        return Jumlah_meja;
    }

    public void setJumlah_meja(int Jumlah_meja) {
        this.Jumlah_meja = Jumlah_meja;
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
    
    double luas (){        
        return getPanjang_ruang()*getLebar_ruang();
    }
    void bentuk (){
        if (getPanjang_ruang()!=luas()){
            System.out.println("persegi panjang dan sesuai");
        }else {
            System.out.println("bukan persegi panjang");
        }
    }
    double rasio(){
        return luas()/getJumlah_kursi();        
    }
    void analisis (){
        System.out.println("Jumlah pintu : "+getJumlah_pintu());
        if(getJumlah_pintu()>=2){
            System.out.println("sesuai");
        } else {
            System.out.println("tidak sesuai");
        }
        System.out.println("Jumlah jendela : "+getJumlah_jendela());
        if(getJumlah_jendela()>=1){
            System.out.println("sesuai");
        }else{
            
            System.out.println("tidak sesuai");
        }
    }
}