/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

abstract public class Ruangkelas{
    Scanner scan = new Scanner(System.in);
    
    private String Username;
    private String pasword;
    private int kondisisteker;
    private int kondisikabelLCD;
    private int posisikabelLCD;
    private int kondisilampu;
    private int posisilampu;
    private int kondisikipasangin;
    private int posisikipasangin;
    private int kondisiAC;
    private int posisiAC;
    private int bandwidth;
    private int kondisiCCTV;
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

    //abstract 
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
