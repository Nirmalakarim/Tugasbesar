
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
      
    void kebisingan(){
        switch(getKebisingan()){
            case 1:
                System.out.println("tidak sesuai \n");
                break;
            case 2:
                System.out.println("sesuai \n");
        }
        
    }
    void bau(){
        switch(getBau()){
            case 1:
                System.out.println("tidak sesuai \n");
                break;
            case 2:
                System.out.println("sesuai \n");
        }
        
    }
    void kebocoran (){
        switch(getKebocoran()){
            case 1:
                System.out.println("tidak sesuai \n");
                break;
            case 2:
                System.out.println("sesuai \n");
        }
    }
    void keausan(){
        switch(getKeausan()){
            case 1:
                System.out.println("tidak sesuai \n");
                break;
            case 2:
                System.out.println("sesuai \n");
        }
    }
    void kerusakan(){
        switch(getKerusakan()){
            case 1:
                System.out.println("tidak sesuai \n");
                break;
            case 2:
                System.out.println("sesuai \n");
        }
    }
    void kekokohan(){
        switch(getKekokohan()){
            case 1:
                System.out.println("sesuai \n");
                break;
            case 2:
                System.out.println("tidak sesuai \n");
        }
    }
    void kunci(){
        System.out.println("G. Bagaimana keaadaan kunci pintu");
        System.out.println("1. Ada");
        System.out.println("2. Tidak ada");
        System.out.print("Jawab : ");
        setKunci_pintu(scan.nextInt());
        switch(getKunci_pintu()){
            case 1:
                System.out.println("sesuai \n");
                break;
            case 2:
                System.out.println("tidak sesuai \n");
        }
        
        System.out.println("H. Bagaimana keaadaan kunci jendela");
        System.out.println("1. Ada");
        System.out.println("2. Tidak ada");
        System.out.print("Jawab : ");
        setKunci_jendela(scan.nextInt());
        switch(getKunci_jendela()){
            case 1:
                System.out.println("sesuai \n");
                break;
            case 2:
                System.out.println("tidak sesuai \n");
        }
    }
    void keamanan(){
        switch(getBahaya()){
            case 1:
                System.out.println("sesuai \n");
                break;
            case 2:
                System.out.println("tidak sesuai \n");
        }
    }
}
