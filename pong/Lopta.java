public class Lopta {
    private Kruh grafika;
    
    private int smerX;
    private int smerY;
    
    public Lopta() {
        this.grafika = new Kruh();
        
        this.grafika.zmenPriemer(10);
        
        this.grafika.posunVodorovne(125);
        this.grafika.posunZvisle(85);
        
        this.smerX = +1;
        this.smerY = +1;
        
        this.grafika.zobraz();
    }
    
    public void posun() {
        this.grafika.posunVodorovne(this.smerX);
        this.grafika.posunZvisle(this.smerY);
    }
}
