/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author NirmalaKarim
 */
public class Identitas_Kondisi extends Ruangkelas implements Deklarasi{
    Input_identitas test = new Input_identitas();
    public Identitas_Kondisi(String kondisi) {
        super(kondisi);
    }
    @Override
    void deklarasi1() {
        System.out.println(getKondisi());
        System.out.print("Masukan nama ruang :");
        test.setNama_ruang(scan.next());
        System.out.print("Masukan lokasi ruang :");
        test.setLokasi_ruang(scan.next());
        System.out.print("Masukan Jurusan anda :");
        test.setProdi(scan.next());
        
        System.out.println("================== \n");
        System.out.println("Nama ruang : "+test.getNama_ruang());
        System.out.println("Lokasi Ruang : "+test.getLokasi_ruang());
        System.out.println("Jurusan : "+test.getProdi());
        System.out.println("");
        
        try(FileOutputStream fs = new FileOutputStream("data.txt")){
                ObjectOutputStream ob = new ObjectOutputStream(fs);
                ob.writeObject(test);
                ob.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        
            try (FileInputStream fs = new FileInputStream("data.txt")){
                ObjectInputStream ib = new ObjectInputStream(fs);
                Input_identitas id = (Input_identitas) ib.readObject();
                System.out.println("Nama Ruang "+id.getNama_ruang());
                System.out.println("Lokasi Ruang "+id.getLokasi_ruang());
                System.out.println("Jurusan "+id.getProdi());
                ib.close();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Identitas_Kondisi.class.getName()).log(Level.SEVERE, null, ex);
            }catch(IOException e){
                e.printStackTrace();
            }
    }

    @Override
    public void deklarasi2() {
        System.out.println(getKondisi());
        System.out.println("A. Masukan panjang ruang ");
        System.out.print("Jawab :");
        test.setPanjang_ruang(scan.nextInt());
        System.out.println("B. Masukan lebar ruang ");
        System.out.print("Jawab :");
        test.setLebar_ruang(scan.nextInt());
        System.out.println("C. Luas : "+luas());
        System.out.println("D. Bentuk : "+bentuk());
        System.out.println("E. Masukan jumlah kursi");
        System.out.print("Jawab :");
        test.setJumlah_kursi(scan.nextInt());
        System.out.println("F. Rasio : "+rasio());
        System.out.println("Rasio : "+Analisis_rasio());
        System.out.println("G. Masukan jumlah pintu ");
        System.out.print("Jawab :");
        test.setJumlah_pintu(scan.nextInt());
        System.out.println("H. Masukan jumlah jendela");
        System.out.print("Jawab : ");
        test.setJumlah_jendela(scan.nextInt());
        System.out.println("Jumlah pintu dan jendela :"+analisisPintuDanJendela());
        System.out.println("");
        try(FileOutputStream fs = new FileOutputStream("data.txt")){
                ObjectOutputStream ob = new ObjectOutputStream(fs);
                ob.writeObject(test);
                ob.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        
            try (FileInputStream fs = new FileInputStream("data.txt")){
                ObjectInputStream ib = new ObjectInputStream(fs);
                Input_identitas id = (Input_identitas) ib.readObject();
                System.out.println("Panjang ruang "+id.getPanjang_ruang());
                System.out.println("Lebar ruang"+id.getLebar_ruang());
                System.out.println("Jumlah kursi "+id.getJumlah_kursi());
                System.out.println("Jumlah pintu "+id.getJumlah_pintu());
                System.out.println("Jumlah jendela "+id.getJumlah_jendela());
                ib.close();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Identitas_Kondisi.class.getName()).log(Level.SEVERE, null, ex);
            }catch(IOException e){
                e.printStackTrace();
            }
    }

    
    
    double luas (){        
        return test.getPanjang_ruang()*test.getLebar_ruang();
    }
    String bentuk(){
        String pilih;
        if(test.getPanjang_ruang()!=luas()){
            pilih="persegi panjang dan sesuai";
        } else{
            pilih="bukan persegi panjang";
        }
        return pilih;
    }
    
    double rasio(){
        return luas()/test.getJumlah_kursi();        
    }
    String analisisPintuDanJendela(){
        String satu;
                if(test.getJumlah_pintu() >=2&&test.getJumlah_jendela()>=1){
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
