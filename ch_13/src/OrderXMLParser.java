public class OrderXMLParser implements XMLParser{
    @Override
    public String parse(){
        System.out.println("Parsing orderXML...");
        return "OrderXMLMessage";
    }
}
