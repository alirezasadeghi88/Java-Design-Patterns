public class DocFileHandler implements Handler{
    private Handler handler;
    private String handlerName;

    public DocFileHandler(String handlerName){
        this.handlerName=handlerName;
    }
}
