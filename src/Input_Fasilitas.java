/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author NirmalaKarim
 */
public class Input_Fasilitas extends Ruangkelas implements Serializable {
     public Input_Fasilitas(String kondisi) {
        super(kondisi);
    }
    private int pilih_kondisisteker;
    private int pilih_kondisilampu;
    private int pilih_kondisikabel;
    private int pilih_kondisikipas;
    private int pilih_kondisiac;
    private int pilih_kondisicctv;
    private int pilih_posisikabel;
    private int pilih_posisilampu;
    private int pilih_posisikipas;
    private int pilih_posisiac;
    private String pilih_username;
    private String pilih_pasword;
    private int Jumlahsteker;
    private int jumlahkabelLCD;
    private int jumlahlampu;
    private int jumlahkipasangin;
    private int jumlahAC;
    private int jumlahCCTV;
    private int posisisteker;
    private int posisiCCTV;
    private int SSID;
    
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

    public String getPilih_username() {
        return pilih_username;
    }

    public void setPilih_username(String pilih_username) {
        this.pilih_username = pilih_username;
    }

    public String getPilih_pasword() {
        return pilih_pasword;
    }

    public void setPilih_pasword(String pilih_pasword) {
        this.pilih_pasword = pilih_pasword;
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

    public int getSSID() {
        return SSID;
    }

    public void setSSID(int SSID) {
        this.SSID = SSID;
    }
    
    
    String JumlahSteker (){
        String pilih ;
        if(getJumlahsteker()>=4){
            pilih="sesuai";
            JOptionPane.showMessageDialog(null, pilih);
        }else{
            pilih="tidak sesuai";
            JOptionPane.showMessageDialog(null, pilih);
        }
        return pilih;
    }

    
    @Override
    String string1() {
        a=getPilih_kondisisteker();
        b=getKondisisteker();

        return super.string1();
    }

    @Override
    String string2() {
        a=getPilih_kondisikabel();
        b=getKondisikabelLCD();
        return super.string2();
    }

    @Override
    String string3() {
        a=getPilih_kondisilampu();
        b=getKondisilampu();
        return super.string3();
    }

    @Override
    String string4() {
        a=getPilih_kondisikipas();
        b=getKondisikipasangin();
        return super.string4();
    }

    @Override
    String string5() {
        a=getPilih_kondisiac();
        b=getKondisiAC();
        return super.string5();
    }

    @Override
    String string6() {
        a=getPilih_kondisicctv();
        b=getKondisiCCTV();
        return super.string6();
    }
    
    
    String posisiSteker (){
        String pilih ;
        if(getPosisisteker()>=0){
            pilih="sesuai";
            JOptionPane.showMessageDialog(null, pilih);
        }else{
            pilih="tidak sesuai";
            JOptionPane.showMessageDialog(null, pilih);
        }
        return pilih;
    }
    String JumlahKabelLCD(){
        String pilih;
        if(getJumlahkabelLCD()>=1){
            pilih="sesuai";
            JOptionPane.showMessageDialog(null, pilih);
        }else{
            pilih="tidak sesuai";
            JOptionPane.showMessageDialog(null, pilih);
        }
        return pilih;
    }
    String PosisiKabelLCD(){
        String pilih;
        if(getPilih_posisikabel()==getPosisikabelLCD()){
            pilih="sesuai";
            JOptionPane.showMessageDialog(null, pilih);
        }else{
            pilih="tidak sesuai";
            JOptionPane.showMessageDialog(null, pilih);
        }
        return pilih;
    }
    String JumlahLampu(){
        String pilih;
        if(getJumlahlampu()>=18){
            pilih="sesuai";
            JOptionPane.showMessageDialog(null, pilih);
        }else{
            pilih="tidak sesuai";
            JOptionPane.showMessageDialog(null, pilih);
        }
        return pilih;
    }
    String PosisiLampu(){
        String pilih;
        if(getPilih_posisilampu()==getPosisilampu()){
            pilih="sesuai";
            JOptionPane.showMessageDialog(null, pilih);
        }else{
            pilih="tidak sesuai";
            JOptionPane.showMessageDialog(null, pilih);
        }
        return pilih;
    }
    String JumlahKipasAngin(){
        String pilih;
        if(getJumlahkipasangin()>=2){
            pilih="sesuai";
            JOptionPane.showMessageDialog(null, pilih);
        }else{
            pilih="tidak sesuai";
            JOptionPane.showMessageDialog(null, pilih);
        }
        return pilih;
    }
    String PosisiKipasAngin(){
        String pilih;
        if(getPilih_posisikipas()==getPosisikipasangin()){
            pilih="sesuai";
            JOptionPane.showMessageDialog(null, pilih);
        }else{
            pilih="tidak sesuai";
            JOptionPane.showMessageDialog(null, pilih);
        }
        return pilih;
    }
    String JumlahAC(){
        String pilih;
        if(getJumlahAC()>=1){
            pilih="sesuai";
            JOptionPane.showMessageDialog(null, pilih);
        }else{
            pilih="tidak sesuai";
            JOptionPane.showMessageDialog(null, pilih);
        }
        return pilih;
    }
    String PosisiAC(){
        String pilih;
        if(getPilih_posisiac()== getPosisiAC()){
            pilih="sesuai";
            JOptionPane.showMessageDialog(null, pilih);
        }else{
            pilih="tidak sesuai";
            JOptionPane.showMessageDialog(null, pilih);
        }
        return pilih;
    }
    String JumlahCCTV(){
        String pilih;
        if(getJumlahCCTV()==2){
            pilih="sesuai";
            JOptionPane.showMessageDialog(null, pilih);
        }else{
            pilih="tidak sesuai";
            JOptionPane.showMessageDialog(null, pilih);
        }
        return pilih;
    }
    String PosisiCCTV(){
        String pilih;
        if(getPosisiCCTV()==1&&getPosisiCCTV()==3){
            pilih="sesuai";
            JOptionPane.showMessageDialog(null, pilih);
        }else{
            pilih="tidak sesuai";
            JOptionPane.showMessageDialog(null, pilih);
        }
        return pilih;
    }
    String SSID(){
        String pilih;
        if(getSSID()==0){
            pilih="sesuai";
            JOptionPane.showMessageDialog(null, pilih);
        }else{
            pilih = "tidak sesuai";
            JOptionPane.showMessageDialog(null, pilih);
        }
        return pilih;
    }
    String loginusername(){
        String pilih;
        if(getPilih_username() .equals(getUsername())){
            pilih ="sesuai";
            JOptionPane.showMessageDialog(null, pilih);
        }else{
            pilih="tidak sesuai";
            JOptionPane.showMessageDialog(null, pilih);
        }
        return pilih;
    }
    String loginpasword(){
        String pilih;
        if (getPilih_pasword().equals(getPasword())){
            pilih="sesuai";
            JOptionPane.showMessageDialog(null, pilih);
        }else{
            pilih ="tidak sesuai";
            JOptionPane.showMessageDialog(null, pilih);
            
        }
        return pilih;
    }
    @Override
    void deklarasi1() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
