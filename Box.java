public class Box implements Element{
    String nume;
    public Box(String n) {
        nume=n;
    }
    public void print() {
        System.out.println("Cutia "+nume);
    }
    public void accept(Visitor v) {
        v.visit(this);
    }
}