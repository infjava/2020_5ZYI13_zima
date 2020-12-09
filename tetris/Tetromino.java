public class Tetromino {
    private boolean[][] polickoSvieti;
    
    public Tetromino(boolean[][] polickoSvieti) {
        this.polickoSvieti = polickoSvieti;
    }
    
    public void nakresli() {
        for (int y = 0; y < this.polickoSvieti.length; y++) {
            for (int x = 0; x < this.polickoSvieti[y].length; x++) {
                Displej displej = Displej.getDisplej();
                displej.nastav(x, y, this.polickoSvieti[y][x]);
            }
        }
    }
}
