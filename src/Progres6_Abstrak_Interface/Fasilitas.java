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
public class Fasilitas extends RuangKelas implements deklarasi{
    int pilih_kondisisteker;
    int pilih_kondisilampu;
    int pilih_kondisikabel;
    int pilih_kondisikipas;
    int pilih_kondisiac;
    int pilih_kondisicctv;
    int pilih_posisikabel;
    int pilih_posisilampu;
    int pilih_posisikipas;
    int pilih_posisiac;
    String pilih_username;
    String pilih_pasword;

    public Fasilitas(String kondisi) {
        super(kondisi);
    }

    @Override
    public String getUsername() {
        return super.getUsername();
    }

    @Override
    public void setUsername(String Username) {
        super.setUsername(Username);
    }

    @Override
    public String getPasword() {
        return super.getPasword();
    }

    @Override
    public void setPasword(String pasword) {
        super.setPasword(pasword);
    }

    @Override
    public void setFasilitas(String username, String pasword) {
        super.setFasilitas(username, pasword);
    }
    
    @Override
    public void setFasilitas(int kondisisteker, int kondisikabelLCD, int kondisilampu, int kondisikipasangin, int kondisiAC, int kondisiCCTV) {
        super.setFasilitas(kondisisteker, kondisikabelLCD, kondisilampu, kondisikipasangin, kondisiAC, kondisiCCTV);
    }

    @Override
    public void setFasilitas(int posisikabelLCD, int posisilampu, int posisikipasangin, int posisiAC) {
        super.setFasilitas(posisikabelLCD, posisilampu, posisikipasangin, posisiAC);
    }

    public int getPilih_kondisisteker() {
        return pilih_kondisisteker;
    }

    public void setPilih_kondisisteker(int pilih_kondisisteker) {
        this.pilih_kondisisteker = pilih_kondisisteker;
    }

    public int getPilih_kondisilampu() {
        return pilih_kondisilampu;
    }

    public void setPilih_kondisilampu(int pilih_kondisilampu) {
        this.pilih_kondisilampu = pilih_kondisilampu;
    }

    public int getPilih_kondisikabel() {
        return pilih_kondisikabel;
    }

    public void setPilih_kondisikabel(int pilih_kondisikabel) {
        this.pilih_kondisikabel = pilih_kondisikabel;
    }

    public int getPilih_kondisikipas() {
        return pilih_kondisikipas;
    }

    public void setPilih_kondisikipas(int pilih_kondisikipas) {
        this.pilih_kondisikipas = pilih_kondisikipas;
    }

    public int getPilih_kondisiac() {
        return pilih_kondisiac;
    }

    public void setPilih_kondisiac(int pilih_kondisiac) {
        this.pilih_kondisiac = pilih_kondisiac;
    }

    public int getPilih_kondisicctv() {
        return pilih_kondisicctv;
    }

    public void setPilih_kondisicctv(int pilih_kondisicctv) {
        this.pilih_kondisicctv = pilih_kondisicctv;
    }

    public int getPilih_posisikabel() {
        return pilih_posisikabel;
    }

    public void setPilih_posisikabel(int pilih_posisikabel) {
        this.pilih_posisikabel = pilih_posisikabel;
    }

    public int getPilih_posisilampu() {
        return pilih_posisilampu;
    }

    public void setPilih_posisilampu(int pilih_posisilampu) {
        this.pilih_posisilampu = pilih_posisilampu;
    }

    public int getPilih_posisikipas() {
        return pilih_posisikipas;
    }

    public void setPilih_posisikipas(int pilih_posisikipas) {
        this.pilih_posisikipas = pilih_posisikipas;
    }

    public int getPilih_posisiac() {
        return pilih_posisiac;
    }

    public void setPilih_posisiac(int pilih_posisiac) {
        this.pilih_posisiac = pilih_posisiac;
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

    @Override
    void deklarasi1() {
        setFasilitas("TugasBesar", "java");
        setFasilitas(2, 3, 3, 1);
        setFasilitas(1, 1, 1, 1, 1, 1);
        System.out.println(kondisi);
        System.out.println("A. Berapa Jumlah Steker");
        System.out.print("Jawab :");
        setJumlahsteker(scan.nextInt());
        System.out.println("Jumlah steker :"+JumlahSteker());
        System.out.println("B. Bagaimana Kondisi steker");
        System.out.println("1. Baik");
        System.out.println("2. Buruk");
        System.out.print("Jawab :");
        setPilih_kondisisteker(scan.nextInt());
        System.out.println("Kondisi steker :"+string1());
        System.out.println("C. Dimana posisi steker");
        System.out.println("1. pojok ruangan ");
        System.out.println("2. dekat dosen");
        System.out.println("3. atap");
        System.out.print("Jawab :");
        setPosisisteker(scan.nextInt());
        System.out.print("dan ");
        setPosisisteker(scan.nextInt());
        System.out.println("Posisi steker "+posisiSteker());
        
        System.out.println("D. Berapa Jumlah Kabel LCD");
        System.out.print("Jawab :");
        setJumlahkabelLCD(scan.nextInt());
        System.out.println("Jumlah kabel LCD :"+JumlahKabelLCD());
        System.out.println("E. Bagaimana Kondisi Kabel LCD");
        System.out.println("1. Berfungsi");
        System.out.println("2. Tidak Berfungsi");
        System.out.print("Jawab :");
        setPilih_kondisikabel(scan.nextInt());
        System.out.println("Kondisi Kabel LCD :"+string2());
        System.out.println("F. Dimana posisi Kabel LCD");
        System.out.println("1. pojok ruangan ");
        System.out.println("2. dekat dosen");
        System.out.println("3. atap");
        System.out.print("Jawab :");
        setPilih_posisikabel(scan.nextInt());
        System.out.println("Posisi Kabel LCD "+PosisiKabelLCD());
        
        System.out.println("G. Berapa Jumlah Lampu");
        System.out.print("Jawab :");
        setJumlahlampu(scan.nextInt());
        System.out.println("Jumlah Lampu :"+JumlahLampu());
        System.out.println("H. Bagaimana Kondisi Lampu");
        System.out.println("1. Baik");
        System.out.println("2. Buruk");
        System.out.print("Jawab :");
        setPilih_kondisilampu(scan.nextInt());
        System.out.println("Kondisi Lampu :"+string3());
        System.out.println("I. Dimana posisi Lampu");
        System.out.println("1. pojok ruangan ");
        System.out.println("2. dekat dosen");
        System.out.println("3. atap ruangan");
        System.out.print("Jawab :");
        setPilih_posisilampu(scan.nextInt());
        System.out.println("Posisi Lampu :"+PosisiLampu());
        
        System.out.println("J. Berapa Jumlah Kipas Angin");
        System.out.print("Jawab :");
        setJumlahkipasangin(scan.nextInt());
        System.out.println("Jumlah Kipas Angin :"+JumlahKipasAngin());
        System.out.println("K. Bagaimana Kondisi Kipas Angin");
        System.out.println("1. Baik");
        System.out.println("2. Buruk");
        System.out.print("Jawab :");
        setPilih_kondisikipas(scan.nextInt());
        System.out.println("Kondisi Kipas Angin :"+string4());
        System.out.println("L. Dimana posisi Kipas Angin");
        System.out.println("1. pojok ruangan ");
        System.out.println("2. dekat dosen");
        System.out.println("3. atap ruangan");
        System.out.print("Jawab :");
        setPilih_posisikipas(scan.nextInt());
        System.out.println("Posisi Kipas Angin :"+PosisiKipasAngin());
        
        System.out.println("M. Berapa Jumlah AC");
        System.out.print("Jawab :");
        setJumlahAC(scan.nextInt());
        System.out.println("Jumlah AC :"+JumlahAC());
        System.out.println("N. Bagaimana Kondisi AC");
        System.out.println("1. Baik");
        System.out.println("2. Buruk");
        System.out.print("Jawab :");
        setPilih_kondisiac(scan.nextInt());
        System.out.println("Kondisi AC :"+string5());
        System.out.println("O. Dimana posisi AC");
        System.out.println("1. Belakang ");
        System.out.println("2. Atap");
        System.out.println("3. Depan");
        System.out.print("Jawab :");
        setPilih_posisiac(scan.nextInt());
        System.out.println("Posisi AC :"+PosisiAC());
        
        System.out.println("P. Silahkan pilih SSID");
        System.out.println("1. UMM Hotspot");
        System.out.println("2. RiaJenaka");
        System.out.println("3. Otoy");
        System.out.print("Jawab :");
        setSSID(scan.nextInt());
        System.out.println("SSID :"+SSID());
        System.out.println("Q. Silahkan Login");
        System.out.print("Username :");
        pilih_username=scan.next();
        System.out.print("Pasword");
        pilih_pasword=scan.next();
        System.out.println("username :"+loginusername());
        System.out.println("Pasword :"+loginpasword());
        
        System.out.println("G. Berapa Jumlah CCTV");
        System.out.print("Jawab :");
        setJumlahCCTV(scan.nextInt());
        System.out.println("Jumlah CCTV :"+JumlahCCTV());
        System.out.println("H. Bagaimana Kondisi CCTV");
        System.out.println("1. Baik");
        System.out.println("2. Buruk");
        System.out.print("Jawab :");
        setPilih_kondisicctv(scan.nextInt());
        System.out.println("Kondisi CCTV :"+string6());
        System.out.println("I. Dimana posisi CCTV");
        System.out.println("1. Belakang ");
        System.out.println("2. Samping");
        System.out.println("3. Depan");
        System.out.print("Jawab :");
        setPosisiCCTV(scan.nextInt());
        System.out.println("Posisi CCTV :"+PosisiCCTV());
    }

    @Override
    public void deklarasi2() {
        
    }

    @Override
    String string1() {
        a=getPilih_kondisisteker();
        b=kondisisteker;
        return super.string1();
    }

    @Override
    String string2() {
        a=getPilih_kondisikabel();
        b=kondisikabelLCD;
        return super.string2();
    }

    @Override
    String string3() {
        a=getPilih_kondisilampu();
        b=kondisilampu;
        return super.string3();
    }

    @Override
    String string4() {
        a=getPilih_kondisikipas();
        b=kondisikipasangin;
        return super.string4();
    }

    @Override
    String string5() {
        a=getPilih_kondisiac();
        b=kondisiAC;
        return super.string5();
    }

    @Override
    String string6() {
        a=kondisiCCTV;
        b=kondisiCCTV;
        return super.string6();
    }
    
    String JumlahSteker (){
        String pilih ;
        if(getJumlahsteker()>=4){
            pilih="sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    
    String posisiSteker (){
        String pilih ;
        if(getPosisisteker()>=1&&getPosisisteker()<=2){
            pilih="sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String JumlahKabelLCD(){
        String pilih;
        if(getJumlahkabelLCD()>=1){
            pilih="sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String PosisiKabelLCD(){
        String pilih;
        if(getPilih_posisikabel()==posisikabelLCD){
            pilih="sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String JumlahLampu(){
        String pilih;
        if(getJumlahlampu()>=18){
            pilih="sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String PosisiLampu(){
        String pilih;
        if(getPilih_posisilampu()==posisilampu){
            pilih="sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String JumlahKipasAngin(){
        String pilih;
        if(getJumlahkipasangin()>=2){
            pilih="sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String PosisiKipasAngin(){
        String pilih;
        if(getPilih_posisikipas()==posisikipasangin){
            pilih="sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String JumlahAC(){
        String pilih;
        if(getJumlahAC()>=1){
            pilih="sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String PosisiAC(){
        String pilih;
        if(getPilih_posisiac()== posisiAC){
            pilih="sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String JumlahCCTV(){
        String pilih;
        if(getJumlahCCTV()==2){
            pilih="sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String PosisiCCTV(){
        String pilih;
        if(getPosisiCCTV()==1||getPosisiCCTV()==3){
            pilih="sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String SSID(){
        String pilih;
        if(getSSID()==1){
            pilih="sesuai";
        }else{
            pilih = "tidak sesuai";
        }
        return pilih;
    }
    String loginusername(){
        String pilih;
        if(pilih_username.equals(getUsername())){
            pilih ="sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String loginpasword(){
        String pilih;
        if (pilih_pasword.equals(getPasword())){
            pilih="sesuai";
        }else{
            pilih ="tidak sesuai";
            
        }
        return pilih;
    }
    
    
}
