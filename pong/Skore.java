public class Skore {
    private int skore;
    private SegmentovaCislica cislica;
    
    public Skore(boolean pravyHrac) {
        this.skore = 0;
        if (pravyHrac) {
            this.cislica = new SegmentovaCislica(207, 0);
        } else {
            this.cislica = new SegmentovaCislica(57, 0);
        }
    }
    
    public void zvys() {
        this.skore++;
        this.cislica.zobraz(this.skore);
    }
}
