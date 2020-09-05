public class HasCard implements ATMMachineState {

    ATMMachine atmMachine;

    public HasCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void InsertCard() {

        System.out.println("You can insert more than one card");

    }

    @Override
    public void ejectCard() {

        System.out.println("Card ejected");
        atmMachine.setATMMachineState(atmMachine.getNoCardState());

    }

    @Override
    public void insertPin(int pin) {

        if ( pin == 1234)    {
            System.out.println("correct pin entered");
            atmMachine.correctPinEntered = true;
            atmMachine.setATMMachineState(atmMachine.getHasPinState());
        } else {
            System.out.println("wrong pin entered");
            atmMachine.correctPinEntered = false;
            System.out.println("Card ejected");
            atmMachine.setATMMachineState(atmMachine.getNoCardState());
        }
    }

    @Override
    public void requestCash(int cash) {

        System.out.println("Enter pin first");
    }
}
