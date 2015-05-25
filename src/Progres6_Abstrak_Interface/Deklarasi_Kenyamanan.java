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
public class Deklarasi_Kenyamanan {
    Scanner scan = new Scanner(System.in);
    void deklarasi(){
        deklarasi_kenyamanan(new Kenyamanan("Tahap Kondisi Kenyamanan"));
        deklarasi_keamanan(new Kenyamanan("Tahap Kondisi Keamanan"));      
    }
    public void deklarasi_kenyamanan(Kenyamanan test) {
        test.deklarasi1();
    }
    public void deklarasi_keamanan(Kenyamanan test) {
        test.deklarasi2();
    }
}
