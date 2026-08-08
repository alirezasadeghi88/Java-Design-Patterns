import interfaces.Colleague;
import interfaces.MachineMediator;

public class Button implements Colleague {
    private MachineMediator mediator;

    @Override
    public void setMediator(MachineMediator mediator){
        this.mediator=mediator;
    }

    public void press(){
        System.out.println("Buttonpressed.");
        mediator.start();
    }
}