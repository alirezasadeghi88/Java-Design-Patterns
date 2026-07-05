import interfaces.Commentary;
import interfaces.Observer;
import interfaces.Subject;

import java.util.ArrayList;

public class TestObserver {
    public static void main(String[] args) {
        Subject subject=new CommentaryObject(new ArrayList<Observer>(),
                "Soccer Match[2014AUG24]");
        Observer observer=new SMSUser(subject, "AdamWarner[NewYork]");
        observer.subscribe();

        System.out.println();

        Observer observer2= new SMSUser(subject,"TimRonney[London]");
        observer2.subscribe();

        Commentary cObject= ((Commentary)subject);
        cObject.setDesc("WelcometoliveSoccermatch");
        cObject.setDesc("Currentscore0-0");

        System.out.println();

        observer2.unSubscribe();

        System.out.println();
    }
}
