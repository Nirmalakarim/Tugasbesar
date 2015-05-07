
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NirmalaKarim
 */
public class Kenyamanan {
    Scanner scan = new Scanner(System.in);

    private int kebisingan;
    private int bau;
    private int kebocoran;
    private int keausan;
    private int kerusakan;
    private int kekokohan;
    private int kunci_pintu;
    private int kunci_jendela;
    private int bahaya;

    public int getKebisingan() {
        return kebisingan;
    }

    public void setKebisingan(int kebisingan) {
        this.kebisingan = kebisingan;
    }

    public int getBau() {
        return bau;
    }

    public void setBau(int bau) {
        this.bau = bau;
    }

    public int getKebocoran() {
        return kebocoran;
    }

    public void setKebocoran(int kebocoran) {
        this.kebocoran = kebocoran;
    }

    public int getKeausan() {
        return keausan;
    }

    public void setKeausan(int keausan) {
        this.keausan = keausan;
    }

    public int getKerusakan() {
        return kerusakan;
    }

    public void setKerusakan(int kerusakan) {
        this.kerusakan = kerusakan;
    }

    public int getKekokohan() {
        return kekokohan;
    }

    public void setKekokohan(int kekokohan) {
        this.kekokohan = kekokohan;
    }

    public int getKunci_pintu() {
        return kunci_pintu;
    }

    public void setKunci_pintu(int kunci_pintu) {
        this.kunci_pintu = kunci_pintu;
    }

    public int getKunci_jendela() {
        return kunci_jendela;
    }

    public void setKunci_jendela(int kunci_jendela) {
        this.kunci_jendela = kunci_jendela;
    }

    public int getBahaya() {
        return bahaya;
    }

    public void setBahaya(int bahaya) {
        this.bahaya = bahaya;
    }
      
    String kebisingan(){
        String pilih;
        if(getKebisingan()==2){
            pilih = "sessuai";
        }else{
            pilih = "tidak sesuai";
        }
        return pilih;        
    }
    String bau(){
        String pilih;
        if(getBau()==2){
            pilih="sesuai";
        }else{
            pilih = "tidak sesuai";
        }
        return pilih;
        
    }
    String kebocoran (){
        String pilih;
        if(getKebocoran()==2){
            pilih="sesuai";
        } else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String keausan(){
        String pilih;
        if(getKeausan()==2){
            pilih="sesuai";
        } else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String kerusakan(){
        String pilih;
        if(getKerusakan()==2){
            pilih="sesuai";
        } else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String kekokohan(){
        String pilih;
        if(getKekokohan()==1){
            pilih="sesuai";
        } else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String kunci(){
        String pilih;
        if(getKunci_pintu()==1 && getKunci_jendela()==1){
            pilih="sesuai";
        } else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String keamanan(){
        String pilih;
        if(getBahaya()==1){
            pilih="sesuai";
        } else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
}
