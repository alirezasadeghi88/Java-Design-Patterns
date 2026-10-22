public class DisplayService {
    public void display(){
        XMLParser parser=getParser();
        String msg=parser.parse();
        System.out.println(msg);
    }

    protected XMLParser getParser() {
        return null;
    }
}
