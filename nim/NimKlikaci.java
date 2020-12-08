public class NimKlikaci {
    private Nim hra;
    private int vyska;
    
    public NimKlikaci(int sirka, int vyska, String menoPrveho, String menoDruheho) {
        this.hra = new Nim(sirka, vyska, menoPrveho, menoDruheho);
        
        this.vyska = vyska;
        
        new Manazer().spravujObjekt(this);
    }
    
    public void vyberSuradnice(int x, int y) {
        int riadok = this.vyska - y / 20;
        int stlpec = x / 20 + 1;
        
        int zmenaRiadku = this.hra.getPoziciaKamenaRiadok() - riadok;
        int zmenaStlpca = this.hra.getPoziciaKamenaStlpec() - stlpec;
        
        if (zmenaRiadku == 0) {
            this.hra.posunVlavo(zmenaStlpca);
        } else if (zmenaStlpca == 0) {
            this.hra.posunDole(zmenaRiadku);
        } else if (zmenaRiadku == zmenaStlpca) {
            this.hra.posunSikmo(zmenaRiadku);
        }
    }
}
