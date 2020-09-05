public interface ATMMachineState {

    void InsertCard();

    void ejectCard();

    void insertPin(int pin);

    void requestCash(int cash);

}
