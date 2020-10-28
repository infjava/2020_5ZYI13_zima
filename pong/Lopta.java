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
        switch (this.smer) {
            case "PD":
                this.grafika.posunVodorovne(+10);
                this.grafika.posunZvisle(+10);
                break;
            case "LD":
                this.grafika.posunVodorovne(-10);
                this.grafika.posunZvisle(+10);
                break;
            case "PH":
                this.grafika.posunVodorovne(+10);
                this.grafika.posunZvisle(-10);
                break;
            case "LH":
                this.grafika.posunVodorovne(-10);
                this.grafika.posunZvisle(-10);
                break;
        }
    }
}
