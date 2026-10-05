public class TextFileHandler implements Handler{
    private Handler handler;
    private String handlerName;

    public TextFileHandler(String handlerName){
        this.handlerName=handlerName;
    }

    @Override
    public void setHandler(Handler handler) {

    }

    @Override
    public void process(File file) {

    }

    @Override
    public String getHandlerName() {
        return "";
    }
}
