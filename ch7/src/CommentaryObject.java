import interfaces.Commentary;
import interfaces.Observer;
import interfaces.Subject;

import java.util.List;

public class CommentaryObject implements Subject, Commentary {
    private  final List<Observer> observers;
    private String desc;
    private final String subjectDetails;

    public CommentaryObject(List<Observer> observers, String subjectDetails) {
        this.observers = observers;
        this.subjectDetails = subjectDetails;
    }
}
