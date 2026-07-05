import interfaces.Observer;
import interfaces.Subject;

public class SMSUser implements Observer {
    private Subject subject;
    private String desc;
    private String userInfo;

    public void SMSUsers(Subject subject, String userInfo){
        if(subject==null){
            throw new IllegalArgumentException("NoPublisherfound.");
        }
        this.subject=subject;
        this.userInfo=userInfo;
    }
}
