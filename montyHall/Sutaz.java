public class Sutaz {
    private Dvere[] dvere;
    
    public Sutaz() {
        this.dvere = new Dvere[3];
        for (int i = 0; i < 3; i++) {
            this.dvere[i] = new Dvere();
        }
    }
}
