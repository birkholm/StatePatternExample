public class NoCard implements ATMMachineState{

    ATMMachine atmMachine;

    public NoCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void InsertCard() {

        System.out.println("Card inserted, please enter pin");
        atmMachine.setATMMachineState(atmMachine.getYesCardState());

    }

    @Override
    public void ejectCard() {

        System.out.println("Insert a Card");
    }

    @Override
    public void insertPin(int pin) {

        System.out.println("Insert a Card");
    }

    @Override
    public void requestCash(int cash) {

        System.out.println("Insert a Card");
    }
}
