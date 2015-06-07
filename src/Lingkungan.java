import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Lingkungan extends Ruangkelas implements Deklarasi{
    Input_lingkungan test = new Input_lingkungan();
    public Lingkungan(String kondisi) {//konstraktor
        super(kondisi);
    }
    
    @Override
    void deklarasi1() {
        setKondisiLingkungan(1, 1, 1, 1, 1);
        System.out.println(getKondisi());
        System.out.println("A. Bagaimana keaadaan lantai");
        System.out.println("1. bersih ");
        System.out.println("2. tidak bersih");
        System.out.print("Jawab : ");
        test.setPilih_lantai(scan.nextInt());
        System.out.println("Kondisi lantai :"+string1());
        
        System.out.println("B. Bagaimana keaadaan dinding");
        System.out.println("1. bersih");
        System.out.println("2. tidak bersih");
        System.out.print("Jawab : ");
        test.setPilih_dinding(scan.nextInt());
        System.out.println("Kondisi dinding :"+string2());
                
        System.out.println("C. Bagaimana keaadaan atap");
        System.out.println("1. bersih");
        System.out.println("2. tidak bersih");
        System.out.print("Jawab : ");  
        test.setPilih_atap(scan.nextInt());
        System.out.println("Kondisi atap :"+string3());
        
        System.out.println("D. Bagaimana keaadaan pintu");
        System.out.println("1. bersih");
        System.out.println("2. tidak bersih");
        System.out.print("Jawab : ");
        test.setPilih_pintu(scan.nextInt());
        System.out.println("Kondisi pintu :"+string4());
        
        System.out.println("E. Bagaimana keaadaan jendela");
        System.out.println("1. bersih");
        System.out.println("2. tidak bersih");
        System.out.print("Jawab : ");
        test.setPilih_jendela(scan.nextInt());
        System.out.println("Kondisi jendela :"+string5());
        System.out.println("");
        try(FileOutputStream fs = new FileOutputStream("data.txt")){
                ObjectOutputStream ob = new ObjectOutputStream(fs);
                ob.writeObject(test);
                ob.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        
            try (FileInputStream fs = new FileInputStream("data.txt")){
                ObjectInputStream ib = new ObjectInputStream(fs);
                Input_lingkungan il = (Input_lingkungan) ib.readObject();
                System.out.println("Lantai "+il.getPilih_lantai());
                System.out.println("Atap "+il.getPilih_atap());
                System.out.println("Dinding "+il.getPilih_dinding());
                System.out.println("Jendela "+il.getPilih_jendela());
                System.out.println("Pintu "+il.getPilih_pintu());
                ib.close();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Lingkungan.class.getName()).log(Level.SEVERE, null, ex);
            }catch(IOException e){
                e.printStackTrace();
            }
    }
    void saving_objek(){
        
    }
    @Override
    public void deklarasi2() {
        System.out.println(getKondisi());
        setKondisiLingkungan(1);
        System.out.println("A. Bagaimana sirkulasi udara kelas");
        System.out.println("1. lancar");
        System.out.println("2. tidak lancar");
        System.out.print("Jawab : ");
        test.setPilih_sirkulasi(scan.nextInt());
        System.out.println("Sirkulasi udara : "+string6());
        
        System.out.println("B. Berapa nilai pencayahan kelas");
        System.out.print("jawab : ");
        test.setPencayahan(scan.nextInt());
        System.out.println("Pencayahan :"+pencayahan());
                
        System.out.println("C. Berapa nilai kelembapan kelas");
        System.out.print("jawab : ");
        test.setKelembapan(scan.nextInt());
        System.out.println("Kelembapan :"+kelembapan());
        
        System.out.println("D. Berapa nilai suhu ruangan");
        System.out.print("jawab : ");
        test.setSuhu(scan.nextInt());
        System.out.println("Suhu :"+suhu());
        System.out.println("");
        try(FileOutputStream fs = new FileOutputStream("data.txt")){
                ObjectOutputStream ob = new ObjectOutputStream(fs);
                ob.writeObject(test);
                ob.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        
            try (FileInputStream fs = new FileInputStream("data.txt")){
                ObjectInputStream ib = new ObjectInputStream(fs);
                Input_lingkungan il = (Input_lingkungan) ib.readObject();
                System.out.println("Sirkulasi udara "+il.getPilih_sirkulasi());
                System.out.println("Pencayahan "+il.getPencayahan());
                System.out.println("Kelembapan "+il.getKelembapan());
                System.out.println("Suhu "+il.getSuhu());
                ib.close();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Lingkungan.class.getName()).log(Level.SEVERE, null, ex);
            }catch(IOException e){
                e.printStackTrace();
            }
        
    }
    
    
    
    @Override
    String string1() {   //kebersihan lantai   
        a=test.getPilih_lantai();
        b=getLantai();
        return super.string1();
    }

    @Override
    String string2() {//kebersihan dinding
        a=test.getPilih_dinding();
        b=getDinding();
        return super.string2();
    }
    
    @Override
    String string3() {//kebersihan atap
        a=test.getPilih_atap();
        b=getAtap();
        return super.string3();
    }

    @Override
    String string4() {// kebersihan pintu
        a=test.getPilih_pintu();
        b=getPintu();
        return super.string4();
    }

    @Override
    String string5() {//kebersihan jendela
        a=test.getPilih_jendela();
        b=getJendela();
        return super.string5();
    }

    @Override
    String string6() {//sirkulasi udara
        a=test.getPilih_sirkulasi();
        b=getSirkulasi_udara();
        return super.string6();
    }
    
    String pencayahan(){
        String pilih;
        if(test.getPencayahan()>=250 && test.getPencayahan()<=350){
            pilih = "sesuai";
        }else{
            pilih = "tidak sesuai";
        }
        return pilih;
    }
    String kelembapan(){
        String pilih;
        if(test.getKelembapan()>=70 && test.getKelembapan()<=80){
            pilih="sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String suhu(){
        String pilih;
        if(test.getSuhu()>=25 && test.getSuhu()<=35){
            pilih = "sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
}
