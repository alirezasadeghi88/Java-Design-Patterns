import java.io.ObjectStreamException;
import java.io.Serializable;

public class Singleton implements Serializable {
    private static final long serialVersionUID=-1093810940935189395L;
    private static Singleton sc=new Singleton();
    private Singleton(){
        if(sc!=null){
            throw new IllegalStateException("Alreadycreated.");
        }
    }
    public static Singleton getInstance(){
        return sc;
    }
    private Object readResolve() throws ObjectStreamException {
        return sc;
    }
    private Object writeReplace()throws ObjectStreamException{
        return sc;
    }
    public Object clone()throws CloneNotSupportedException{
        throw new CloneNotSupportedException("Singleton,cannotbeclonned");
    }
    private static Class getClass(String classname)throws ClassNotFoundException{
        Class LoaderclassLoader= Thread.currentThread().getContextClassLoader().getClass();
        ClassLoader classLoader = null;
        if(classLoader==null)
            classLoader=Singleton.class.getClassLoader();
        return(classLoader.loadClass(classname));
    }
}
