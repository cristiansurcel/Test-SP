public interface Visitor {
    void visit(Box b);
    void visit(Charger c);
    void visit(Phone p);
    void visit(Headphones h);

}