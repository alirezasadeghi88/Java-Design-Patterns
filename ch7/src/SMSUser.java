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

    @Override
    public void update(String desc) {
        this.desc=desc;
        display();
    }

    private void display() {
        System.out.println("["+userInfo+"]:"+desc);
    }

    @Override
    public void subscribe() {
        System.out.println("Subscribing"+userInfo+"to"+subject.subjectDetails()+
                "...");
        this.subject.subscribeObserver((java.util.Observer) this);
        System.out.println("Subscribedsuccessfully.");
    }

    @Override
    public void unSubscribe() {
        System.out.println("Unsubscribing"+userInfo+"to"+subject.subjectDetails
        ()+"...");
        this.subject.unSubscribeObserver((java.util.Observer) this);
        System.out.println("Unsubscribedsuccessfully.");
    }
}
