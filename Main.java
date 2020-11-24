public class Main {
    public static void main(String[] args){
        System.out.println("---Punctul a.----");
        Structura struct = new Structura();
        Box b1 = new Box("Telefoane");
        struct.add(b1);
        Phone p1 = new Phone("Samsung S1",1100);
        struct.add(p1);
        Phone p2 = new Phone("Iphone 7",1700);
        struct.add(p2);
        Phone p3 = new Phone("Nokia",600);
        struct.add(p3);
        Box b2 = new Box("Accesorii");
        struct.add(b2);
        Charger c1 = new Charger("MiniUSB",40);
        struct.add(c1);
        Charger c2 = new Charger("USB Tip C",70);
        struct.add(c2);
        Headphones h = new Headphones("Airpods",700);
        struct.add(h);
        struct.print();

        System.out.println("\n----Punctul b.----");
        p1.setSOStrategy(new SistOpAndroid());
        p2.setSOStrategy(new SistOpIOS());
        p3.setSOStrategy(new SistOpWP());
        struct.print();

        System.out.println("\n----Punctul c.----");
        PretTotal pret = new PretTotal();
        struct.accept(pret);
        pret.afisare();

    }
}