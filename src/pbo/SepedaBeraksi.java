package pbo;

import java.util.Scanner;

public class SepedaBeraksi {
    public static void main(String[] args) {
        //objek
        //Sepeda spd = new Sepeda("Polygon","0105");
        
        //System.out.println(spd.displayInfo());
        //System.out.println(spd.displayInfo("bagus"));
        
    //error Handling 
    try{
        //IO sederhana
        Scanner scanner = new Scanner (System.in);
        
        //array
        SepedaDetail[] spd = new SepedaDetail[3];
        
        //perulangan
        for(int i=0; i<spd.length; i++){
        System.out.print("Masukkan Merek Sepeda "+(i+1)+": ");
        String merek = scanner.nextLine();
        System.out.print("Masukkan Nomor Barang "+(i+1)+": ");
        String nobarang = scanner.nextLine();
        
        //objek
        spd[i] = new SepedaDetail (merek, nobarang);
        }
        
        //perulangan
        for (SepedaDetail data: spd){
            System.out.println("                 ");
            System.out.println("*******************");
            System.out.println("Data Sepeda");
            System.out.println(data.displayInfo());
        }
    } catch (NumberFormatException e){
        System.out.println("Kesalahan Format Angka Barang: "+e.getMessage());
    } catch (Exception e){
        System.out.println("Kesalahan Umum: "+e.getMessage());
    }
    
    }
}
