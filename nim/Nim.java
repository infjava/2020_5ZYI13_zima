
public class Nim {
    private Kamen kamen;
    private String[] menaHracov;
    private boolean prvyNaTahu;
    private String menoVyhercu;
    
    public Nim(int sirka, int vyska, String menoPrveho, String menoDruheho) {
        Sachovnica sachovnica = new Sachovnica(sirka, vyska);
        this.kamen = sachovnica.vytvorKamen();
        sachovnica.zobraz();
        this.menaHracov = new String[] {menoPrveho, menoDruheho};
        this.prvyNaTahu = true;
        this.menoVyhercu = null;
    }
    
    public String getMenoVyhercu() {
        return this.menoVyhercu;
    }
    
    public String getHracNaTahu() {
        if (this.prvyNaTahu) {
            return this.menaHracov[0];
        } else {
            return this.menaHracov[1];
        }
    }
    
    public void posunDole(int oKolko) {
        if (oKolko <= 0) {
            System.out.println("Musis tahat o kladny pocet policok");
            return;
        }
        int stlpec = this.kamen.getPoziciaStlpec();
        int riadok = this.kamen.getPoziciaRiadok() - oKolko;
        if (riadok < 1) {
            System.out.println("Snazis sa vybehnut zo sachovnice");
            return;
        }
        this.kamen.posunSa(riadok, stlpec);
        
        if (this.kamen.getPoziciaRiadok() == 1 && this.kamen.getPoziciaStlpec() == 1) {
            this.menoVyhercu = this.getHracNaTahu();
        }
        
        this.prvyNaTahu = !this.prvyNaTahu;
    }

    public void posunVlavo(int oKolko) {
        if (oKolko <= 0) {
            System.out.println("Musis tahat o kladny pocet policok");
            return;
        }
        int stlpec = this.kamen.getPoziciaStlpec() - oKolko;
        int riadok = this.kamen.getPoziciaRiadok();
        if (stlpec < 1) {
            System.out.println("Snazis sa vybehnut zo sachovnice");
            return;
        }
        this.kamen.posunSa(riadok, stlpec);
        
        if (this.kamen.getPoziciaRiadok() == 1 && this.kamen.getPoziciaStlpec() == 1) {
            this.menoVyhercu = this.getHracNaTahu();
        }
        
        this.prvyNaTahu = !this.prvyNaTahu;
    }
}
