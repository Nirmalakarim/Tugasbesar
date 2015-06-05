public class Deklarasi_kondisi {
    void deklarasi(){
        identitas (new Identitas_Kondisi("Tahap Identitas Kelas"));
        kondisi (new Identitas_Kondisi("Tahap Kondisi Kelas"));
    }
    public void identitas(Identitas_Kondisi test) {
        test.deklarasi1();
       
    }
    public void kondisi(Identitas_Kondisi test) {
        test.deklarasi2();
    }

    
}
