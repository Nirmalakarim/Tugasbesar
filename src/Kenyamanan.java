/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author NirmalaKarim
 */
public class Kenyamanan extends Ruangkelas implements Deklarasi{
    Input_kenyamanan test = new Input_kenyamanan();
    public Kenyamanan(String kondisi) {
        super(kondisi);//konstraktor
    }

    @Override
    void deklarasi1() {
        setKondisiKenyamanan(2, 2, 2, 2, 2);
        System.out.println(getKondisi());
        System.out.println("A. Apakah di kelas bising");
        System.out.println("1. Bising");
        System.out.println("2. Tidak Bising");
        System.out.print("Jawab : ");
        test.setPilih_kebisingan(scan.nextInt());
        System.out.println("Kebisingan :"+string1());
        
        System.out.println("B. Apakah di kelas bau");
        System.out.println("1. Bau");
        System.out.println("2. Tidak Bau");
        System.out.print("Jawab : ");
        test.setPilih_bau(scan.nextInt());
        System.out.println("Bau :"+string2());
               
        System.out.println("C. Apakah di kelas ada yang bocor");
        System.out.println("1. Ada ");
        System.out.println("2. Tidak Ada");
        System.out.print("Jawab : ");
        test.setPilih_kebocoran(scan.nextInt());
        System.out.println("Kebocoran :"+string3());
        
        System.out.println("D. Apakah di kelas ada aus");
        System.out.println("1. Ada ");
        System.out.println("2. Tidak Ada");
        System.out.print("Jawab : ");
        test.setPilih_keausan(scan.nextInt());
        System.out.println("Keausan :"+string4());
        
        System.out.println("E. Apakah di kelas ada yang rusak");
        System.out.println("1. Ada ");
        System.out.println("2. Tidak Ada ");
        System.out.print("Jawab : ");
        test.setPilih_kerusakan(scan.nextInt());
        System.out.println("Kerusakan :"+string5());
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
                Input_kenyamanan it = (Input_kenyamanan) ib.readObject();
                System.out.println("Kebisingan "+it.getPilih_kebisingan());
                System.out.println("Bau "+it.getPilih_bau());
                System.out.println("Kebocoran "+it.getPilih_kebocoran());
                System.out.println("Kerusakan "+it.getPilih_kerusakan());
                System.out.println("Keausan "+it.getPilih_keausan());
                ib.close();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Kenyamanan.class.getName()).log(Level.SEVERE, null, ex);
            }catch(IOException e){
                e.printStackTrace();
            }
    }

    @Override
    public void deklarasi2() {
        setKondisiKenyamanan(1, 1, 1, 1);
        System.out.println(getKondisi());
        System.out.println("A. Apakah kelas masih kokoh");
        System.out.println("1. Masih Kokoh");
        System.out.println("2. Tidak Kokoh");
        System.out.print("Jawab : ");
        test.setPilih_kekokohan(scan.nextInt());
        System.out.println("Kekokohan :"+string6());
        
        System.out.println("B. Bagaimana keaadaan kunci pintu");
        System.out.println("1. Ada");
        System.out.println("2. Tidak ada");
        System.out.print("Jawab : ");
        test.setPilih_kuncipintu(scan.nextInt());
        
        System.out.println("C. Bagaimana keaadaan kunci jendela");
        System.out.println("1. Ada");
        System.out.println("2. Tidak ada");
        System.out.print("Jawab : ");
        test.setPilih_kuncijendela(scan.nextInt());
        System.out.println("Analisis kunci pintu dan jendela :"+kunci());
        
        System.out.println("D. Apakah di kelas ada Bahaya");
        System.out.println("1. Aman");
        System.out.println("2. Tidak Aman");
        System.out.print("Jawab : ");
        test.setPilih_bahaya(scan.nextInt());
        System.out.println("Keamanan :"+string7());
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
                Input_kenyamanan it = (Input_kenyamanan) ib.readObject();
                System.out.println("Kekokohan "+it.getPilih_kekokohan());
                System.out.println("Kunci pintu "+it.getPilih_kuncipintu());
                System.out.println("Kunci jendela "+it.getPilih_kuncijendela());
                System.out.println("Bahaya "+it.getPilih_bahaya());
                ib.close();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Kenyamanan.class.getName()).log(Level.SEVERE, null, ex);
            }catch(IOException e){
                e.printStackTrace();
            }
    }

    @Override
    String string1() {
        a=test.getPilih_kebisingan();
        b=getKebisingan();
        return super.string1();
    }

    @Override
    String string2() {
        a=test.getPilih_bau();
        b=getBau();
        return super.string2();
    }

    @Override
    String string3() {
        a=test.getPilih_kebocoran();
        b=getKebocoran();
        return super.string3();
    }

    @Override
    String string4() {
        a=test.getPilih_keausan();
        b=getKeausan();
        return super.string4();
    }

    @Override
    String string5() {
        a=test.getPilih_kerusakan();
        b=getKerusakan();
        return super.string5();
    }

    @Override
    String string6() {
        a=test.getPilih_kekokohan();
        b=getKekokohan();
        return super.string6();
    }

    @Override
    String string7() {
        a=test.getPilih_bahaya();
        b=getBahaya();
        return super.string7();
    }
    String kunci(){
        String pilih;
        if(test.getPilih_kuncipintu()==getKunci_pintu() &&test.getPilih_kuncijendela()==getKunci_jendela()){
            pilih="sesuai";
        } else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
}
