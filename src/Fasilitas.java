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


public class Fasilitas extends Ruangkelas implements Deklarasi{
    Input_Fasilitas test = new Input_Fasilitas();
    public Fasilitas(String kondisi) {
        super(kondisi);
    }

    @Override
    void deklarasi1() {
        setFasilitas("TugasBesar", "java");
        setFasilitas(2, 3, 3, 1);
        setFasilitas(1, 1, 1, 1, 1, 1);
        System.out.println(getKondisi());
        System.out.println("A. Berapa Jumlah Steker");
        System.out.print("Jawab :");
        test.setJumlahsteker(scan.nextInt());
        System.out.println("Jumlah steker :"+JumlahSteker());
        System.out.println("B. Bagaimana Kondisi steker");
        System.out.println("1. Baik");
        System.out.println("2. Buruk");
        System.out.print("Jawab :");
        test.setPilih_kondisisteker(scan.nextInt());
        System.out.println("Kondisi steker :"+string1());
        System.out.println("C. Dimana posisi steker");
        System.out.println("1. pojok ruangan ");
        System.out.println("2. dekat dosen");
        System.out.println("3. atap");
        System.out.print("Jawab :");
        test.setPosisisteker(scan.nextInt());
        System.out.print("dan ");
        test.setPosisisteker(scan.nextInt());
        System.out.println("Posisi steker "+posisiSteker());
        
        System.out.println("D. Berapa Jumlah Kabel LCD");
        System.out.print("Jawab :");
        test.setJumlahkabelLCD(scan.nextInt());
        System.out.println("Jumlah kabel LCD :"+JumlahKabelLCD());
        System.out.println("E. Bagaimana Kondisi Kabel LCD");
        System.out.println("1. Berfungsi");
        System.out.println("2. Tidak Berfungsi");
        System.out.print("Jawab :");
        test.setPilih_kondisikabel(scan.nextInt());
        System.out.println("Kondisi Kabel LCD :"+string2());
        System.out.println("F. Dimana posisi Kabel LCD");
        System.out.println("1. pojok ruangan ");
        System.out.println("2. dekat dosen");
        System.out.println("3. atap");
        System.out.print("Jawab :");
        test.setPilih_posisikabel(scan.nextInt());
        System.out.println("Posisi Kabel LCD "+PosisiKabelLCD());
        
        System.out.println("G. Berapa Jumlah Lampu");
        System.out.print("Jawab :");
        test.setJumlahlampu(scan.nextInt());
        System.out.println("Jumlah Lampu :"+JumlahLampu());
        System.out.println("H. Bagaimana Kondisi Lampu");
        System.out.println("1. Baik");
        System.out.println("2. Buruk");
        System.out.print("Jawab :");
        test.setPilih_kondisilampu(scan.nextInt());
        System.out.println("Kondisi Lampu :"+string3());
        System.out.println("I. Dimana posisi Lampu");
        System.out.println("1. pojok ruangan ");
        System.out.println("2. dekat dosen");
        System.out.println("3. atap ruangan");
        System.out.print("Jawab :");
        test.setPilih_posisilampu(scan.nextInt());
        System.out.println("Posisi Lampu :"+PosisiLampu());
        
        System.out.println("J. Berapa Jumlah Kipas Angin");
        System.out.print("Jawab :");
        test.setJumlahkipasangin(scan.nextInt());
        System.out.println("Jumlah Kipas Angin :"+JumlahKipasAngin());
        System.out.println("K. Bagaimana Kondisi Kipas Angin");
        System.out.println("1. Baik");
        System.out.println("2. Buruk");
        System.out.print("Jawab :");
        test.setPilih_kondisikipas(scan.nextInt());
        System.out.println("Kondisi Kipas Angin :"+string4());
        System.out.println("L. Dimana posisi Kipas Angin");
        System.out.println("1. pojok ruangan ");
        System.out.println("2. dekat dosen");
        System.out.println("3. atap ruangan");
        System.out.print("Jawab :");
        test.setPilih_posisikipas(scan.nextInt());
        System.out.println("Posisi Kipas Angin :"+PosisiKipasAngin());
        
        System.out.println("M. Berapa Jumlah AC");
        System.out.print("Jawab :");
        test.setJumlahAC(scan.nextInt());
        System.out.println("Jumlah AC :"+JumlahAC());
        System.out.println("N. Bagaimana Kondisi AC");
        System.out.println("1. Baik");
        System.out.println("2. Buruk");
        System.out.print("Jawab :");
        test.setPilih_kondisiac(scan.nextInt());
        System.out.println("Kondisi AC :"+string5());
        System.out.println("O. Dimana posisi AC");
        System.out.println("1. Belakang ");
        System.out.println("2. Atap");
        System.out.println("3. Depan");
        System.out.print("Jawab :");
        test.setPilih_posisiac(scan.nextInt());
        System.out.println("Posisi AC :"+PosisiAC());
        
        System.out.println("P. Silahkan pilih SSID");
        System.out.println("1. UMM Hotspot");
        System.out.println("2. RiaJenaka");
        System.out.println("3. Otoy");
        System.out.print("Jawab :");
        test.setSSID(scan.nextInt());
        System.out.println("SSID :"+SSID());
        System.out.println("Q. Silahkan Login");
        System.out.print("Username :");
        test.setPilih_username(scan.next());
        System.out.print("Pasword");
        test.setPilih_pasword(scan.next());
        System.out.println("username :"+loginusername());
        System.out.println("Pasword :"+loginpasword());
        
        System.out.println("G. Berapa Jumlah CCTV");
        System.out.print("Jawab :");
        test.setJumlahCCTV(scan.nextInt());
        System.out.println("Jumlah CCTV :"+JumlahCCTV());
        System.out.println("H. Bagaimana Kondisi CCTV");
        System.out.println("1. Baik");
        System.out.println("2. Buruk");
        System.out.print("Jawab :");
        test.setPilih_kondisicctv(scan.nextInt());
        System.out.println("Kondisi CCTV :"+string6());
        System.out.println("I. Dimana posisi CCTV");
        System.out.println("1. Belakang ");
        System.out.println("2. Samping");
        System.out.println("3. Depan");
        System.out.print("Jawab :");
        test.setPosisiCCTV(scan.nextInt());
        System.out.println("Posisi CCTV :"+PosisiCCTV());
        try(FileOutputStream fs = new FileOutputStream("data.txt")){
                ObjectOutputStream ob = new ObjectOutputStream(fs);
                ob.writeObject(test);
                ob.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        
            try (FileInputStream fs = new FileInputStream("data.txt")){
                ObjectInputStream ib = new ObjectInputStream(fs);
                Input_Fasilitas inf = (Input_Fasilitas) ib.readObject();
                System.out.println("Jumlah steker "+inf.getJumlahsteker());
                System.out.println("kondisi steker "+inf.getPilih_kondisisteker());
                System.out.println("posisi steker "+inf.getPosisisteker());
                System.out.println("Jumlah kabel lcd "+inf.getJumlahkabelLCD());
                System.out.println("kondisi kabel lcd "+inf.getPilih_kondisikabel());
                System.out.println("posisi kabel lcd "+inf.getPilih_posisikabel());
                System.out.println("Jumlah lampu "+inf.getJumlahlampu());
                System.out.println("kondisi lampu "+inf.getPilih_kondisilampu());
                System.out.println("posisi lampu "+inf.getPilih_posisilampu());
                System.out.println("Jumlah kipas angin "+inf.getJumlahkipasangin());
                System.out.println("kondisi kipas angin "+inf.getPilih_kondisikipas());
                System.out.println("posisi kipas angin "+inf.getPilih_posisikipas());
                System.out.println("Jumlah AC "+inf.getJumlahAC());
                System.out.println("kondisi AC "+inf.getPilih_kondisiac());
                System.out.println("posisi AC "+inf.getPilih_posisiac());
                System.out.println("SSID "+inf.getSSID());
                System.out.println("Username "+inf.getPilih_username());
                System.out.println("Pasword "+inf.getPilih_pasword());
                System.out.println("Jumlah CCTV "+inf.getJumlahCCTV());
                System.out.println("kondisi CCTV "+inf.getPilih_kondisicctv());
                System.out.println("posisi CCTV "+inf.getPilih_kondisicctv());
                ib.close();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Fasilitas.class.getName()).log(Level.SEVERE, null, ex);
            }catch(IOException e){
                e.printStackTrace();
            }
        
    }

    @Override
    public void deklarasi2() {
        
    }

    @Override
    String string1() {
        a=test.getPilih_kondisisteker();
        b=getKondisisteker();
        return super.string1();
    }

    @Override
    String string2() {
        a=test.getPilih_kondisikabel();
        b=getKondisikabelLCD();
        return super.string2();
    }

    @Override
    String string3() {
        a=test.getPilih_kondisilampu();
        b=getKondisilampu();
        return super.string3();
    }

    @Override
    String string4() {
        a=test.getPilih_kondisikipas();
        b=getKondisikipasangin();
        return super.string4();
    }

    @Override
    String string5() {
        a=test.getPilih_kondisiac();
        b=getKondisiAC();
        return super.string5();
    }

    @Override
    String string6() {
        a=test.getPilih_kondisicctv();
        b=getKondisiCCTV();
        return super.string6();
    }
    
    String JumlahSteker (){
        String pilih ;
        if(test.getJumlahsteker()>=4){
            pilih="sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    
    String posisiSteker (){
        String pilih ;
        if(test.getPosisisteker()>=1&&test.getPosisisteker()<=2){
            pilih="sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String JumlahKabelLCD(){
        String pilih;
        if(test.getJumlahkabelLCD()>=1){
            pilih="sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String PosisiKabelLCD(){
        String pilih;
        if(test.getPilih_posisikabel()==getPosisikabelLCD()){
            pilih="sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String JumlahLampu(){
        String pilih;
        if(test.getJumlahlampu()>=18){
            pilih="sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String PosisiLampu(){
        String pilih;
        if(test.getPilih_posisilampu()==getPosisilampu()){
            pilih="sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String JumlahKipasAngin(){
        String pilih;
        if(test.getJumlahkipasangin()>=2){
            pilih="sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String PosisiKipasAngin(){
        String pilih;
        if(test.getPilih_posisikipas()==getPosisikipasangin()){
            pilih="sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String JumlahAC(){
        String pilih;
        if(test.getJumlahAC()>=1){
            pilih="sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String PosisiAC(){
        String pilih;
        if(test.getPilih_posisiac()== getPosisiAC()){
            pilih="sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String JumlahCCTV(){
        String pilih;
        if(test.getJumlahCCTV()==2){
            pilih="sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String PosisiCCTV(){
        String pilih;
        if(test.getPosisiCCTV()==1&&test.getPosisiCCTV()==3){
            pilih="sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String SSID(){
        String pilih;
        if(test.getSSID()==1){
            pilih="sesuai";
        }else{
            pilih = "tidak sesuai";
        }
        return pilih;
    }
    String loginusername(){
        String pilih;
        if(test.getPilih_username() .equals(getUsername())){
            pilih ="sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String loginpasword(){
        String pilih;
        if (test.getPilih_pasword().equals(getPasword())){
            pilih="sesuai";
        }else{
            pilih ="tidak sesuai";
            
        }
        return pilih;
    }
    
    
}
