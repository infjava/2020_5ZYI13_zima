public class Lopta {
    private Kruh grafika;
    
    private String smer;
    
    public Lopta() {
        this.grafika = new Kruh();
        
        this.grafika.zmenPriemer(10);
        
        this.grafika.posunVodorovne(125);
        this.grafika.posunZvisle(85);
        
        this.smer = "PD";
        
        this.grafika.zobraz();
    }
    
    public void posun() {
        if (this.smer.equals("PD")) {
            this.grafika.posunVodorovne(+10);
            this.grafika.posunZvisle(+10);
        } else if (this.smer.equals("LD")) {
            this.grafika.posunVodorovne(-10);
            this.grafika.posunZvisle(+10);
        } else if (this.smer.equals("PH")) {
            this.grafika.posunVodorovne(+10);
            this.grafika.posunZvisle(-10);
        } else if (this.smer.equals("LH")) {
            this.grafika.posunVodorovne(-10);
            this.grafika.posunZvisle(-10);
        }
    }
}
