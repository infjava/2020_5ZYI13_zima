public class HraciePole {
    private Lopta lopta;
    private Pad lavyPad;
    private Pad pravyPad;
    private Manazer manazer;
    private Skore laveSkore;
    private Skore praveSkore;
    
    public HraciePole() {
        this.lopta = new Lopta();
        this.lavyPad = new Pad(false);
        this.pravyPad = new Pad(true);
        this.laveSkore = new Skore();
        this.praveSkore = new Skore();
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
        
        if (this.lopta.jeMimoObrazovky()) {
            if (this.lopta.getStredX() <= 0) {
                this.praveSkore.zvys();
            } else if (this.lopta.getStredX() >= 300) {
                this.laveSkore.zvys();
            }
            
            this.lopta.umiestni();
        }
    }
    
    public void zrus() {
        System.exit(0);
    }
    
    public void spusti() {
        this.manazer.spravujObjekt(this);
    }
}
