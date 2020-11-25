public class Kamen {
    private Kruh kruh;
    
    public Kamen(Sachovnica sachovnica) {
        this.kruh = new Kruh();
        this.kruh.zmenPriemer(18);
        this.kruh.posunVodorovne(-19 + (sachovnica.getSirka() - 1) * 20);
        this.kruh.posunZvisle(-59);
    }
    
    public void zobraz() {
        this.kruh.zobraz();
    }
    
    public void skry() {
        this.kruh.skry();
    }
}
