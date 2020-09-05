public class ATMMachine implements ATMMachineState{

    ATMMachineState atmState;
    ATMMachineState hasCard;
    ATMMachineState hasPin;
    ATMMachineState noCard;
    ATMMachineState noCash;

    int cashInMachine = 2000;
    boolean correctPinEntered = false;

    public ATMMachine() {
        hasCard = new HasCard(this);
        hasPin = new HasPin(this);
        noCard = new NoCard(this);
        noCash = new NoCash(this);

        atmState = noCard;

        if (cashInMachine < 0 ) {
            atmState = noCash;
        }
    }

    void setATMMachineState(ATMMachineState atmMachineState)    {
        this.atmState = atmMachineState;
    }

    void setCashInMachine(int cashInMachine)    {
        this.cashInMachine = cashInMachine;
    }

    public void InsertCard() {
        atmState.InsertCard();
    }

    public void ejectCard()    {
        atmState.ejectCard();
    }

    public void insertPin(int pin) {
        atmState.insertPin(pin);
    }

    public void requestCash(int cash)  {
        atmState.requestCash(cash);
    }

    ATMMachineState getYesCardState()   {
        return hasCard;
    }

    ATMMachineState getNoCardState()    {
        return noCard;
    }

    ATMMachineState getHasPinState()    {
        return hasPin;
    }

    ATMMachineState getNoCashState()    {
        return noCash;
    }

}
