/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NirmalaKarim
 */
public class Deklarasi_kondisi {
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
