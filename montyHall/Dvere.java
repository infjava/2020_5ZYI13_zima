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
        if (this.otvorene) {
            return;
        }
        
        this.vybrateHracom = true;
    }
    
    public void zrusVyber() {
        this.vybrateHracom = false;
    }
    
    public void otvor() {
        if (this.vyhra) {
            return;
        }
        
        if (this.vybrateHracom) {
            return;
        }
        
        this.otvorene = true;
    }
}
