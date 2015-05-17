
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NirmalaKarim
 */
public class Kenyamanan extends Ruangkelas{
    int pilih_kebisingan;
    int pilih_bau;
    int pilih_kebocoran;
    int pilih_kerusakan;
    int pilih_keausan;
    int pilih_kekokohan;
    int pilih_kuncipintu;
    int pilih_kuncijendela;
    int pilih_bahaya;

    public Kenyamanan(String kondisi) {
        super(kondisi);
    }

    //override
    @Override
    public void setKondisiKenyamanan(int kebisingan, int bau, int kebocoran, int kerusakan, int keausan) {
        super.setKondisiKenyamanan(kebisingan, bau, kebocoran, kerusakan, keausan);
    }

    @Override
    public void setKondisiKenyamanan(int kekokohan, int kunci_pintu, int kunci_jendela, int bahaya) {
        super.setKondisiKenyamanan(kekokohan, kunci_pintu, kunci_jendela, bahaya);
    }
    
    
    //enkapsulasi
    public int getPilih_kebisingan() {
        return pilih_kebisingan;
    }

    public void setPilih_kebisingan(int pilih_kebisingan) {
        this.pilih_kebisingan = pilih_kebisingan;
    }

    public int getPilih_bau() {
        return pilih_bau;
    }

    public void setPilih_bau(int pilih_bau) {
        this.pilih_bau = pilih_bau;
    }

    public int getPilih_kebocoran() {
        return pilih_kebocoran;
    }

    public void setPilih_kebocoran(int pilih_kebocoran) {
        this.pilih_kebocoran = pilih_kebocoran;
    }

    public int getPilih_kerusakan() {
        return pilih_kerusakan;
    }

    public void setPilih_kerusakan(int pilih_kerusakan) {
        this.pilih_kerusakan = pilih_kerusakan;
    }

    public int getPilih_keausan() {
        return pilih_keausan;
    }

    public void setPilih_keausan(int pilih_keausan) {
        this.pilih_keausan = pilih_keausan;
    }

    public int getPilih_kekokohan() {
        return pilih_kekokohan;
    }

    public void setPilih_kekokohan(int pilih_kekokohan) {
        this.pilih_kekokohan = pilih_kekokohan;
    }

    public int getPilih_kuncipintu() {
        return pilih_kuncipintu;
    }

    public void setPilih_kuncipintu(int pilih_kuncipintu) {
        this.pilih_kuncipintu = pilih_kuncipintu;
    }

    public int getPilih_kuncijendela() {
        return pilih_kuncijendela;
    }

    public void setPilih_kuncijendela(int pilih_kuncijendela) {
        this.pilih_kuncijendela = pilih_kuncijendela;
    }

    public int getPilih_bahaya() {
        return pilih_bahaya;
    }

    public void setPilih_bahaya(int pilih_bahaya) {
        this.pilih_bahaya = pilih_bahaya;
    }
    
    //untuk mengembalikan nilai
   String kebisingan(){
        String pilih;
        if(getPilih_kebisingan()==kebisingan){
            pilih = "sessuai";
        }else{
            pilih = "tidak sesuai";
        }
        return pilih;
    }
    String bau(){
        String pilih;
        if(getPilih_bau()==bau){
            pilih="sesuai";
        }else{
            pilih = "tidak sesuai";
        }
        return pilih;
    }
    String kebocoran(){
        String pilih;
        if(getPilih_kebocoran()==kebocoran){
            pilih="sesuai";
        } else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String keausan(){
        String pilih;
        if(getPilih_keausan()==keausan){
            pilih="sesuai";
        } else{
            pilih="tidak sesuai";
        }
        return pilih;
    }    
    String kerusakan(){
        String pilih;
        if(getPilih_kerusakan()==kerusakan){
            pilih="sesuai";
        } else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String kekokohan(){
        String pilih;
        if(getPilih_kekokohan()==kekokohan){
            pilih="sesuai";
        } else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String kunci(){
        String pilih;
        if(getPilih_kuncipintu()==kunci_pintu && getPilih_kuncijendela()==kunci_jendela){
            pilih="sesuai";
        } else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String keamanan (){
        String pilih;
        if(getPilih_bahaya()==bahaya){
            pilih="sesuai";
        } else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
}
