public class HraciePole {
    private Lopta lopta;
    private Pad lavyPad;
    private Pad pravyPad;
    private Manazer manazer;
    
    public HraciePole() {
        this.lopta = new Lopta();
        this.lavyPad = new Pad(false);
        this.pravyPad = new Pad(true);
        this.manazer = new Manazer();
    }
    
    public void posunDole() {
        this.pravyPad.posunDole();
    }
    
    public void posunHore() {
        this.pravyPad.posunHore();
    }
    
    public void posunVlavo() {
        this.lavyPad.posunHore();
    }
    
    public void posunVpravo() {
        this.lavyPad.posunDole();
    }
    
    public void tik() {
        this.lopta.posun();
        
        if (this.lavyPad.koliduje(this.lopta) || this.pravyPad.koliduje(this.lopta)) {
            this.lopta.odrazX();
        }
    }
    
    public void spusti() {
        this.manazer.spravujObjekt(this);
    }
}
