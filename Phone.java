public class Phone implements Element{
    String nume;
    int pret;
    SistOpStrategy so;
    public Phone(String n, int p){
        nume=n;
        pret=p;
    }
    public void setSOStrategy(SistOpStrategy x) {
        so = x;
    }
    public void print() {
        if(so==null) {
            System.out.println("Telefonul " + nume + " cu pretul " + pret+ " lei.");
        }
        else {
            so.render(this, null);
        }
    }
    public void accept(Visitor v) {
        v.visit(this);
    }
}