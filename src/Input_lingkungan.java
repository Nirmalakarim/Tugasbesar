import java.io.Serializable;

public class Input_lingkungan implements Serializable{
    private int pilih_atap;
    private int pilih_dinding;
    private int pilih_jendela;
    private int pilih_pintu;
    private int pilih_lantai;
    private int pilih_sirkulasi;
    private int pencayahan;
    private int kelembapan;
    private int suhu;

    public int getPilih_atap() {
        return pilih_atap;
    }

    public void setPilih_atap(int pilih_atap) {
        this.pilih_atap = pilih_atap;
    }

    public int getPilih_dinding() {
        return pilih_dinding;
    }

    public void setPilih_dinding(int pilih_dinding) {
        this.pilih_dinding = pilih_dinding;
    }

    public int getPilih_jendela() {
        return pilih_jendela;
    }

    public void setPilih_jendela(int pilih_jendela) {
        this.pilih_jendela = pilih_jendela;
    }

    public int getPilih_pintu() {
        return pilih_pintu;
    }

    public void setPilih_pintu(int pilih_pintu) {
        this.pilih_pintu = pilih_pintu;
    }

    public int getPilih_lantai() {
        return pilih_lantai;
    }

    public void setPilih_lantai(int pilih_lantai) {
        this.pilih_lantai = pilih_lantai;
    }

    public int getPilih_sirkulasi() {
        return pilih_sirkulasi;
    }

    public void setPilih_sirkulasi(int pilih_sirkulasi) {
        this.pilih_sirkulasi = pilih_sirkulasi;
    }

    public int getPencayahan() {
        return pencayahan;
    }

    public void setPencayahan(int pencayahan) {
        this.pencayahan = pencayahan;
    }

    public int getKelembapan() {
        return kelembapan;
    }

    public void setKelembapan(int kelembapan) {
        this.kelembapan = kelembapan;
    }

    public int getSuhu() {
        return suhu;
    }

    public void setSuhu(int suhu) {
        this.suhu = suhu;
    }
    
}
