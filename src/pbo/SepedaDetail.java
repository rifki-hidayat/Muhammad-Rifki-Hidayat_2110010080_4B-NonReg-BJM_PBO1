package pbo;

//inheritance
public class SepedaDetail extends Sepeda{
    //overidding
    public SepedaDetail (String merek, String nobarang){
        super(merek, nobarang);
    }
    
    public String getJenisSepeda(){
        //seleksi if
        if ("01".equals(getNobarang().substring(0, 2))){
            return "Sepeda Gunung";
        } if ("02".equals(getNobarang().substring(0, 2))){
            return "Sepeda Lipat";
        } if ("03".equals(getNobarang().substring(0, 2))){
            return "Sepeda Listrik";
        } else {
           return "Jenis Sepeda Tidak diketahui";
        }
    }
    
    public int getBarangMasuk(){
        return Integer.parseInt(getNobarang().substring(2));
    }
    
    //polymorphism (overriding)
    @Override
    public String displayInfo(){
        return super.displayInfo()+
                "\nJenis Sepeda       : "+getJenisSepeda()+
                "\nNomor Barang Masuk : "+getBarangMasuk();
    }
            
}
