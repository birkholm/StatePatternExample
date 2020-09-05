public class NoCash implements ATMMachineState {

    ATMMachine atmMachine;

    public NoCash(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void InsertCard() {

        System.out.println("we dont have any money");

    }

    @Override
    public void ejectCard() {

        System.out.println("we dont have any money");

    }

    @Override
    public void insertPin(int pin) {

        System.out.println("we dont have any money");

    }

    @Override
    public void requestCash(int cash) {

        System.out.println("we dont have any money");

    }
}
