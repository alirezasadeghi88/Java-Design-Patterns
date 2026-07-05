import interfaces.Observer;
import interfaces.Subject;

import java.util.ArrayList;

public class TestObserver {
    public static void main(String[] args) {
        Subject subject=new CommentaryObject(new ArrayList<Observer>(),
                "Soccer Match[2014AUG24]");
        Observer observer=new SMSUser(subject, "AdamWarner[NewYork]");
    }
}
