import javax.naming.Context;

public class SistOpWP implements SistOpStrategy{
    public void render(Phone p, Context c) {
        System.out.println("@WP:"+p.nume);
    }
}