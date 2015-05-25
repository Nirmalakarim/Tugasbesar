/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Progres6_Abstrak_Interface;

import java.util.Scanner;

/**
 *
 * @author NirmalaKarim
 */
public class Deklarasi_Fasilitas {
    Scanner scan = new Scanner(System.in);
    void deklarasi (){
        analisa_sarana(new Fasilitas("Tahap Jumlah, Kondisi, Posisi Sarana"));
    }

    public void analisa_sarana(Fasilitas kondisi) {
        kondisi.deklarasi1();
    }
}
