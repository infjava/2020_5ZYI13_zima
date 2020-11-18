public class Dvere {
    private boolean vyhra;
    private boolean otvorene;
    private boolean vybrateHracom;
    
    public Dvere(boolean vyhra) {
        this.vyhra = vyhra;
        this.otvorene = false;
        this.vybrateHracom = false;
    }
    
    public void vyber() {
        this.vybrateHracom = true;
    }
    
    public void zrusVyber() {
        this.vybrateHracom = false;
    }
}
