
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dini Saputri Y
 */
public class testFasilitas {
  
    Scanner scan = new Scanner(System.in);
    Fasilitas test = new Fasilitas();
    public static void main(String[]args) {
    //Scanner scan = new Scanner(System.in);
    
      Fasilitas test = new Fasilitas();
      test.setPosisisteker("Posisi steker");
      test.setPosisilampu("Posisi lampu");
      test.setPosisikipasangin("Posisi kipas angin");
      test.setPosisikabelLCD("Posisi kabel LCD");
      test.setKondisiLCD("Kondisi kabel LCD");
      test.setSSID("SSID");
      test.setBandwith("Banddwith");
    }
    private int getJumlahsteker;
    private String getPosisisteker;
    private int getKondisisteker;
    private int getJumlahlampu;
    private String getPosisilampu;
    private int getKondisilampu;
    private int getJumlahLCD;
    private String getKondisiLCD;
    private String getPosisiLCD;
    private int getJumlahAC;
    private String getKondisiAC;
    private String getPosisiAC;
    private int getJumlahCCTV;
    private int getKondisiCCTV;
    private int getJumlahkipasangin;
          
      void kelistrikan(){
          System.out.println("masukan jumlah steker: "+getJumlahsteker);
        int steker = scan.nextInt();
        if ( getJumlahsteker>= 4 ) {
            System.out.println("sesuai");
        }   
        else {
            System.out.println("tidak sesuai");
        }
    
          
          System.out.println("masukan kondisi steker: "+getKondisisteker);
          getKondisisteker = scan.nextInt();
         if (getKondisisteker == 4) {
            System.out.println("sesuai");
        }
         else {
            System.out.println("tidak sesuai");
        }
    

      System.out.println("masukan posisi steker :  ");
        String ps = scan.next();
        if(ps.equals(test.getPosisisteker())){
            System.out.println("sesuai");
        }else {
            System.out.println("tidak sesuai");
        }
      
      }

 void LCD(){
          System.out.println("masukan jumlah kabel LCD: "+getJumlahsteker);
          int LCD = scan.nextInt();
        if ( getJumlahsteker >= 1 ) {
            System.out.println("sesuai");
        }
     else {
            System.out.println("tidak sesuai");
        }

       System.out.println("masukan kondisi kabel LCD : ");
         String kl = scan.next();
        if(kl.equals(test.getKondisiLCD())){
            System.out.println("sesuai");
        } else {
            System.out.println("tidak sesuai");
        }


       System.out.println("masukan posisi LCD  : ");
       String dd = scan.next();
       if(dd.equals(test.getPosisikabelLCD())) {
            System.out.println("sesuai");
        }
       else {
            System.out.println("tidak sesuai");
        }
 }
 
 void lampu(){
         System.out.println("masukan jumlah lampu: "+getJumlahlampu);
         int lampu = scan.nextInt();
        if ( getJumlahlampu >= 18 ) {
         System.out.println("sesuai");
     }
     else {
         System.out.println("tidak sesuai");
     }

        int kondisilampu;
          System.out.println("masukan kondisi lampu: ");
          getKondisilampu = scan.nextInt();
         if (getKondisilampu == 18) {
         System.out.println("sesuai");
     }
         else {
         System.out.println("tidak sesuai");
     }

       System.out.println("masukan posisi lampu : ");
       String pl = scan.next();
       if(pl.equals(test.getPosisilampu())) {
         System.out.println("sesuai");
     }
       else {
         System.out.println("tidak sesuai");
     }
 }
 
   void kipasangin(){
          System.out.println("masukan jumlah jumlahkipas: ");
          int Kipasangin = scan.nextInt();
        if ( getJumlahkipasangin >= 2 ) {
         System.out.println("sesuai");
     }
    else {
         System.out.println("tidak sesuai");
     }

          int kondisikipasangin;
          System.out.println("masukan kondisi kipas angin : ");
          kondisikipasangin = scan.nextInt();
         if (kondisikipasangin == 2) {
         System.out.println("sesuai");
     }
         else {
         System.out.println("tidak sesuai");
     }


       System.out.println("masukan posisi kipas angin : ");
       String pka = scan.next();
       if(pka.equals(test.getPosisikipasangin())) {
         System.out.println("sesuai");
     }
       else {
         System.out.println("tidak sesuai");
     }
           
 }
               
           
  void AC(){
          System.out.println("masukan jumlah AC : "+getJumlahAC);
          //JumlahAC = scan.nextInt();
        if ( getJumlahAC >= 1) {
          System.out.println("sesuai");
      }
     else {
          System.out.println("tidak sesuai");
      }

        System.out.println("masukan kondisi AC :");
       String kac = scan.next();
       if(kac.equals(test.getKondisiAC())) {
          System.out.println("sesuai");
      }
       else {
          System.out.println("tidak sesuai");
      }

       System.out.println("masukan posisi AC :");
       String pac = scan.next();
       if(pac.equals(test.getPosisi_AC())) {
          System.out.println("sesuai");
      }
       else {
          System.out.println("tidak sesuai");
      }
  }

void internet(){
       System.out.println("pilih SSID : ");
      String UMMhotspot = scan.next();
       if(UMMhotspot.equals(test.getSSID())) {
        System.out.println("sesuai");
    }
       else {
        System.out.println("tidak sesuai");
    }

      
       System.out.println("input Bandwith : ");
        String bisalogin = scan.next();
       if(bisalogin.equals(test.getBandwith())) {
        System.out.println("sesuai");
    }
       else {
        System.out.println("tidak sesuai");
    }
}

 void CCTV(){
          System.out.println("masukan jumlah CCTV : "+getJumlahCCTV);
          int CCTV = scan.nextInt();
        if ( getJumlahCCTV >= 2) {
         System.out.println("sesuai");
     }
     else {
         System.out.println("tidak sesuai");
     }

        
          System.out.println("masukan kondisi CCTV : "+getKondisiCCTV);
          getKondisiCCTV = scan.nextInt();
        if ( getKondisiCCTV == 2) {
         System.out.println("sesuai");
     }
     else {
         System.out.println("tidak sesuai");
     }

       System.out.println("masukan posisi CCTV :");
       String pc = scan.next();
       if(pc.equals(test.getPosisi_CCTV())) {
         System.out.println("sesuai");
     }
       else {
         System.out.println("tidak sesuai");
     }


}

}




