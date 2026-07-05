import interfaces.Observer;
import interfaces.Subject;

public class SMSUser implements Observer {
    private final Subject subject;
    private String desc;
    private String userInfo;
}
