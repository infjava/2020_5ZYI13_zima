public class Kamen {
    public Kamen(Sachovnica sachovnica) {
        Kruh kruh = new Kruh();
        kruh.zmenPriemer(18);
        kruh.posunVodorovne(-19 + (sachovnica.getSirka() - 1) * 20);
        kruh.posunZvisle(-59);
        kruh.zobraz();
    }
}
