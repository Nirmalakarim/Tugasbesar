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
public class Deklarasi_kondisi {
    Scanner scan = new Scanner(System.in);
    void deklarasi(){
        identitas (new Identitas_kondisi("Tahap Identitas Kelas"));
        kondisi (new Identitas_kondisi("Tahap Kondisi Kelas"));
    }
    public void identitas(Identitas_kondisi test) {
        test.deklarasi1();
       
    }
    public void kondisi(Identitas_kondisi test) {
        test.deklarasi2();
    }

    
}
