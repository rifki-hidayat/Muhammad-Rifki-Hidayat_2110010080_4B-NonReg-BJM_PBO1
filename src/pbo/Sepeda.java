package pbo;

public class Sepeda {
    //atribut dan encaptulation
    private String merek;
    private String nobarang;

    //constructor
    public Sepeda(String merek, String nobarang) {
        this.merek = merek;
        this.nobarang = nobarang;
    }
    
    //mutator (setter)
    public void setMerek(String merek) {
        this.merek = merek;
    }

    public void setNobarang(String nobarang) {
        this.nobarang = nobarang;
    }
    
    //accessor (getter)
    public String getMerek() {
        return merek;
    }

    public String getNobarang() {
        return nobarang;
    }
    
    public String displayInfo(){
        return "Merek Sepeda : "+getMerek()+"\nNo Barang : "+getNobarang();
    }
    
    //polymorphism (overloading)
    public String displayInfo (String kondisi){
        return displayInfo ()+ "        Kondisi : "+kondisi; 
    }
}
