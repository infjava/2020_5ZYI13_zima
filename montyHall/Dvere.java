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
    
    public boolean dajuSaOtvorit() {
        return !this.vyhra && !this.vybrateHracom;
    }
    
    public boolean dajuSaVybrat() {
        return !this.vybrateHracom && !this.otvorene;
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
    
    public boolean jeVyhra() {
        return this.vybrateHracom && this.vyhra;
    }
}
