import javax.naming.Context;

public class SistOpAndroid implements SistOpStrategy{
    public void render(Phone p, Context c) {
        System.out.println("@Android:"+p.nume);
    }
}