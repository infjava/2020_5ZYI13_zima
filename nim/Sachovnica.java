public class Sachovnica {
    public Sachovnica(int sirka, int vyska) {
        for (int riadok = 0; riadok < vyska; riadok++) {
            for (int stlpec = 0; stlpec < sirka; stlpec++) {
                Stvorec policko = new Stvorec();
                policko.zmenStranu(20);
                policko.posunVodorovne((sirka - stlpec - 1) * 20 - 60);
                policko.posunZvisle(riadok * 20 - 50);
                if ((riadok + stlpec) % 2 == 0) {
                    policko.zmenFarbu("black");
                } else {
                    policko.zmenFarbu("white");
                }
                policko.zobraz();
            }
        }
    }
}
