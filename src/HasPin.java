public class HasPin implements ATMMachineState {

    ATMMachine atmMachine;

    public HasPin(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void InsertCard() {

        System.out.println("Card already inserted");

    }

    @Override
    public void ejectCard() {

        System.out.println("Card Ejected");
        atmMachine.setATMMachineState(atmMachine.noCard);

    }

    @Override
    public void insertPin(int pin) {

        System.out.println("Already entered");

    }

    @Override
    public void requestCash(int cash) {

        if ( cash > atmMachine.cashInMachine)   {
            System.out.println("to large amount");
            atmMachine.setATMMachineState(atmMachine.getNoCardState());
        } else {
            System.out.println("Cash withdrawn " + cash);
            atmMachine.setCashInMachine(atmMachine.cashInMachine - cash);
            atmMachine.setATMMachineState(atmMachine.getNoCardState());

            if (atmMachine.cashInMachine <= 0 ) {
                System.out.println("machine out of money");
                atmMachine.setATMMachineState(atmMachine.getNoCashState());
            }
        }


    }
}
