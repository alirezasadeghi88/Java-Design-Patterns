public class SingletonLazyMultithreaded {
    private static SingletonLazy Multithreadedsc=null;
    private SingletonLazyMultithreaded(){

    }

    public static synchronized SingletonLazyMultithreaded getInstance(){
        SingletonLazyMultithreaded sc = null;
        if(SingletonEager.sc==null){
            sc=new SingletonLazyMultithreaded();
        }
        return sc;
    }
}
