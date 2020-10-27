public class Lopta {
    private Kruh grafika;
    
    public Lopta() {
        this.grafika = new Kruh();
        
        this.grafika.zmenPriemer(10);
        
        this.grafika.posunVodorovne(125);
        this.grafika.posunZvisle(85);
        
        this.grafika.zobraz();
    }
}
