public class Headphones implements Element{
    String nume;
    int pret;
    public Headphones(String n, int p){
        nume=n;
        pret=p;
    }
    public void print() {
        System.out.println("Castile "+nume+" cu pretul "+pret+ " lei.");
    }
    public void accept(Visitor v) {
        v.visit(this);
    }
}