import java.util.ArrayList;

public class Sachovnica {
    private ArrayList<Stvorec> policka;
    
    public Sachovnica(int sirka, int vyska) {
        this.policka = new ArrayList<Stvorec>();
        
        for (int riadok = 0; riadok < vyska; riadok++) {
            for (int stlpec = 0; stlpec < sirka; stlpec++) {
                Stvorec policko = new Stvorec();
                policko.zmenStranu(20);
                policko.posunVodorovne((sirka - stlpec - 1) * 20 - 60);
                policko.posunZvisle(riadok * 20 - 50);
                if ((riadok + stlpec) % 2 == 0) {
                    policko.zmenFarbu("black");
                } else {
                    policko.zmenFarbu("white");
                }
                
                this.policka.add(policko);
            }
        }
    }
    
    public void zobraz() {
        for (Stvorec policko : this.policka) {
            policko.zobraz();
        }
    }
    
    public void skry() {
        for (Stvorec policko : this.policka) {
            policko.skry();
        }
    }
}
