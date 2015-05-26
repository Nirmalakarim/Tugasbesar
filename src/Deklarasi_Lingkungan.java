/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NirmalaKarim
 */
public class Deklarasi_Lingkungan {
    void deklarasi (){
        deklarasi_lingkungan (new Lingkungan("Tahap Kondisi Lingkungan"));
        deklarasi_kebersihan (new Lingkungan("Tahap Kondisi Kebersihan"));
    }    

    public void deklarasi_lingkungan(Lingkungan test) {
        test.deklarasi1();
    }
    private void deklarasi_kebersihan(Lingkungan test) {        
        test.deklarasi2();
    }
}
