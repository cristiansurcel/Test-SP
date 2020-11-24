public interface Element {
    void print();
    void accept(Visitor v);
}