public class ErrorXMLParser implements XMLParser{
    @Override
    public String parse() {
        System.out.println("Parsing errorXML...");
        return "ErrorXMLMessage";
    }
}
