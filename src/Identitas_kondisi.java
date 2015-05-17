/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NirmalaKarim
 */
public class Identitas_kondisi extends Ruangkelas{

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