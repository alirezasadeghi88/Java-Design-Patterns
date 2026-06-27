public class SingletonEager {
    public static SingletonEager sc = new SingletonEager();
    private SingletonEager(){

    }

    public static SingletonEager getInstance(){
        return sc;
    }
}
