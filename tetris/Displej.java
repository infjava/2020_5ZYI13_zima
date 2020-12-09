public class Displej {
    private static Displej instancia = new Displej();
    
    private static final int VELKOST_PIXELU = 15;
    
    private static final int SIRKA = 10;
    private static final int VYSKA = 20;
    
    private Stvorec[][] pixely;
    
    private Displej() {
        this.pixely = new Stvorec[Displej.VYSKA][Displej.SIRKA];
        
        for (int y = 0; y < Displej.VYSKA; y++) {
            for (int x = 0; x < Displej.SIRKA; x++) {
                Stvorec pixel = new Stvorec();
                
                pixel.zmenStranu(Displej.VELKOST_PIXELU - 1);
                pixel.posunVodorovne(x * Displej.VELKOST_PIXELU - 60);
                pixel.posunZvisle(y * Displej.VELKOST_PIXELU - 50);
                pixel.zmenFarbu("black");
                pixel.zobraz();
                
                this.pixely[y][x] = pixel;
            }
        }
    }
    
    public static Displej getDisplej() {
        return Displej.instancia;
    }
    
    public void nastav(int x, int y, boolean svieti) {
        if (svieti) {
            this.pixely[y][x].zmenFarbu("red");
        } else {
            this.pixely[y][x].zmenFarbu("black");
        }
    }
}
