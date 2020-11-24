import java.util.Vector;

public class Structura implements Visitee{
    Vector<Element> content=new Vector<Element>();
    public void add(Element elm){
        content.add(elm);
    }
    public void print() {
        for(Element i: content){
            i.print();
        }
    }
    public void accept(Visitor v) {
        for(Element elem:content)
            elem.accept(v);
    }
} 