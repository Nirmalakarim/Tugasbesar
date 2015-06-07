import java.io.Serializable;
import java.util.Scanner;


abstract public class Ruangkelas implements Serializable{
    Scanner scan = new Scanner(System.in);
    private String Nama_ruang;
    private String Lokasi_ruang;
    private String Prodi;
    private int Panjang_ruang;
    private int Lebar_ruang;
    private int Jumlah_kursi;
    private int Jumlah_meja;
    private int Jumlah_jendela;
    private int jumlah_pintu;
    private String Username;
    private String pasword;
    private int Jumlahsteker;
    private int kondisisteker;
    private int posisisteker;
    private int jumlahkabelLCD;
    private int kondisikabelLCD;
    private int posisikabelLCD;
    private int jumlahlampu;
    private int kondisilampu;
    private int posisilampu;
    private int jumlahkipasangin;
    private int kondisikipasangin;
    private int posisikipasangin;
    private int jumlahAC;
    private int kondisiAC;
    private int posisiAC;
    private int SSID;
    private int bandwidth;
    private int jumlahCCTV;
    private int kondisiCCTV;
    private int posisiCCTV;
    private int kebisingan;
    private int bau;
    private int kebocoran;
    private int keausan;
    private int kerusakan;
    private int kekokohan;
    private int kunci_pintu;
    private int kunci_jendela;
    private int bahaya;
    private int lantai;
    private int dinding;
    private int atap;
    private int pintu;
    private int jendela;
    private int sirkulasi_udara;
    private int pencayahan;
    private int kelembapan;
    private int suhu;
    private String kondisi;
    int a;
    int b;
    
    public Ruangkelas(String kondisi) {//Konstraktor
        this.kondisi = kondisi;
    }

    public String getKondisi() {
        return kondisi;
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

    public int getKondisisteker() {
        return kondisisteker;
    }

    public int getKondisikabelLCD() {
        return kondisikabelLCD;
    }

    public int getKondisilampu() {
        return kondisilampu;
    }

    public int getKondisikipasangin() {
        return kondisikipasangin;
    }

    public int getKondisiAC() {
        return kondisiAC;
    }

    public int getKondisiCCTV() {
        return kondisiCCTV;
    }
    
    public void setFasilitas (int posisikabelLCD, int posisilampu, int posisikipasangin, int posisiAC){
        this.posisikabelLCD=posisikabelLCD;
        this.posisilampu=posisilampu;
        this.posisikipasangin=posisikipasangin;
        this.posisiAC=posisiAC;
    }

    public int getPosisikabelLCD() {
        return posisikabelLCD;
    }

    public int getPosisilampu() {
        return posisilampu;
    }

    public int getPosisikipasangin() {
        return posisikipasangin;
    }

    public int getPosisiAC() {
        return posisiAC;
    }
    
    public void setFasilitas(String username, String pasword){
        this.Username=username;
        this.pasword=pasword;
    }
    
    public void setKondisiLingkungan(int lantai, int dinding, int atap, int pintu, int jendela){//overloading
        this.atap=atap;
        this.dinding=dinding;
        this.lantai=lantai;
        this.jendela=jendela;
        this.pintu=pintu;
    }

    public int getLantai() {
        return lantai;
    }

    public int getDinding() {
        return dinding;
    }

    public int getAtap() {
        return atap;
    }

    public int getPintu() {
        return pintu;
    }

    public int getJendela() {
        return jendela;
    }
    
    public void setKondisiLingkungan(int sirkulasi_udara){
        this.sirkulasi_udara=sirkulasi_udara;
    }

    public int getSirkulasi_udara() {
        return sirkulasi_udara;
    }
    
    public void setKondisiKenyamanan(int kebisingan, int bau, int kebocoran, int kerusakan, int keausan){
        this.kebisingan=kebisingan;
        this.bau=bau;
        this.kebocoran=kebocoran;
        this.kerusakan=kerusakan;
        this.keausan=keausan;
    }

    public int getKebisingan() {
        return kebisingan;
    }

    public int getBau() {
        return bau;
    }

    public int getKebocoran() {
        return kebocoran;
    }

    public int getKeausan() {
        return keausan;
    }

    public int getKerusakan() {
        return kerusakan;
    }
    
    public void setKondisiKenyamanan(int kekokohan, int kunci_pintu, int kunci_jendela, int bahaya){
        this.kekokohan=kekokohan;
        this.kunci_pintu=kunci_pintu;
        this.kunci_jendela=kunci_jendela;
        this.bahaya=bahaya;
    }

    public int getKekokohan() {
        return kekokohan;
    }

    public int getKunci_pintu() {
        return kunci_pintu;
    }

    public int getKunci_jendela() {
        return kunci_jendela;
    }

    public int getBahaya() {
        return bahaya;
    }

    
    //enkapsulasi
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

    public int getSSID() {
        return SSID;
    }

    public void setSSID(int SSID) {
        this.SSID = SSID;
    }

    public int getJumlahsteker() {
        return Jumlahsteker;
    }

    public void setJumlahsteker(int Jumlahsteker) {
        this.Jumlahsteker = Jumlahsteker;
    }

    public int getJumlahkabelLCD() {
        return jumlahkabelLCD;
    }

    public void setJumlahkabelLCD(int jumlahkabelLCD) {
        this.jumlahkabelLCD = jumlahkabelLCD;
    }

    public int getJumlahlampu() {
        return jumlahlampu;
    }

    public void setJumlahlampu(int jumlahlampu) {
        this.jumlahlampu = jumlahlampu;
    }

    public int getJumlahkipasangin() {
        return jumlahkipasangin;
    }

    public void setJumlahkipasangin(int jumlahkipasangin) {
        this.jumlahkipasangin = jumlahkipasangin;
    }

    public int getJumlahAC() {
        return jumlahAC;
    }

    public void setJumlahAC(int jumlahAC) {
        this.jumlahAC = jumlahAC;
    }

    public int getJumlahCCTV() {
        return jumlahCCTV;
    }

    public void setJumlahCCTV(int jumlahCCTV) {
        this.jumlahCCTV = jumlahCCTV;
    }

    public int getPosisisteker() {
        return posisisteker;
    }

    public void setPosisisteker(int posisisteker) {
        this.posisisteker = posisisteker;
    }

    public int getPosisiCCTV() {
        return posisiCCTV;
    }

    public void setPosisiCCTV(int posisiCCTV) {
        this.posisiCCTV = posisiCCTV;
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
    
    //abtract 
    abstract void deklarasi1();
    
    String string1 (){
        String pilih;
        if(a==b){
            pilih = "sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String string2 (){
        String pilih;
        if(a==b){
            pilih = "sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String string3 (){
        String pilih;
        if (a==b){
            pilih="sesuai";
        }else {
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String string4 (){
        String pilih;
        if(a==b){
            pilih = "sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String string5 (){
        String pilih;
        if(a==b){
            pilih = "sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String string6 (){
        String pilih;
        if(a==b){
            pilih = "sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String string7 (){
        String pilih;
        if(a==b){
            pilih = "sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
}
