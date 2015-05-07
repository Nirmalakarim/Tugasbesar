
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dini Saputri Y
 */
public class Fasilitas {
     
Scanner scan = new Scanner(System.in);
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
 
    public int getJumlahsteker() {
        return Jumlahsteker;
    }

    public void setJumlahsteker(int Jumlahsteker) {
        this.Jumlahsteker = Jumlahsteker;
    }

    public int getKondisisteker() {
        return kondisisteker;
    }

    public void setKondisisteker(int kondisisteker) {
        this.kondisisteker = kondisisteker;
    }

    public int getPosisisteker() {
        return posisisteker;
    }

    public void setPosisisteker(int posisisteker) {
        this.posisisteker = posisisteker;
    }

    public int getJumlahkabelLCD() {
        return jumlahkabelLCD;
    }

    public void setJumlahkabelLCD(int jumlahkabelLCD) {
        this.jumlahkabelLCD = jumlahkabelLCD;
    }

    public int getKondisikabelLCD() {
        return kondisikabelLCD;
    }

    public void setKondisikabelLCD(int kondisikabelLCD) {
        this.kondisikabelLCD = kondisikabelLCD;
    }

    public int getPosisikabelLCD() {
        return posisikabelLCD;
    }

    public void setPosisikabelLCD(int posisikabelLCD) {
        this.posisikabelLCD = posisikabelLCD;
    }

    public int getJumlahlampu() {
        return jumlahlampu;
    }

    public void setJumlahlampu(int jumlahlampu) {
        this.jumlahlampu = jumlahlampu;
    }

    public int getKondisilampu() {
        return kondisilampu;
    }

    public void setKondisilampu(int kondisilampu) {
        this.kondisilampu = kondisilampu;
    }

    public int getPosisilampu() {
        return posisilampu;
    }

    public void setPosisilampu(int posisilampu) {
        this.posisilampu = posisilampu;
    }

    public int getJumlahkipasangin() {
        return jumlahkipasangin;
    }

    public void setJumlahkipasangin(int jumlahkipasangin) {
        this.jumlahkipasangin = jumlahkipasangin;
    }

    public int getKondisikipasangin() {
        return kondisikipasangin;
    }

    public void setKondisikipasangin(int kondisikipasangin) {
        this.kondisikipasangin = kondisikipasangin;
    }

    public int getPosisikipasangin() {
        return posisikipasangin;
    }

    public void setPosisikipasangin(int posisikipasangin) {
        this.posisikipasangin = posisikipasangin;
    }

    public int getJumlahAC() {
        return jumlahAC;
    }

    public void setJumlahAC(int jumlahAC) {
        this.jumlahAC = jumlahAC;
    }

    public int getKondisiAC() {
        return kondisiAC;
    }

    public void setKondisiAC(int kondisiAC) {
        this.kondisiAC = kondisiAC;
    }

    public int getPosisiAC() {
        return posisiAC;
    }

    public void setPosisiAC(int posisiAC) {
        this.posisiAC = posisiAC;
    }

    public int getSSID() {
        return SSID;
    }

    public void setSSID(int SSID) {
        this.SSID = SSID;
    }

    public int getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(int bandwidth) {
        this.bandwidth = bandwidth;
    }

    public int getJumlahCCTV() {
        return jumlahCCTV;
    }

    public void setJumlahCCTV(int jumlahCCTV) {
        this.jumlahCCTV = jumlahCCTV;
    }

    public int getKondisiCCTV() {
        return kondisiCCTV;
    }

    public void setKondisiCCTV(int kondisiCCTV) {
        this.kondisiCCTV = kondisiCCTV;
    }

    public int getPosisiCCTV() {
        return posisiCCTV;
    }

    public void setPosisiCCTV(int posisiCCTV) {
        this.posisiCCTV = posisiCCTV;
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
    String kondisiSteker (){
        String pilih ;
        if(getKondisisteker()==1){
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
    String KondisiKabelLCD(){
        String pilih;
        if(getKondisikabelLCD()==1){
            pilih="sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String PosisiKabelLCD(){
        String pilih;
        if(getPosisikabelLCD()==2){
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
    String KondisiLampu(){
        String pilih;
        if(getKondisilampu()==1){
            pilih="sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String PosisiLampu(){
        String pilih;
        if(getPosisilampu()==3){
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
    String KondisiKipasAngin(){
        String pilih;
        if(getKondisikipasangin()==1){
            pilih="sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String PosisiKipasAngin(){
        String pilih;
        if(getPosisikipasangin()==3){
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
    String KondisiAC(){
        String pilih;
        if(getKondisiAC()==1){
            pilih="sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String PosisiAC(){
        String pilih;
        if(getPosisiAC()==1||getPosisiAC()==2){
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
    String KondisiCCTV(){
        String pilih;
        if(getKondisiCCTV()==1){
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
}
