import java.io.Serializable;

public class Singleton implements Serializable {
    private static final long serialVersionUID=-1093810940935189395L;
    private static Singleton sc=new Singleton();
    private Singleton(){
        if(sc!=null){
            throw new IllegalStateException("Alreadycreated.");
        }

    }
}
