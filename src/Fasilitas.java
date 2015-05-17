/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dini Saputri Y
 */
public class Fasilitas extends Ruangkelas{
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
        if(getPilih_kondisisteker()==kondisisteker){
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
        if(getPilih_kondisikabel()==kondisikabelLCD){
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
    String KondisiLampu(){
        String pilih;
        if(getPilih_kondisilampu()==kondisilampu){
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
    String KondisiKipasAngin(){
        String pilih;
        if(getPilih_kondisikipas()==kondisikipasangin){
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
    String KondisiAC(){
        String pilih;
        if(getPilih_kondisiac()==kondisiAC){
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
    String KondisiCCTV(){
        String pilih;
        if(getPilih_kondisicctv()==kondisiCCTV){
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
