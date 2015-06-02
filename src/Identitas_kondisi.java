/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
/**
 *
 * @author NirmalaKarim
 */
public class Identitas_kondisi extends Ruangkelas implements Deklarasi{
    
    public Identitas_kondisi(String kondisi) {
        super(kondisi);
    }
    @Override
    void deklarasi1() {
        System.out.println(getKondisi());
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
        try(FileOutputStream fs = new FileOutputStream("penyimpanan.txt")){
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(getNama_ruang());
            os.writeObject(getLokasi_ruang());
            os.writeObject(getProdi());
            os.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void deklarasi2() {
        System.out.println(getKondisi());
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
        
        try(FileOutputStream fs = new FileOutputStream("penyimpanan.txt")){
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(getPanjang_ruang());
            os.writeObject(getLebar_ruang());
            os.writeObject(getJumlah_kursi());
            os.writeObject(getJumlah_jendela());
            os.writeObject(getJumlah_pintu());
            os.close();
        }catch(IOException e){
            e.printStackTrace();
        }
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
