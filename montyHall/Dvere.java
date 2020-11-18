import java.util.Random;

public class Dvere {
    private boolean vyhra;
    private boolean otvorene;
    private boolean vybrateHracom;
    
    public Dvere() {
        Random nahodneCisla = new Random();
        this.vyhra = nahodneCisla.nextInt(3) == 0;
        this.otvorene = false;
        this.vybrateHracom = false;
    }
}
