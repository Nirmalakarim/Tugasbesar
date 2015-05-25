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
public class Kenyamanan extends RuangKelas implements deklarasi{
    int pilih_kebisingan;
    int pilih_bau;
    int pilih_kebocoran;
    int pilih_kerusakan;
    int pilih_keausan;
    int pilih_kekokohan;
    int pilih_kuncipintu;
    int pilih_kuncijendela;
    int pilih_bahaya;

    public Kenyamanan(String kondisi) {
        super(kondisi);//konstraktor
    }

    //override
    @Override
    public void setKondisiKenyamanan(int kebisingan, int bau, int kebocoran, int kerusakan, int keausan) {
        super.setKondisiKenyamanan(kebisingan, bau, kebocoran, kerusakan, keausan);
    }

    @Override
    public void setKondisiKenyamanan(int kekokohan, int kunci_pintu, int kunci_jendela, int bahaya) {
        super.setKondisiKenyamanan(kekokohan, kunci_pintu, kunci_jendela, bahaya);
    }
    
    
    //enkapsulasi
    public int getPilih_kebisingan() {
        return pilih_kebisingan;
    }

    public void setPilih_kebisingan(int pilih_kebisingan) {
        this.pilih_kebisingan = pilih_kebisingan;
    }

    public int getPilih_bau() {
        return pilih_bau;
    }

    public void setPilih_bau(int pilih_bau) {
        this.pilih_bau = pilih_bau;
    }

    public int getPilih_kebocoran() {
        return pilih_kebocoran;
    }

    public void setPilih_kebocoran(int pilih_kebocoran) {
        this.pilih_kebocoran = pilih_kebocoran;
    }

    public int getPilih_kerusakan() {
        return pilih_kerusakan;
    }

    public void setPilih_kerusakan(int pilih_kerusakan) {
        this.pilih_kerusakan = pilih_kerusakan;
    }

    public int getPilih_keausan() {
        return pilih_keausan;
    }

    public void setPilih_keausan(int pilih_keausan) {
        this.pilih_keausan = pilih_keausan;
    }

    public int getPilih_kekokohan() {
        return pilih_kekokohan;
    }

    public void setPilih_kekokohan(int pilih_kekokohan) {
        this.pilih_kekokohan = pilih_kekokohan;
    }

    public int getPilih_kuncipintu() {
        return pilih_kuncipintu;
    }

    public void setPilih_kuncipintu(int pilih_kuncipintu) {
        this.pilih_kuncipintu = pilih_kuncipintu;
    }

    public int getPilih_kuncijendela() {
        return pilih_kuncijendela;
    }

    public void setPilih_kuncijendela(int pilih_kuncijendela) {
        this.pilih_kuncijendela = pilih_kuncijendela;
    }

    public int getPilih_bahaya() {
        return pilih_bahaya;
    }

    public void setPilih_bahaya(int pilih_bahaya) {
        this.pilih_bahaya = pilih_bahaya;
    }

    @Override
    void deklarasi1() {
        setKondisiKenyamanan(2, 2, 2, 2, 2);
        System.out.println(kondisi);
        System.out.println("A. Apakah di kelas bising");
        System.out.println("1. Bising");
        System.out.println("2. Tidak Bising");
        System.out.print("Jawab : ");
        setPilih_kebisingan(scan.nextInt());
        System.out.println("Kebisingan :"+string1());
        
        System.out.println("B. Apakah di kelas bau");
        System.out.println("1. Bau");
        System.out.println("2. Tidak Bau");
        System.out.print("Jawab : ");
        setPilih_bau(scan.nextInt());
        System.out.println("Bau :"+string2());
               
        System.out.println("C. Apakah di kelas ada yang bocor");
        System.out.println("1. Ada ");
        System.out.println("2. Tidak Ada");
        System.out.print("Jawab : ");
        setPilih_kebocoran(scan.nextInt());
        System.out.println("Kebocoran :"+string3());
        
        System.out.println("D. Apakah di kelas ada aus");
        System.out.println("1. Ada ");
        System.out.println("2. Tidak Ada");
        System.out.print("Jawab : ");
        setPilih_keausan(scan.nextInt());
        System.out.println("Keausan :"+string4());
        
        System.out.println("E. Apakah di kelas ada yang rusak");
        System.out.println("1. Ada ");
        System.out.println("2. Tidak Ada ");
        System.out.print("Jawab : ");
        setPilih_kerusakan(scan.nextInt());
        System.out.println("Kerusakan :"+string5());
    }

    @Override
    public void deklarasi2() {
        setKondisiKenyamanan(1, 1, 1, 1);
        System.out.println(kondisi);
        System.out.println("A. Apakah kelas masih kokoh");
        System.out.println("1. Masih Kokoh");
        System.out.println("2. Tidak Kokoh");
        System.out.print("Jawab : ");
        setPilih_kekokohan(scan.nextInt());
        System.out.println("Kekokohan :"+string6());
        
        System.out.println("B. Bagaimana keaadaan kunci pintu");
        System.out.println("1. Ada");
        System.out.println("2. Tidak ada");
        System.out.print("Jawab : ");
        setPilih_kuncipintu(scan.nextInt());
        
        System.out.println("C. Bagaimana keaadaan kunci jendela");
        System.out.println("1. Ada");
        System.out.println("2. Tidak ada");
        System.out.print("Jawab : ");
        setPilih_kuncijendela(scan.nextInt());
        System.out.println("Analisis kunci pintu dan jendela :"+kunci());
        
        System.out.println("D. Apakah di kelas ada Bahaya");
        System.out.println("1. Aman");
        System.out.println("2. Tidak Aman");
        System.out.print("Jawab : ");
        setPilih_bahaya(scan.nextInt());
        System.out.println("Keamanan :"+string7());
    }

    @Override
    String string1() {
        a=getPilih_kebisingan();
        b=kebisingan;
        return super.string1();
    }

    @Override
    String string2() {
        a=getPilih_bau();
        b=bau;
        return super.string2();
    }

    @Override
    String string3() {
        a=getPilih_kebocoran();
        b=kebocoran;
        return super.string3();
    }

    @Override
    String string4() {
        a=getPilih_keausan();
        b=keausan;
        return super.string4();
    }

    @Override
    String string5() {
        a=getPilih_kerusakan();
        b=kerusakan;
        return super.string5();
    }

    @Override
    String string6() {
        a=getPilih_kekokohan();
        b=kekokohan;
        return super.string6();
    }

    @Override
    String string7() {
        a=getPilih_bahaya();
        b=bahaya;
        return super.string7();
    }
    String kunci(){
        String pilih;
        if(getPilih_kuncipintu()==kunci_pintu && getPilih_kuncijendela()==kunci_jendela){
            pilih="sesuai";
        } else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
}
