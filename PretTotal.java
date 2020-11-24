public class PretTotal implements Visitor{
    int phones=0;
    int chargers=0;
    int headphones=0;
    int nrBoxes=0;
    public void visit(Box b) {
        nrBoxes++;
    }
    public void visit(Charger c) {
        chargers=chargers+c.pret;
    }
    public void visit(Phone p) {
        phones=phones+p.pret;
    }
    public void visit(Headphones h) {
        headphones=headphones+h.pret;
    }
    public void afisare(){
        System.out.println("Pret total pe categoria telefoanelor: "+phones);
        System.out.println("Pret total pe categoria incarcatoarelor: "+chargers);
        System.out.println("Pret total pe categoria castilor: "+headphones);
    }
}