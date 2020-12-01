public class Kamen {
    private Kruh kruh;
    
    private int poziciaRiadok;
    private int poziciaStlpec;
    
    public Kamen(Sachovnica sachovnica) {
        this.kruh = new Kruh();
        this.kruh.zmenPriemer(18);
        this.kruh.posunVodorovne(-19 + (sachovnica.getSirka() - 1) * 20);
        this.kruh.posunZvisle(-59);
        
        this.poziciaRiadok = sachovnica.getVyska();
        this.poziciaStlpec = sachovnica.getSirka();
    }
    
    public void zobraz() {
        this.kruh.zobraz();
    }
    
    public void skry() {
        this.kruh.skry();
    }
    
    public int getPoziciaStlpec() {
        return this.poziciaStlpec;
    }

    public int getPoziciaRiadok() {
        return this.poziciaRiadok;
    }
    
    public void posunSa(int riadok, int stlpec) {
        this.kruh.skry();
        this.kruh.posunZvisle((this.poziciaRiadok - riadok) * 20);
        this.kruh.posunVodorovne(-(this.poziciaStlpec - stlpec) * 20);
        this.kruh.zobraz();
        
        this.poziciaRiadok = riadok;
        this.poziciaStlpec = stlpec;
    }
} 
