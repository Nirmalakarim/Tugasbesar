
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author asus cb46c
 */
public class Deklarasi_kondisi{
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
