import javax.naming.Context;

public class SistOpIOS implements SistOpStrategy{
    public void render(Phone p, Context c) {
        System.out.println("@IOS:"+p.nume);
    }
}