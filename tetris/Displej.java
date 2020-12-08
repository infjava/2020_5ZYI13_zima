public class Displej {
    private static final int VELKOST_PIXELU = 15;
    
    private static final int SIRKA = 10;
    private static final int VYSKA = 20;
    
    public Displej() {
        for (int y = 0; y < Displej.VYSKA; y++) {
            for (int x = 0; x < Displej.SIRKA; x++) {
                Stvorec pixel = new Stvorec();
                pixel.zmenStranu(Displej.VELKOST_PIXELU - 1);
                pixel.posunVodorovne(x * Displej.VELKOST_PIXELU - 60);
                pixel.posunZvisle(y * Displej.VELKOST_PIXELU - 50);
                pixel.zmenFarbu("black");
                pixel.zobraz();
            }
        }
    }
    
    public void nastav(int x, int y, boolean svieti) {
        
    }
}
